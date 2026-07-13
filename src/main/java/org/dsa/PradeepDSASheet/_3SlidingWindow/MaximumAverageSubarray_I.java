package org.dsa.PradeepDSASheet._3SlidingWindow;
// Sliding Window - Fixed Size
// 643. Maximum Average Subarray I
//https://leetcode.com/problems/maximum-average-subarray-i/description/
public class MaximumAverageSubarray_I {
    public static void main(String[] args) {

    }
    public static double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for (int i=0;i<k;i++)
            windowSum += nums[i];

        int maxSum = windowSum;
        for (int i=k;i<nums.length;i++)
        {
            windowSum += nums[i] - nums[i-k];
            maxSum = Math.max(windowSum, maxSum);
        }

        return (double) maxSum / k;
    }
}
