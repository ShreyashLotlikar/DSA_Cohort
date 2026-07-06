package org.dsa.journeywithpravallika.Day11_20;

public class MaxSumSubarrayOfSizeK {
    public static void main(String[] args) {

        int []nums = {2,1,5,1,3,2};
        int k = 3;
        // Brute Force
        System.out.println(maxSubarrayBrute(nums, k));

        //Optimal
        System.out.println(maxSubarray(nums, k));
    }
    static int maxSubarray(int []nums,int k) {
        int n = nums.length;
        int windowSum = 0;

        //1. Calculate sum of first window
        for (int i=0;i<k;i++)
            windowSum += nums[i];

        int maxSum = windowSum;
        //2. Slide the window
        for (int i=k;i<n;i++) {
            windowSum += nums[i]; //add new right
            windowSum -=nums[i-k]; //remove left;
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    static int maxSubarrayBrute(int []nums,int k) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0;i<=n-k;i++) {
            //sum of current window
            int sum = 0;
            for (int j=i;j<i+k;j++) {
                sum += nums[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
