package org.dsa.PradeepDSASheet._3SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        // 1. Normal case
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(
                12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50
        ));
        int m1 = 3;
        System.out.println("Test 1: " + findMinDiff(arr1, m1)); // Expected: 2
    }
    public static long findMinDiff(ArrayList<Integer> arr, int m) {
        // code here
        Collections.sort(arr);
        int n = arr.size();
        long res = Long.MAX_VALUE;
        for (int i=0;i<n-m+1;i++) {
            int minElement = arr.get(i);
            int maxElement = arr.get(i+m-1);
            res = Math.min(res, maxElement-minElement);
        }
        return  res;
    }
}
