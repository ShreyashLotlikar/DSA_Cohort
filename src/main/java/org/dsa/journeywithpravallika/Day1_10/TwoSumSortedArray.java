package org.dsa.journeywithpravallika.Day1_10;

public class TwoSumSortedArray {
    public static void main(String[] args) {

        int []nums = {1,2,3,4,5,6,7,8,9};
        int []result = twoSumSorted(nums,11);
        System.out.println(result[0]+"=="+result[1]);
    }
    public static int[] twoSumSorted(int []nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target)
                return new int[]{left,right};
            if (sum < target)
                left++;
            else
                right--;
        }
        return null;
    }
}
