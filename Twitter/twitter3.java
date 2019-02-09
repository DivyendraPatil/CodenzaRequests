import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'countMatches' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY grid1
     *  2. STRING_ARRAY grid2
     */

    public static int countMatches(List<String> grid1, List<String> grid2) {
        int same_region_count = 0;

        // making list of regions in grid 1
        List<Region> regions_in_grid1 = listOfRegions(grid1);

        // making list of regions in grid 2
        List<Region> regions_in_grid2 = listOfRegions(grid2);

        // count similar regions in both grids

        for (Region rg1: regions_in_grid1) {
            for (int i = 0; i < regions_in_grid2.size(); ++i) {
                if (rg1.compare(regions_in_grid2.get(i))) {
                    ++same_region_count;
                    regions_in_grid2.remove(i);
                    break;
                }
            }
        }

        return same_region_count;
    }

    public static List<Region> listOfRegions(List<String> grid1) {
        List<Region> regions_in_grid1 = new ArrayList<>();

        Map<String, Region> last_row_regions = null;
        Map<String, Region> this_row_regions;
        Region last_region = null;
        Region upper_region = null;
        char c;
        String p, pp;

        long region_id = 0;
        int row = 0;

        for (String g: grid1) {
            this_row_regions = new HashMap();

            for (int i = 0; i < g.length(); ++i) {
                c = g.charAt(i);
                if (c == '1') {
                    p = row + ":" + i;
                    pp = (row-1) + ":" + i;
                    if (null != last_row_regions) {
                        // Check with previous row to add to same region
                        upper_region = last_row_regions.get(pp);
                        if (null == last_region) {
                            if (upper_region == null) {
                                last_region = new Region(region_id++);
                                regions_in_grid1.add(last_region);
                            }
                            else {
                                last_region = upper_region;
                            }
                        } else if (upper_region != null && last_region.id != upper_region.id) {
                            // include all last_region and remove it if not same
                            upper_region.cells.addAll(last_region.cells);
                            for (String lp : last_region.cells) {
                                this_row_regions.put(lp, upper_region);
                            }
                            regions_in_grid1.remove(last_region);
                            last_region = upper_region;
                        }
                    } else {
                        if (last_region == null) {
                            last_region = new Region(region_id++);
                            regions_in_grid1.add(last_region);
                        }
                    }
                    last_region.cells.add(p);
                    this_row_regions.put(p, last_region);
                } else {
                    last_region = null;
                }
            }

            last_region = null;
            last_row_regions = this_row_regions;
            ++row;
        }

        return regions_in_grid1;
    }
}

class Region {
    Set<String> cells;
    long id;

    private Region() {
        cells = new HashSet<>();
        id = 0;
    }

    Region(long i) {
        this();
        id = i;
    }

    public boolean compare(Region other) {
        if (cells.size() == other.cells.size())
            return cells.containsAll(other.cells);
        return false;
    }
}

public class Solution {