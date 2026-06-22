package org.dsa.PradeepDSASheet._1Arrays;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {

        int []nums = {4,3,2,7,8,2,3,1};
        List<Integer> result = findDuplicates(nums);
        result.forEach(System.out::println);

    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            int abs = Math.abs(nums[i])-1;

            if (nums[abs] < 0)
                ans.add(Math.abs(nums[i]));
            else
                nums[abs]*=-1;
        }
        return ans;
    }
}
