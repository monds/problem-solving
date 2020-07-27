package com.monds.ps.leetcode;

import java.util.List;

/**
 * Created by suahn on 2020-07-27
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
