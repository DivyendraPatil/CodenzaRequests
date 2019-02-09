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

    public static List<String> missingWords(String s, String t) {
        String[] s_words = s.split(" ");
        String[] t_words = t.split(" ");

        List<String> missing_words = new ArrayList<>(s_words.length - t_words.length);
        int i = 0;

        for (String word : s_words) {
            if (i < t_words.length && word.equals(t_words[i])) {
                ++i;
            } else {
                missing_words.add(word);
            }
        }

        return missing_words;
    }
}

public class Solution {