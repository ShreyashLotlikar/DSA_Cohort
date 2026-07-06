package org.dsa.PradeepDSASheet._3SlidingWindow;
// https://leetcode.com/problems/max-consecutive-ones-iii/description/
public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int []nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
    public static int longestOnes(int[] nums, int k) {
        int i=0,j=0,len=0,zeroCount=0;
        while (j < nums.length) {
            if (nums[j] == 0)
                zeroCount++;

            while (i<=j && zeroCount > k) {
                if (nums[i] == 0)
                    zeroCount--;
                i++;
            }
            len = Math.max(len, j-i+1);
            j++;
        }
        return len;
    }
}
