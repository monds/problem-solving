package com.monds.ps.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class BiggestNumber {
    static class Solution {
        public String solution(int[] numbers) {
            List<Integer> list = new ArrayList<>(numbers.length);
            for (int number : numbers) {
                list.add(number);
            }
            list.sort((o1, o2) -> Integer.compare(Integer.parseInt("" + o2 + o1), Integer.parseInt("" + o1 + o2)));
            String answer = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

            if (answer.charAt(0) == '0') return "0";
            return answer;
        }
    }
}
