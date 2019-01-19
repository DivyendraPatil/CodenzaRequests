import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int newar[] = new int[a.length];
        int ipointer = 0;
        int resultarray[] = new int[queries.length];
        if (k > a.length) {
            k = k % a.length;
        }
        for(int i=0,j=k;j<a.length;i++,j++){
            newar[j]=a[i];
            ipointer++;
        }

        for (int i = 0; i < k; i++) {
            newar[i] = a[ipointer++];
        }

        for(int i=0;i<queries.length;i++){
            resultarray[i] = newar[queries[i]];
        }
        
        /*
        int newarr[] = new int[a.length];
        int shift = k;
        int stop = 0;

        for (int i = 0; shift < a.length; i++) {
            newarr[i] = a[shift];
            shift++;
            stop++;
        }

        for (int i = 0; i < k; i++) {
            newarr[stop++] = a[i];
        }
        */

        return resultarray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
