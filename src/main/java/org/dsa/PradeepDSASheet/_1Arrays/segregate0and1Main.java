package org.dsa.PradeepDSASheet._1Arrays;
// https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
public class segregate0and1Main {
    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate0and1Main(arr);
        for (int n : arr)
            System.out.print(" " +n);
    }
    static  void segregate0and1Main(int []nums) {
        int left = 0;
        for (int right=0; right<nums.length; right++)
        {
            if (nums[right] != 1){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
