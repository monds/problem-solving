package com.monds.ps.hackerrank.search;

import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {
    // Complete the whatFlavors function below.
    static int[] whatFlavors(int[] cost, int money) {
        int[] result = new int[2];
        Map<Integer, Integer> parlor = new HashMap<>();
        for(int i = 0; i < cost.length; i++) {
            if(cost[i] < money) {
                if(parlor.containsKey(money - cost[i])) {
                    result[0] = parlor.get(money - cost[i]) + 1;
                    result[1] = i + 1;
                    break;
                }

                if(!parlor.containsKey(cost[i])) parlor.put(cost[i], i);
            }
        }
        return result;
    }
}
