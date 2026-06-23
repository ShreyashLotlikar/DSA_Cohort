package org.dsa.PradeepDSASheet._2TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/
public class threeSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // once the array is sorted
        // [-4,-1,-1,0,1,2]
        //           i,j   k
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k){
                 int total = nums[i]+nums[j]+nums[k];
                 if (total == 0) {
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while (j < k && nums[j] == nums[j+1]) j++;
                    while (j < k && nums[k] == nums[k-1]) k++;
                    j++;
                    k--;
                 } else if (total < 0) {
                     j++;
                 } else {
                     k--;
                 }
            }
        }
        return ans;
    }
}
