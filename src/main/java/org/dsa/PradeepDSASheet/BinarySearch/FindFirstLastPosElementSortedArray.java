package org.dsa.PradeepDSASheet.BinarySearch;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FindFirstLastPosElementSortedArray {
    public static void main(String[] args) {

    }
    public static int[] searchRange(int[] nums, int target) {
        int first = findOccurrence(nums, target, true);
        if (first == -1)
            return new int[]{-1,-1};
        int last = findOccurrence(nums, target, false);
        return new int[]{first, last};
    }

    public static int findOccurrence(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1, result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                result = mid;
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid +1;
                }
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
