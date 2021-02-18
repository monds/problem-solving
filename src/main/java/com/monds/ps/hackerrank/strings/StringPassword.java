package com.monds.ps.hackerrank.strings;

import java.util.Arrays;

public class StringPassword {
    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int[] checks = new int[4];
        Arrays.fill(checks, 1);
        String sp = "!@#$%^&*()-+";

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) checks[0] = 0;
            if (Character.isLowerCase(ch)) checks[1] = 0;
            if (Character.isUpperCase(ch)) checks[2] = 0;
            if (sp.indexOf(ch) != -1) checks[3] = 0;
        }

        int sum = 0;
        for (int check : checks) {
            sum += check;
        }

        return Math.max(6 - password.length(), sum);
    }
}
