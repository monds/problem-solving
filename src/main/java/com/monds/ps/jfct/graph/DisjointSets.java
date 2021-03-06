package com.monds.ps.jfct.graph;

import java.util.Arrays;

public class DisjointSets {

    public static void solution(int n, int[][] map) {

        int[] parent = new int[n + 1];

        // 부모를 자기 자신으로 초기화
        for (int i = 1; i < n + 1; i++) {
            parent[i] = i;
        }

        // 부모 찾기
        for (int[] ints : map) {
            unionParent(parent, ints[0], ints[1]);
        }

        // 결과 출력
        System.out.print("각 원소가 속한 집합: ");
        for (int i = 1; i < n + 1; i++) {
            System.out.print(findParent(parent, i) + " ");
        }
        System.out.println();
        System.out.print("부모 테이블: " + Arrays.toString(parent));
    }

    private static int findParent(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = findParent(parent, parent[x]);
        }
        return parent[x];
    }

    private static void unionParent(int[] parent, int a, int b) {
        a = findParent(parent, a);
        b = findParent(parent, b);
        // 여기선 번호가 작은 원소가 부모 노드다.
        if (a < b) {
            parent[b] = a;
        } else {
            parent[a] = b;
        }
    }

    public static void main(String[] args) {
        int[][] map = {
            {1, 4},
            {2, 3},
            {2, 4},
            {5, 6}
        };
        DisjointSets.solution(6, map);
    }
}
