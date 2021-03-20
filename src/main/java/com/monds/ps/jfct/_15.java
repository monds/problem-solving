package com.monds.ps.jfct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class _15 {
    public static void solution(int n, int m, int k, int x, int[][] graph) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] ints : graph) {
            List<Integer> list = map.computeIfAbsent(ints[0], i -> new ArrayList<>());
            list.add(ints[1]);
        }

        // 1번 도시에서 출발하여 각 도시까지의 최단거리
        int[] dist = new int[n + 1];
        Arrays.fill(dist, -1);
        dist[1] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while (!queue.isEmpty()) {
            Integer now = queue.poll();
            List<Integer> list = map.get(now);
            if (list == null) continue;
            for (Integer i : list) {
                if (dist[i] == -1) {
                    dist[i] = dist[now] + 1; // 이전 도시까지의 최단 거리 + 1 이 현재 노드까지의 최단 거리다!
                    queue.add(i);
                }
            }
        }

        boolean check = false;
        for (int i = 1; i < n + 1; i++) {
            if (dist[i] == k) {
                System.out.print(i);
                check = true;
            }
        }

        if (!check) {
            System.out.print(-1);
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
            {1, 2}, {1, 3}, {2, 3}, {2, 4}
        };

        _15.solution(4, 4, 2, 1, graph);
    }
}
