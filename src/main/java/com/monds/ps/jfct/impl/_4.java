package com.monds.ps.jfct.impl;

import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // 맵 크기 지정
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        // 캐릭터 위치 및 방향 지정
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int direct = scanner.nextInt();
//        // 맵 초기화
//        int[][] map = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                map[i][j] = scanner.nextInt();
//            }
//        }
        int n = 4;
        int m = 4;
        int x = 1;
        int y = 1;
        int direct = 0;
        int[][] map = {{1,1,1,1}, {1,0,0,1}, {1,1,0,1}, {1,1,1,1}};

        gameDevelopment(n, m, x, y, direct, map);
    }

    public static void gameDevelopment(int n, int m, int x, int y, int direct, int[][] map) {
        // 방향맵 초기화
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        // 결과 계산 (초기화 시 이미 한 칸은 방문한 상태)
        int result = 1;
        int turnCount = 0;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.arraycopy(map[i], 0, dp[i], 0, m);
        }
        dp[x][y] = 1;
        int nx;
        int ny;

        while (true) {
            // 왼쪽으로 이동
            direct = direct == 0 ? 3 : direct - 1;
            nx = x + dx[direct];
            ny = y + dy[direct];

            if (dp[nx][ny] == 0 && map[nx][ny] == 0) {
                dp[nx][ny] = 1;
                result++;
                x = nx;
                y = ny;
                turnCount = 0;
                continue;
            } else {
                turnCount++;
            }

            if (turnCount == 4) {
                nx = x - dx[direct];
                ny = y - dy[direct];
                if (map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    break;
                }
                turnCount = 0;
            }
        }

        System.out.print(result);
    }
}
