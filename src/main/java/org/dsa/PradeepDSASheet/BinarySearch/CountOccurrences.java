package org.dsa.PradeepDSASheet.BinarySearch;
// https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
// https://youtu.be/m3a0NRGqrNg
public class CountOccurrences {
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(countFreq(arr, 2));
    }
    static int countFreq(int[] arr, int target) {
        // code here
        int first = findOccurence(arr, target, true);
        if (first == -1) return 0;
        int last = findOccurence(arr, target, false);

        return last - first + 1;
    }

    private static int findOccurence(int[] arr, int target, boolean isFirst) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        // do pen n ppr with condition
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target){
                result = mid;
                if (isFirst)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;

        }
        return result;
    }
}
