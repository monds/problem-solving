package com.monds.ps.programmers;

public class _12949 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int m = arr1[0].length;
        int n = arr2[0].length;
        int[][] answer = new int[arr1.length][n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < m; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }
        return answer;
    }
}
