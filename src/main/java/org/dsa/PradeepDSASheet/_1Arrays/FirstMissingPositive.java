package org.dsa.PradeepDSASheet._1Arrays;
// https://leetcode.com/problems/first-missing-positive/description/
public class FirstMissingPositive {
    public static void main(String[] args) {

        int []nums = {1,2,0};
        System.out.println(firstMissingPositive(nums));

    }
    public static int firstMissingPositive(int[] nums) {
        if (nums.length == 1){
            if (nums[0] == 1)
                return 2;
            else
                return 1;
        }
        for (int i=0;i<nums.length;i++) {
            int correctIndex = nums[i]-1;
            while (correctIndex < nums.length && correctIndex >= 0 && nums[i] != nums[correctIndex]) {
                //swap
                swapNum(nums, i, correctIndex);
                correctIndex = nums[i]-1;
            }
        }
        for (int i=0;i<nums.length;i++) {
            if (i != nums[i]-1)
                return i+1;
        }
        return nums.length+1;
    }
    private static void swapNum(int []nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
