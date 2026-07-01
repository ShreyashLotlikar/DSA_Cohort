package org.dsa.journeywithpravallika.Day1_10;
// remove duplicate n print how many elements present
public class RemoveDuplicatesFromSortedArrays {
    public static void main(String[] args) {

        int []nums = {0,0,0,1,1,1,2,2,3,3};
        System.out.println(removeDuplicate(nums));
    }
    public static int removeDuplicate(int []nums){
        if (nums.length == 0) return 0;

        int write = 0;
        int n = nums.length;
        for (int read = 0; read < n;read++) {
            if (nums[read] != nums[write]) {
                write++;
                nums[write] = nums[read];
            }
        }
        return write + 1;
    }
}
