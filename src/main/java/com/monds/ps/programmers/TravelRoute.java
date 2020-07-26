package com.monds.ps.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TravelRoute {
    static class Solution {

        private static class Ticket {
            String loc;
            ArrayList<String> list;

            public Ticket(String loc) {
                this.loc = loc;
            }

            public void add(String ticket) {
                if (list == null) list = new ArrayList<>();
                list.add(ticket);
            }

            public int nextSize() {
                if (list == null) return 0;
                return list.size();
            }
        }

        private List<String> paths;
        private int max;

        public String[] solution(String[][] tickets) {
            paths = new ArrayList<>();
            max = tickets.length + 1;
            HashMap<String, Ticket> map = new HashMap<>();
            for (String[] ticket : tickets) {
                Ticket value = map.computeIfAbsent(ticket[0], k -> new Ticket(ticket[0]));
                value.add(ticket[1]);
                map.computeIfAbsent(ticket[1], k -> new Ticket(ticket[1]));
            }

            findNextTicket(map, map.get("ICN"), "", 1);
            Collections.sort(paths);
            return paths.get(0).split(",");
        }

        private void findNextTicket(HashMap<String, Ticket> map, Ticket ticket, String path, int count) {
            String newPath = path.equals("") ? ticket.loc : path + "," + ticket.loc;
            if (count == max) {
                paths.add(newPath);
                return;
            }
            if (ticket.nextSize() > 0) {
                for (String s : ticket.list) {
                    findNextTicket(map, map.get(s), newPath, count + 1);
                }
            }
        }

    }
}
