package org.dsa.PradeepDSASheet._1Arrays;
//
public class MissingPositive {
    public static void main(String[] args) {
        int []nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        for (int i=0;i<nums.length;i++) {
            int correctIndex = nums[i];
            while (correctIndex >= 0 && correctIndex < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
                correctIndex = nums[i] ;
            }
        }
        //above alf will place element at there correct position if possible
        for (int i=0;i<nums.length;i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
    private static void swap(int []nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
