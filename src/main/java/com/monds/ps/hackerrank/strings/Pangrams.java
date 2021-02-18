package com.monds.ps.hackerrank.strings;

public class Pangrams {
    // Complete the pangrams function below.
    static String pangrams(String s) {
        int[] checks = new int[26];
        for (char ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                int base = Character.isUpperCase(ch) ? 'A' : 'a';
                checks[(ch - base) % 26] = 1;
            }
        }
        for (int check : checks) {
            if (check == 0) return "not pangram";
        }
        return "pangram";
    }
}
