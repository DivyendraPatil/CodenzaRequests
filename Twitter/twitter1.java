import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    // Complete the braces function below.
    static String[] braces(String[] values) {
        char c;
        String checkBraces;
        Stack<Character> builtUp;

        for (int i = 0; i < values.length; ++i) {
            checkBraces = values[i];
            builtUp = new Stack<>();

            for (int j = 0; j < checkBraces.length(); ++j) {
                c = checkBraces.charAt(j);
                switch(c) {
                    case '{' :
                        builtUp.push('}');
                        break;
                    case '[' :
                        builtUp.push(']');
                        break;
                    case '(' :
                        builtUp.push(')');
                        break;
                    default:
                        try {
                            if (builtUp.peek() == c) builtUp.pop();
                            else j = checkBraces.length();
                        } catch (EmptyStackException e) {
                            builtUp.push(c);
                            j = checkBraces.length();
                        }
                        break;
                }
            }

            values[i] = (builtUp.size() == 0) ? "YES" : "NO";
        }

        return values;
    }

    private static final Scanner scanner = new Scanner(System.in);