package com.monds.ps.jfct.shortest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Telegram {
    private static class Node implements Comparable<Node> {
        private final int index;
        private final int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node o) {
            if (o.distance == distance) return o.index > index ? 1 : -1;
            return o.distance < distance ? 1 : -1;
        }
    }


    public static int[] solution(int n, int m, int c, int[][] map) {
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] ints : map) {
            graph.get(ints[0]).add(new Node(ints[1], ints[2]));
        }

        PriorityQueue<Node> queue = new PriorityQueue<>();
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[c] = 0;
        queue.offer(new Node(c, 0));
        while (!queue.isEmpty()) {
            Node now = queue.poll();
            if (dist[now.index] < now.distance) continue;
            for (Node node : graph.get(now.index)) {
                int cost = dist[now.index] + node.distance;
                if (cost < dist[node.index]) {
                    dist[node.index] = cost;
                    queue.offer(new Node(node.index, cost));
                }
            }
        }

        // 전보는 동시에 출발할 수 있다. 그러므로 최대 시간을 계산한다.
        int[] result = new int[2];
        int count = 0;
        int max = 0;
        for (int d : dist) {
            if (d != Integer.MAX_VALUE && d != 0) {
                count++;
                max = Math.max(max, d);
            }
        }

        result[0] = count;
        result[1] = max;

        return result;
    }
}
