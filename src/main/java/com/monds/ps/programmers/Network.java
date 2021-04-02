package com.monds.ps.programmers;

public class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int len = computers.length;
        boolean[] visits = new boolean[len];
        for (int i = 0; i < len; i++) {
            if (visits[i]) continue;
            dfs(computers, visits, i, i);
            // 이어진 컴퓨터를 모두 찾고 1 증가
            answer++;
        }
        return answer;
    }

    private void dfs(int[][] computers, boolean[] visits, int from, int to) {
        // from에서 to로 연결되었다면...
        if (computers[from][to] == 1) {
            visits[to] = true;
            // 다른 컴퓨터로 이동 시도
            for (int i = 0; i < computers.length; i++) {
                if (visits[i]) continue;
                dfs(computers, visits, to, i);
            }
        }
    }
}
