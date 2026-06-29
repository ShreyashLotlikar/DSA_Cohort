package org.dsa.PradeepDSASheet._4PrefixSum;

import java.util.HashMap;
import java.util.Map;
// https://leetcode.com/problems/continuous-subarray-sum/description/
public class ContinuousSubarraySum {
    public static void main(String[] args) {

        int[] nums1 = {23, 2, 4, 6, 7};
        System.out.println(checkSubarraySum(nums1, 6)); // true (2+4=6)

    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        // map :  remainder -> earliest index where this remainder occurred
        Map<Integer, Integer> remainderIndex = new HashMap<>();
        remainderIndex.put(0, -1); //handles subarrays starting at index 0

        int prefixSum = 0;
        for (int i=0;i<nums.length;i++)
        {
            prefixSum += nums[i];
            int remainder = prefixSum % k;

            if (remainderIndex.containsKey(remainder)) {
                // check if the subarray length is at least 2
                if (i - remainderIndex.get(remainder) > 1) {
                    return true;
                }
                // dont overwrite - we want the earliest index for max subarray
            } else {
                remainderIndex.put(remainder, i);
            }
        }
        return false;
    }
}
