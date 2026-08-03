package org.dsa.PradeepDSASheet.BinarySearch;
// https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
// https://youtu.be/jkqDSR_PUDs || solution shown in the video in ulta
public class FloorInASortedArray {
    public static void main(String[] args) {

    }
    static int findFloor(int[] arr, int x) {
        // code here
        int left = 0, right = arr.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= x) {
                ans = mid;         // candidate floor, but look for a larger one
                left = mid + 1;
            } else {
                right = mid - 1;   // arr[mid] too big, floor must be to the left
            }
        }
        return ans;
    }
}
