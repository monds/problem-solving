package com.monds.algorithm;

import java.util.function.Consumer;

public class Collections {

    public static void combination(int[] arr, int r, Consumer<boolean[]> consumer) {
        boolean[] visits = new boolean[arr.length];
        combinationHelper(arr, visits, arr.length, r, 0, consumer);
    }

    private static void combinationHelper(int[] arr, boolean[] visited, int n, int r, int start, Consumer<boolean[]> consumer) {
        if (r == 0) {
            consumer.accept(visited);
            return;
        }
        /*
            1, 2, 3으로 조합을 만들면
            1, 2
            1, 3
            2, 3
            이렇게 3개를 만들 수 있다.
            [1, 2], [1, 3]은 1을 시작으로 인덱스를 늘려서 재귀로 구해준다.
            인덱스를 증가시켜주기 때문에 중복이 없다.
         */
        for (int i = start; i < n; i++) {
            visited[i] = true;
            combinationHelper(arr, visited, n, r - 1, i + 1, consumer);
            visited[i] = false;
        }
    }

    public static void permutation(int[] arr, int r, Consumer<int[]> consumer) {
        int[] output = new int[r];
        boolean[] visited = new boolean[arr.length];
        permutationHelper(arr, output, visited, arr.length, r, 0, consumer);
    }

    private static void permutationHelper(int[] arr, int[] output, boolean[] visited, int n, int r, int depth, Consumer<int[]> consumer) {
        if (depth == r) {
            consumer.accept(output);
            return;
        }
        // 조합과 달리 순열은 모든 순서를 뽑기 위해 항상 0부터 시작한다.
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permutationHelper(arr, output, visited, n, r, depth + 1, consumer);
                visited[i] = false;
            }
        }
    }
}
