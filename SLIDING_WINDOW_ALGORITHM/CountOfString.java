/*
Count Total Substrings
Input
abc
Output
6

Formula:

n * (n + 1) / 2 */

package SLIDING_WINDOW_ALGORITHM;

public class CountOfString {
    public static void main(String[] args) {
        String a = "abc";
        int n = a.length();
        int count = n * (n + 1) / 2;
        System.out.println(count);

    }
}
