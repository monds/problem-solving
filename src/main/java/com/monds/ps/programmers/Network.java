package com.monds.ps.programmers;

import java.util.HashMap;
import java.util.Map;

public class Network {
    public int solution(int n, int[][] computers) {
        int count = 0;
        boolean[] visit = new boolean[computers.length];
        for (int i = 0; i < computers.length; i++) {
            if (visit[i]) continue;
            dfs(computers, visit, i, i);
            count++;
        }
        return count;
    }

    private void dfs(int[][] computers, boolean[] visit, int from, int to) {
        if (computers[from][to] == 1) {
            visit[to] = true;
            for (int i = 0; i < computers.length; i++) {
                if (visit[i]) continue;
                dfs(computers, visit, to, i);
            }
        }
    }
}
