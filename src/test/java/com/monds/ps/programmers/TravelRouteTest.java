package com.monds.ps.programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TravelRouteTest {

    private TravelRoute.Solution solution;

    @BeforeEach
    public void setUp() throws Exception {
        solution = new TravelRoute.Solution();
    }

    @Test
    public void test() {
        String[][] tickets1 = {{"ICN","JFK"},{"HND","IAD"},{"JFK","HND"}};
        assertThat(solution.solution(tickets1)).isEqualTo(new String[] {"ICN","JFK","HND","IAD"});

        String[][] tickets2 = new String[][] {{"ICN","SFO"},{"ICN","ATL"},{"SFO","ATL"},{"ATL","ICN"},{"ATL","SFO"}};
        assertThat(solution.solution(tickets2)).isEqualTo(new String[] {"ICN","ATL","ICN","SFO","ATL","SFO"});

        String[][] tickets3 = new String[][] {{"ICN","A"},{"A","B"},{"B","A"},{"A","ICN"},{"ICN","A"}};
        assertThat(solution.solution(tickets3)).isEqualTo(new String[] {"ICN","A","B","A","ICN","A"});

        String[][] tickets4 = new String[][] {{"ICN","A"},{"ICN","A"},{"A","ICN"}};
        assertThat(solution.solution(tickets4)).isEqualTo(new String[] {"ICN","A","ICN","A"});

        String[][] tickets5 = new String[][] {{"ICN","COO"},{"ICN","BOO"},{"COO","ICN"},{"BOO","DOO"}};
        assertThat(solution.solution(tickets5)).isEqualTo(new String[] {"ICN","COO","ICN","BOO","DOO"});
    }
}
