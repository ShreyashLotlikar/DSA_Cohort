package org.dsa.PradeepDSASheet._1Arrays;
// https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductofArrayExceptSelfMain {
    public static void main(String[] args) {

        //int []nums = {1,2,3,4};
        int []nums = {-1,1,0,-3,3};
        int []result = productExceptSelf(nums);
        for (int n : result)
            System.out.print(" " +n);
    }
    public static int[] productExceptSelf(int[] arr) {
        int []ans = new int[arr.length];
        int n = arr.length;
        int prodR = 1;
        int prodL = 1;

        for (int i=n-1;i>=0;i--){
            ans[i] = prodR;
            prodR = prodR * arr[i];
        }
        for (int i=0;i<n;i++){
            ans[i] *= prodL;
            prodL = prodL * arr[i];
        }
        return ans;
    }
}
