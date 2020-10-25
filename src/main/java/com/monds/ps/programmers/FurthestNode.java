package com.monds.ps.programmers;

import java.util.LinkedList;
import java.util.Queue;

public class FurthestNode {
    public int solution(int n, int[][] edge) {
        if (n == 0) return 0;
        int[] dist = new int[n + 1];
        boolean[][] graph = new boolean[n + 1][n + 1];
        for (int[] arr : edge) {
            graph[arr[0]][arr[1]] = true;
            graph[arr[1]][arr[0]] = true;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);

        int max = 0;
        while (!queue.isEmpty()) {
            Integer num = queue.poll();
            for (int i = 2; i <= n; i++) {
                if (dist[i] == 0 && graph[num][i]) {
                    dist[i] = dist[num] + 1;
                    queue.add(i);
                    max = Math.max(max, dist[i]);
                }
            }
        }

        int count = 0;
        for (int d : dist) {
            if (d == max) count++;
        }

        return count;
    }
}
