package org.dsa.PradeepDSASheet.BinarySearch;

// https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1
// https://youtu.be/jkqDSR_PUDs || do in pen and ppr
public class CeilInASortedArray {
    public static void main(String[] args) {

//        int arr[] = {1, 2, 8, 10, 11, 12, 19};
//        System.out.println(findCeil(arr, 5));

        int arr[] = {1, 2, 8, 10, 11, 12, 19};
        System.out.println(findCeil(arr, 20));
    }
    public static int findCeil(int[] arr, int x) {
        // code here
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= x) {
                ans = mid;        // candidate ceiling, but look for a smaller one
                right = mid - 1;
            } else {
                left = mid + 1;   // arr[mid] too small, ceiling must be to the right
            }
        }
        return ans;
    }
}
