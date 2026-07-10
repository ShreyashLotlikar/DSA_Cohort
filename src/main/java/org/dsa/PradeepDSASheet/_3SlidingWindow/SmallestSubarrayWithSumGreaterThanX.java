package org.dsa.PradeepDSASheet._3SlidingWindow;
// https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
public class SmallestSubarrayWithSumGreaterThanX {
    public static void main(String[] args) {
        int x = 51;
        int arr[] = {1, 4, 45, 6, 0, 19};
        System.out.println(smallestSubWithSum(x, arr));
    }
    public static int smallestSubWithSum(int x, int[] arr) {
        int windowStart = 0;
        int windowEnd = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        int len = 0;
        int n = arr.length;
        while (windowEnd < n) {
            sum += arr[windowEnd];
            if (sum > x) {
                //Shrinking phase
                while (windowStart < windowEnd && sum > x) {
                    sum -= arr[windowStart];
                    windowStart++;
                    if (sum > x) {
                        len = windowEnd - windowStart + 1;
                        minLen = Math.min(minLen,len);
                    }

                }
            }
            windowEnd++;
        }
        return (minLen==Integer.MAX_VALUE)?0:minLen;
    }
}
