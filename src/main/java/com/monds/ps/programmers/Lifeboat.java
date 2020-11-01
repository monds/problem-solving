package com.monds.ps.programmers;

import java.util.Arrays;

/**
 * Created by monds on 2020-11-01
 */
public class Lifeboat {
    public int solution(int[] people, int limit) {
        int len = people.length;
        if (len <= 1) return len;

        Arrays.sort(people);
        boolean[] rescue = new boolean[len];

        int answer = 0;
        int curr = 0;
        outer:
        for (int i = 0, last = len - 1; i <= last; i++) {
            if (!rescue[i]) {
                curr = people[i];
                rescue[i] = true;
                while (last > i) {
                    if (!rescue[last]) {
                        answer++;
                        rescue[last] = true;
                        if (people[last] + curr <= limit) {
                            curr = 0;
                            last--;
                            continue outer;
                        }
                    }
                    last--;
                }
            }
        }

        if (curr > 0) answer++;

        return answer;
    }
}
