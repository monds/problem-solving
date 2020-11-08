package com.monds.ps.programmers;

import java.util.Stack;

public class CraneClawMachineGame {
    public int solution(int[][] board, int[] moves) {
        int[] temp = new int[board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (temp[i] == 0 && board[j][i] != 0) {
                    temp[i] = j;
                    break;
                }
            }
        }

        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            move -= 1;
            int target = temp[move];
            int doll = board[target][move];
            int match = 0;
            if (!stack.isEmpty() && stack.peek() == doll) {
                stack.pop();
                match++;
            }

            if (match > 0) {
                answer += match + 1;
            } else if (doll > 0) {
                stack.push(doll);
            }
            temp[move] = target + 1 == board.length ? 0 : target + 1;
        }

        return answer;
    }
}
