package com.monds.ps.jfct.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Curriculum {

    public static int[] solution(int v, String[] input) {
        Queue<Integer> queue = new LinkedList<>();
        int[] indegree = new int[v + 1];
        List<List<Integer>> nodes = new ArrayList<>();
        int[] time = new int[v + 1];
        int[] result = new int[v + 1];

        // 노드 정보 리스트
        for (int i = 0; i < v + 1; i++) {
            nodes.add(new ArrayList<>());
        }
        for (int j = 1; j < v + 1; j++) {
            String edge = input[j - 1];
            String[] parts = edge.split(" ");
            int t = Integer.parseInt(parts[0]);
            for (int i = 1; i < parts.length - 1; i++) {
                int prev = Integer.parseInt(parts[i]);
                nodes.get(prev).add(j);
                indegree[j]++;
            }
            time[j] = t;
            result[j] = t;
        }

        // 처음 시작 시 진입차수가 0인 노드를 큐에 삽입
        for (int i = 1; i < v + 1; i++) {
            if (indegree[i] == 0) queue.add(i);
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Integer idx : nodes.get(now)) {
                indegree[idx]--;
                result[idx] = Math.max(result[idx], result[now] + time[idx]);
                System.out.printf("[%d] = Math.max(%d, %d + %d)\n", result[idx], result[idx], result[now], time[idx]);
                if (indegree[idx] == 0) {
                    queue.add(idx);
                }
            }
        }

        System.out.println("[indegree] " + Arrays.toString(indegree));

        return result;
    }

    public static void main(String[] args) {
        String[] input = {
            "10 -1",
            "10 1 -1",
            "4 1 -1",
            "4 3 1 -1",
            "3 3 -1"
        };

        System.out.println(Arrays.toString(Curriculum.solution(5, input)));
    }
}
