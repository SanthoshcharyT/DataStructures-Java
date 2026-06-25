
/*Question 2 (Arrays_and_Hashing.ValidAnagrams.java)

Problem Statement:
Write a program to check whether two strings are anagrams of each other.

Two strings are anagrams if they contain the same characters in the same frequency, but possibly in a different order.

Example:

Input: s = "racecar", t = "carrace"
Output: true

Input: s = "hello", t = "world"
Output: false*/

import java.util.Arrays;

public class ValidAnagrams {
    public static void main(String[] args) {
        String s = "hyderabad";
        String t = "badhydera";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a, b);

        System.out.println(result);
    }
}