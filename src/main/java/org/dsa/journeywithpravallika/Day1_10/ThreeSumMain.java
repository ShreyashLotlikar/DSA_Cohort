package org.dsa.journeywithpravallika.Day1_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumMain {
    public static void main(String[] args) {

        int []nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
    }
    public static List<List<Integer>> threeSum(int []nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;

            int left=i+1, right=n-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0)
                    left++;
                else if (sum > 0)
                    right--;
                else {
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}
