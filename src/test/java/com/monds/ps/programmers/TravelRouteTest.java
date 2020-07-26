package com.monds.ps.programmers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TravelRouteTest {

    private TravelRoute.Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new TravelRoute.Solution();
    }

    @Test
    public void test() {
        String[][] tickets1 = new String[][] {{"ICN","JFK"},{"HND","IAD"},{"JFK","HND"}};
        assertArrayEquals(solution.solution(tickets1), new String[] {"ICN","JFK","HND","IAD"});

        String[][] tickets2 = new String[][] {{"ICN","SFO"},{"ICN","ATL"},{"SFO","ATL"},{"ATL","ICN"},{"ATL","SFO"}};
        assertArrayEquals(solution.solution(tickets2), new String[] {"ICN","ATL","ICN","SFO","ATL","SFO"});

        String[][] tickets3 = new String[][] {{"ICN","A"},{"A","B"},{"B","A"},{"A","ICN"},{"ICN","A"}};
        assertArrayEquals(solution.solution(tickets3), new String[] {"ICN","A","B","A","ICN","A"});

        String[][] tickets4 = new String[][] {{"ICN","A"},{"ICN","A"},{"A","ICN"}};
        assertArrayEquals(solution.solution(tickets4), new String[] {"ICN","A","ICN","A"});

        String[][] tickets5 = new String[][] {{"ICN","COO"},{"ICN","BOO"},{"COO","ICN"},{"BOO","DOO"}};
        assertArrayEquals(solution.solution(tickets5), new String[] {"ICN","COO","ICN","BOO","DOO"});
    }
}