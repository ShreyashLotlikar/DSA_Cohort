package org.dsa.PradeepDSASheet._3SlidingWindow;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
public class FirstNegativeInWindowsofSizeK {
    public static void main(String[] args) {
        long arr[] = {-8, 2, 3, -6, 10};
        int k = 2;
        long res[] = firstNegInt(arr, k);
        for (long i : res)
            System.out.print(" " +i);
    }
    static long[] firstNegInt(long arr[], int k) {
        Queue<Long> queue = new LinkedList<Long>();
        int n = arr.length;
        //calculate for first window
        int index = 0;
        while (index < k){
            if (arr[index] < 0)
                queue.offer(arr[index]);
            index++;
        }
        long res[] = new long[n-k+1];
        res[0] = (queue.isEmpty())?0:queue.peek();

        for (int i=1;i<n-k+1;i++) {
            //remove
            if (arr[i-1] < 0)
                queue.poll();
            //add
            if (arr[i+k-1]<0)
                queue.offer(arr[i+k-1]);

            res[i] = (queue.isEmpty())?0:queue.peek();
        }
        return res;
    }
}
