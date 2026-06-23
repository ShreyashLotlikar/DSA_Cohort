package org.dsa.PradeepDSASheet._4PrefixSum;

import java.util.HashMap;
// https://leetcode.com/problems/subarray-sum-equals-k/description/
public class SubarraySumEqualsK {
    public static void main(String[] args) {

        int []nums = {1,1,1};
        int k = 2;

        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        freq.put(0,1);
        int count = 0, s = 0;
        for (int num : arr) {
            s = s + num;
            if (freq.containsKey(s-k)) {
                count += freq.get(s-k);
            }
            freq.put(s, freq.getOrDefault(s, 0)+1);
        }
        return count;
    }
}
