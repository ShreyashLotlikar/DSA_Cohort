package org.dsa.PradeepDSASheet._2TwoPointer;
// https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public static void main(String[] args) {

        int []height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {

        int i = 0, j = height.length - 1;
        int area = 0;
        while (i < j) {
            int tempArea = Math.min(height[i],height[j]) * (j-i);
            area = Math.max(area, tempArea);

            // whom to move
            if (height[i] <= height[j])
                i++;
            else
                j--;
        }
        return area;
    }
}
