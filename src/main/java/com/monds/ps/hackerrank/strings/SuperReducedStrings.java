package com.monds.ps.hackerrank.strings;

import java.util.Stack;

public class SuperReducedStrings {
    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(ch);
            } else {
                if (ch == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }

        if (stack.isEmpty()) {
            return "Empty String";
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
