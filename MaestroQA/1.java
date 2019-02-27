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
     * Complete the 'getMinimumUniqueSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int getMinimumUniqueSum(List<Integer> arr) {
    // Write your code here
        int[] num = new int[5001];
        int sum = 0;
        for (Integer n : arr) {
            while (num[n] != 0) ++n;
            ++num[n];
            sum += n;
        }

        return sum;
    }

}

public class Solution {