package org.dsa.journeywithpravallika.Day11_20;
// https://leetcode.com/problems/minimum-size-subarray-sum/
public class MinSizeSubarraySumTarget {
    public static void main(String[] args) {
        int target = 7;
        int []nums = {2,3,1,2,4,3};
        // Brute Force
        System.out.println(minSubArrayLenBrute(target, nums));
        // optimal approach
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right=0;right<nums.length;right++) {
            sum += nums[right];
            while (sum >= target) {
                minLength = Math.min(minLength, right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
    public static int minSubArrayLenBrute(int target, int[] nums) {
        int n = nums.length;
        int ans = n + 1;
        for (int i=0;i<n;i++) {
            int sum = 0;
            for (int j=i;j<n;j++) {
                sum += nums[j];
                if (sum >= target) {
                    ans = Math.min(ans, j-i+1);
                    break;
                }
            }
        }
        return (ans == n+1 )? 0:ans;
    }
}
