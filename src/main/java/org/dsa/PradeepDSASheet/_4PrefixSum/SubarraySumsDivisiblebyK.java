package org.dsa.PradeepDSASheet._4PrefixSum;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/subarray-sums-divisible-by-k/
public class SubarraySumsDivisiblebyK {
    public static void main(String[] args) {
        int []nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums, k));

    }
    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> reminderCount = new HashMap<>();
        reminderCount.put(0,1); //empty prefix has sum 0

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            //Normalise remainder to always be non-negative (Java's % can return negatives)
            int rem = ((prefixSum % k) + k) % k;

            //If we've seen this remainder before, each occurence forms a valid subarray
            count += reminderCount.getOrDefault(rem, 0);

            reminderCount.put(rem, reminderCount.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}
