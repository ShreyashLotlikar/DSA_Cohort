package org.dsa.journeywithpravallika.Day1_10;

public class ContainerMostWater {
    public static void main(String[] args) {

        int []heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(heights));
    }
    public static int maxArea(int []height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int h = Math.min(height[left],height[right]);
            int width = right - left;
            int area = h * width;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}
