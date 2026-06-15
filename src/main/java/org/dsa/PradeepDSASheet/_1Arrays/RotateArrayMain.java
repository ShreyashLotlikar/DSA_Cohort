package org.dsa.PradeepDSASheet._1Arrays;
// https://leetcode.com/problems/rotate-array/description/
public class RotateArrayMain {
    public static void main(String[] args) {

        int []nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotateArray(nums, k);
        for (int n : nums)
            System.out.print(" " +n);
    }
    public static void rotateArray(int []arr, int k) {
        int n = arr.length;
        k = k % n;

        reverseArr(arr,0,n-1);
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,n-1);
    }
    private static void reverseArr(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
