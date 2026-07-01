package org.dsa.journeywithpravallika.Day1_10;

public class LargestFromArray {
    public static void main(String[] args) {

        int []arr = {12,10,5,8,1,9,50};
        System.out.println(findLargest(arr));
    }
    public static int findLargest(int []arr) {
        int n = arr.length;
        int largest = arr[0];

        for (int i=0;i<n;i++)
        {
            if (arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }
}
