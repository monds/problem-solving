package com.monds.ps.programmers;

import java.util.Stack;

public class _42883 {
    public String solution(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (char c : number.toCharArray()) {
            // 스택에 있는 숫자보다 더 큰 숫자가 들어오면 스택에 있는 값을 제거해야 하는데
            // 만약 더 이상 뺄 수 없는 상황이라면 (k 값으로 체크) 빼지 않고 그냥 넣는다.
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = stack.get(i);
        }

        return new String(result);
    }
}
