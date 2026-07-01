package org.dsa.journeywithpravallika.Day1_10;
// move all zeros
public class MoveAllZeroes {
    public static void main(String[] args) {

        int []nums = {1,2,0,1,5,0};
        moveZeros(nums);
        for (int i : nums){
            System.out.print(" " +i);
        }
    }
    public static void moveZeros(int []nums) {
        int w = 0;
        int n = nums.length;
        for (int r=0;r<n;r++) {
            if (nums[r] != 0) {
                nums[w] = nums[r];
                w++;
            }
        }

        while (w < n) {
            nums[w] = 0;
            w++;
        }
    }
}
