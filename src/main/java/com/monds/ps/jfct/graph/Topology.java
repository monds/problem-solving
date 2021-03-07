package com.monds.ps.jfct.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Topology {

    private static class Node {
        private final int index;

        private Node(int index) {
            this.index = index;
        }
    }

    public static int[] solution(int v, int[][] edges) {
        Queue<Integer> queue = new LinkedList<>();
        int[] indegree = new int[v + 1];
        List<List<Node>> nodes = new ArrayList<>();

        // 노드 정보 리스트
        for (int i = 0; i < v + 1; i++) {
            nodes.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            nodes.get(edge[0]).add(new Node(edge[1]));
        }

        // 진입차수 계산
        for (int[] edge : edges) {
            indegree[edge[1]]++;
        }

        // 처음 시작 시 진입차수가 0인 노드를 큐에 삽입
        for (int i = 1; i < v + 1; i++) {
            if (indegree[i] == 0) queue.add(i);
        }

        int[] result = new int[v];
        int index = 0;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            result[index] = now;
            for (Node node : nodes.get(now)) {
                indegree[node.index]--;
                if (indegree[node.index] == 0) {
                    queue.add(node.index);
                }
            }
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] edges = {
            {1, 2},
            {1, 5},
            {2, 3},
            {2, 6},
            {3, 4},
            {4, 7},
            {5, 6},
            {6, 4}
        };

        System.out.println(Arrays.toString(Topology.solution(7, edges)));
    }
}
