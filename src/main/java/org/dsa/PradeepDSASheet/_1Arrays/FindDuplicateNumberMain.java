package org.dsa.PradeepDSASheet._1Arrays;
// https://leetcode.com/problems/find-the-duplicate-number/
// using cyclic sort
public class FindDuplicateNumberMain {
    public static void main(String[] args) {
        int []nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            while (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
                correctIndex = nums[i] - 1;
            }

            if (nums[i] == nums[correctIndex] && i != correctIndex)
                return nums[i];
            i++;
        }
        return -1;
    }
    private static void swap(int []nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
