package com.monds.ps.hackerrank.strings;

import java.util.LinkedList;
import java.util.Queue;

public class HackerRankInAString {
    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        Queue<Character> queue = new LinkedList<>();
        for (char ch : "hackerrank".toCharArray()) {
            queue.add(ch);
        }
        for (char ch : s.toCharArray()) {
            if (queue.isEmpty()) return "YES";
            if (ch == queue.peek()) {
                queue.poll();
            }
        }
        return queue.isEmpty() ? "YES" : "NO";
    }
}
