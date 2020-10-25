package com.monds.ps.programmers;

import java.util.*;

public class ConvertWord {

    private int min;

    public int solution(String begin, String target, String[] words) {
        min = 0;
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        dfs(begin, target, wordList, new boolean[words.length], 0);
        return min;
    }

    private boolean diffOneChar(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (count > 1) return false;
            if (str1.charAt(i) != str2.charAt(i)) count++;
        }
        return count <= 1;
    }

    private void dfs(String begin, String target, List<String> words, boolean[] visit, int count) {
        if (begin.equals(target)) {
            if (min > 0) min = Math.min(min, count);
            else min = count;
            return;
        }

        for (int i = 0; i < words.size(); i++) {
            if (visit[i]) continue;
            String word = words.get(i);
            visit[i] = true;
            if (diffOneChar(begin, word)) {
                dfs(word, target, words, visit, count + 1);
            }
            visit[i] = false;
        }
    }
}
