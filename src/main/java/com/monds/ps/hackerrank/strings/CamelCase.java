package com.monds.ps.hackerrank.strings;

public class CamelCase {
    // Complete the camelcase function below.
    static int camelcase(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) count++;
        }
        return count + 1;
    }
}
