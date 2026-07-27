package org.dsa.PradeepDSASheet.BinarySearch;
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/ || this code is also good
// https://youtu.be/aFN2LrKg6i0
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

        System.out.println(search(new int[]{4,5,6,7,0,1,2},0));

        System.out.println(search(new int[]{4,5,6,7,0,1,2},3));

        System.out.println(search(new int[]{1},0));
    }
    public static int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right-left)/2;

            if (nums[mid] == target) return mid;

            //left is sorted num[left...mid]
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target <= nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                //right is sorted num[left...mid]
                if (nums[mid] <= target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;

            }
        }
        return -1;
    }
}
