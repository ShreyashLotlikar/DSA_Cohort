package org.dsa.PradeepDSASheet.BinarySearch;
// https://www.geeksforgeeks.org/problems/rotation4723/1
public class FindKthRotation {
    public static void main(String[] args) {

        System.out.println(new int[]{5, 1, 2, 3, 4});

    }
    public static int findKRotation(int arr[]) {
        // Code here
        int left = 0, right = arr.length-1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (arr[mid] <= arr[right])
                right = mid;
            else
                left = mid + 1;
        }
        //but it works correctly
        return left;
    }
}
