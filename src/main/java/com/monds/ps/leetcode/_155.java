package com.monds.ps.leetcode;

import java.util.Stack;

public class _155 {
    static class MinStack {
        /** initialize your data structure here. */
        private Stack<Integer> vStack = new Stack<>();
        private Stack<Integer> mStack = new Stack<>();

        public MinStack() {}

        public void push(int x) {
            vStack.push(x);
            if (mStack.size() > 0) {
                if (mStack.peek() >= x) {
                    mStack.push(x);
                }
            } else {
                mStack.push(x);
            }
        }

        public void pop() {
            int x = vStack.pop();
            if (mStack.size() > 0) {
                if (mStack.peek() == x) mStack.pop();
            }
        }

        public int top() {
            return vStack.peek();
        }

        public int getMin() {
            return mStack.peek();
        }
    }

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
