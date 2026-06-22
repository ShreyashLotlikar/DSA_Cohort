package org.dsa.PradeepDSASheet._2TwoPointer;

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int []result = twoSum(nums, target);
        System.out.println(result[0]+"=="+result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
