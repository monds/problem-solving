package com.monds.ps.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _72411 {

    private char[] src;
    private Map<String, Integer> map = new HashMap<>();
    private char[] temp;
    private int max;

    public String[] solution(String[] orders, int[] course) {
        boolean[] visited;

        List<String> result = new LinkedList<>();
        for (int i : course) {
            temp = new char[i];
            max = 0;
            for (String order : orders) {
                src = order.toCharArray();
                visited = new boolean[src.length];
                combination(visited, 0, src.length, i);
            }

            if (max > 1) {
                for (String s : map.keySet()) {
                    if (map.get(s) == max) {
                        result.add(s);
                    }
                }
            }

            map.clear();
        }
        Collections.sort(result);

        return result.toArray(new String[0]);
    }

    private void combination(boolean[] visited, int start, int len, int r) {
        if (r == 0) {
            int idx = 0;
            for (int i = 0; i < len; i++) {
                if (visited[i]) temp[idx++] = src[i];
            }
            Arrays.sort(temp);
            String s = new String(temp);
            map.put(s, map.getOrDefault(s, 0) + 1);
            max = Math.max(max, map.get(s));
            return;
        }
        for (int i = start; i < len; i++) {
            visited[i] = true;
            combination(visited, i + 1, len, r - 1);
            visited[i] = false;
        }
    }
}
