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
     * Complete the 'getMinimumDifference' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY a
     *  2. STRING_ARRAY b
     */

    public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
    // Write your code here
        List<Integer> sol = new ArrayList<>(a.size());
        HashMap<Character, Integer> m;
        String sa, sb;
        Character c;
        int res;

        for (int i = 0; i < a.size(); ++i) {
            sa = a.get(i);
            sb = b.get(i);

            if (sa.length() != sb.length()) {
                sol.add(-1);
                continue;
            }

            m = new HashMap<>();

            for (int j = 0; j < sa.length(); ++j) {
                c = sa.charAt(j);
                m.put(c, m.getOrDefault(c, 0)+1);
            }

            for (int j = 0; j < sa.length(); ++j) {
                c = sb.charAt(j);
                m.put(c, m.getOrDefault(c, 0)-1);
            }

            res = 0;

            for (Integer j : m.values()) {
                res += Math.max(j, 0);
            }

            sol.add(res);
        }

        return sol;
    }

}

public class Solution {