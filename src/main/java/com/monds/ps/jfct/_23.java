package com.monds.ps.jfct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] names = new String[n];
        int[][] scores = new int[n][4];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            names[i] = parts[0];
            scores[i][0] = i;
            for (int j = 1; j < 4; j++) {
                scores[i][j] = Integer.parseInt(parts[j]);
            }
        }

        Arrays.sort(scores, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                if (o1[2] == o2[2]) {
                    if (o1[3] == o2[3]) {
                        return names[o1[0]].compareTo(names[o2[0]]);
                    }
                    return Integer.compare(o2[3], o1[3]);
                }
                return Integer.compare(o1[2], o2[2]);
            }
            return Integer.compare(o2[1], o1[1]);
        });

        for (int i = 0; i < n; i++) {
            System.out.println(names[scores[i][0]]);
        }
    }
}
