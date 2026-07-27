package org.dsa.PradeepDSASheet.BinarySearch;
// https://leetcode.com/problems/find-peak-element/
//|| need to do with pencil ppr
public class FindPeakElement {
    public static void main(String[] args) {

        System.out.println(findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }
    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length-1;
        while (left < right) {
            int mid = left + (right-left)/2;
            if (nums[mid] < nums[mid+1])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
