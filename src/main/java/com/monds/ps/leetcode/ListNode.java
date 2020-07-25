package com.monds.ps.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode fromArray(int[] arr) {
        ListNode list = new ListNode(arr[0]);
        ListNode index = list;
        for (int i = 1; i < arr.length; i++) {
            index.next = new ListNode(arr[i]);
            index = index.next;
        }
        return list;
    }

    public int[] toArray() {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = this;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
