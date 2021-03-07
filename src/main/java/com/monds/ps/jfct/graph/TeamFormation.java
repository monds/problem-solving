package com.monds.ps.jfct.graph;

public class TeamFormation {

    private static int findParent(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = findParent(parent, parent[x]);
        }
        return parent[x];
    }

    private static void unionParent(int[] parent, int a, int b) {
        a = findParent(parent, a);
        b = findParent(parent, b);
        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    public static void solution(int n, int[][] input) {
        // 초기값 설정
        int[] parent = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            parent[i] = i;
        }

        for (int[] ints : input) {
            int a = ints[1];
            int b = ints[2];
            // 팀 합치기
            if (ints[0] == 0) {
                unionParent(parent, a, b);
            } else if (ints[0] == 1) {
                // 같은 팀 여부 확인
                if (findParent(parent, a) == findParent(parent, b)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] input = {
            {0, 1, 3},
            {1, 1, 7},
            {0, 7, 6},
            {1, 7, 1},
            {0, 3, 7},
            {0, 4, 2},
            {0, 1, 1},
            {1, 1, 1}
        };

        TeamFormation.solution(7, input);
    }
}
