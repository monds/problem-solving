package com.monds.ps.hackerrank.strings;

public class CaesarCipher {
    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = shift(chars[i], k);
        }
        return new String(chars);
    }

    private static char shift(char c, int k) {
        if (!Character.isAlphabetic(c)) return c;
        int base = Character.isLowerCase(c) ? 'a' : 'A';
        return (char)((c + k - base) % 26 + base);
    }
}
