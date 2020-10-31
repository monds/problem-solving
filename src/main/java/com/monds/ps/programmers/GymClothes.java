package com.monds.ps.programmers;

public class GymClothes {
    public int solution(int n, int[] lost, int[] reserve) {
        if (lost.length == 0) return n;

        int[] arr = new int[n];
        for (int l : lost) {
            arr[l - 1]--;
        }
        for (int r : reserve) {
            arr[r - 1]++;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == -1) {
                if (i > 0 && arr[i - 1] == 1) {
                    arr[i - 1]--;
                    arr[i] = 0;
                } else if (i + 1 < n && arr[i + 1] == 1) {
                    arr[i + 1]--;
                    arr[i] = 0;
                }
            }
            if (arr[i] >= 0) count++;
        }

        return count;
    }
}
