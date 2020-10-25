package com.monds.ps.programmers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPrimeNumber {
    static class Solution {

        private final Set<String> set = new HashSet<>();
        private int count;

        public int solution(String numbers) {
            count = 0;
            int len = numbers.length();
            List<Character> arr = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                arr.add(numbers.charAt(i));
            }

            List<Character> result = new ArrayList<>();
            for (int i = 1; i <= len; i++) {
                reculsion(arr, result, arr.size(), i);
            }


            return count;
        }

        private boolean isPrime(int n) {
            if (n == 2) return true;
            if (n == 1 || n % 2 == 0) return false;
            int sqrt = (int) Math.sqrt(n);
            for (int i = 3; i <= sqrt; i += 2) {
                if (n % i == 0) return false;
            }
            return true;
        }

        private void reculsion(List<Character> arr, List<Character> result, int n, int r) {
            if (r == 0) {
                if (result.get(0) == '0') return;

                StringBuilder sb = new StringBuilder();
                for (Character ch : result) {
                    sb.append(ch);
                }

                String str = sb.toString();
                if (set.contains(str)) return;
                set.add(str);

                if (isPrime(Integer.parseInt(str))) {
                    count++;
                }

                return;
            }

            for (int i = 0; i < n; i++) {
                result.add(arr.remove(i));
                reculsion(arr, result, n - 1, r - 1);
                arr.add(i, result.remove(result.size() - 1));
            }
        }
    }
}
