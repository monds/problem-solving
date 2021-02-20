package com.monds.ps.hackerrank.warmup;

public class SimpleArraySum {
    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        int sum = 0;
        for (int n : ar) sum += n;
        return sum;
    }
}
