package org.dsa.Week2;

import java.util.Arrays;

// Class-3 (13-June-26) Sat
public class  CyclicSort {
    public static void sort(int[] nums) {
        for (int i=0;i<nums.length;i++)
        {
            int correctIndex = nums[i] - 1;
            while (correctIndex >=0 && correctIndex < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
                correctIndex = nums[i] - 1;
            }
        }
    }
    private static void swap(int []nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int []nums = {4,1,5,4,2};
        sort(nums);

        System.out.println(Arrays.toString(nums));

        // Missing Number
    }
}
