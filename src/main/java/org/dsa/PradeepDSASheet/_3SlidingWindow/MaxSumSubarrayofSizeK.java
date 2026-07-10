package org.dsa.PradeepDSASheet._3SlidingWindow;
//https://youtu.be/rGl2Z6fuAas
// https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class MaxSumSubarrayofSizeK {
    public static void main(String[] args) {

        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(maxSubarray(arr, k));

    }
    static int maxSubarray(int []nums,int k) {
        int windowSum = 0;

        //1. Calculate the window sum
        for (int i=0;i<k;i++)
            windowSum += nums[i];

        int maxSum = windowSum;
        //2. Slide the window
        for (int i=k;i<nums.length;i++) {
            windowSum += nums[i];
            windowSum -= nums[i-k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}
