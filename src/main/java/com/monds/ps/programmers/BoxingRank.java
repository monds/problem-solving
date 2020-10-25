package com.monds.ps.programmers;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class BoxingRank {
    private static class Node {
        private int n;
        private final Map<Node, Boolean> winners = new ConcurrentHashMap<>();
        private final Map<Node, Boolean> losers = new ConcurrentHashMap<>();

        public Node(int n) {
            this.n = n;
        }
        public void addWinners(Node node) {
            winners.put(node, true);
        }
        public void addLosers(Node node) {
            losers.put(node, true);
        }
        public int winnerSize() {
            return winners.size();
        }
        public int losersSize() {
            return losers.size();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return n == node.n;
        }

        @Override
        public int hashCode() {
            return Objects.hash(n);
        }
    }

    public int solution(int n, int[][] results) {
        if (n == 1) return 0;
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node(i));
        }

        for (int[] result : results) {
            Node winner = nodes.get(result[0] - 1);
            Node loser = nodes.get(result[1] - 1);
            winner.addLosers(loser);
            loser.addWinners(winner);
        }

        for (Node node : nodes) {
            dfs(node, node, 0, new HashSet<>());
        }

        int count = 0;
        for (Node node : nodes) {
            if (node.winnerSize() + node.losersSize() == n - 1) {
                count++;
            }
        }

        return count;
    }

    private void dfs(Node start, Node curr, int dist, Set<Integer> set) {
        set.add(start.n);
        if (curr.winnerSize() == 0) return;
        Iterator<Node> iterator = curr.winners.keySet().iterator();
        while (iterator.hasNext()) {
            Node winner = iterator.next();
            if (dist >= 1) {
                start.winners.putIfAbsent(winner, true);
                winner.addLosers(start);
            }
            if (!set.contains(winner.n)) {
                set.add(winner.n);
                dfs(start, winner, dist + 1, set);
            }
        }
    }
}
