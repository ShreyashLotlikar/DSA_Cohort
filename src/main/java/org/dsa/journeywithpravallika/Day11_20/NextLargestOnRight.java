package org.dsa.journeywithpravallika.Day11_20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://www.youtube.com/watch?v=mJWQjJpEMa4
public class NextLargestOnRight {
    public static void main(String[] args) {

        int []nums1 = {4,1,2};
        int []nums2 = {1,3,4,2};
//        int []result = nextGreaterBrute(nums1, nums2);
//        for (int i : result)
//            System.out.print(" "+i);

        int []result = nextGreaterElement(nums1, nums2);
        for (int i : result)
            System.out.print(" "+i);
    }
    public static int[] nextGreaterElement(int []nums1,int []nums2) {
        // need to revisit and have a look
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        //Traverse num2 and build next greater fo each element
        for (int num : nums2) {
            // while current number is greater than stack top
            //it is the next greater for stack top
            while (!stack.isEmpty() && stack.peek() < num) {
                int prev = stack.pop();
                map.put(prev, num); // store the next greater
            }
            stack.push(num);
        }

        //Elements left in stack have no greater elememts
        while (!stack.isEmpty())
            map.put(stack.pop(), -1);

        //Build answer from num1
        int []ans = new int[nums1.length];
        for (int i=0;i<nums1.length;i++)
            ans[i] = map.get(nums1[i]);

        return ans;
    }
    public static int[] nextGreaterBrute(int []nums1,int []nums2) {
        int []ans = new int[nums1.length];
        Arrays.fill(ans,-1);

        for (int i=0;i<nums1.length;i++) {
            int target = nums1[i];

            //find the target element is num2
            for (int j=0;j<nums2.length;j++) {
                if (nums2[j] == target) {
                    //check all elements to the right
                    for (int k=j+1;k<nums2.length;k++) {
                        if (nums2[k] > target) {
                            ans[i] = nums2[k];
                            break;
                        }
                    }
                    break;// target found
                }
            }
        }
        return ans;
    }
}
