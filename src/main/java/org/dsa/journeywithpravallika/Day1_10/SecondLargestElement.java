package org.dsa.journeywithpravallika.Day1_10;

public class SecondLargestElement {
    public static void main(String[] args) {
        int []arr = {12,10,5,8,1,9,50};
        System.out.println(secondLargestElement(arr));
    }
    public static int secondLargestElement(int arr[]) {
        int largest = arr[0];
        int n  = arr.length;
        int secondLargest = Integer.MIN_VALUE;

        for (int i=1;i<n;i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
