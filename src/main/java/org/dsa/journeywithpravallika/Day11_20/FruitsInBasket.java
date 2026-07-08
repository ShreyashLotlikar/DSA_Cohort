package org.dsa.journeywithpravallika.Day11_20;

import java.util.HashMap;
import java.util.Map;

public class FruitsInBasket {
    public static void main(String[] args) {
        int []fruits = {0,1,2,2};
        System.out.println(totalFruitBrute(fruits));
        System.out.println(totalFruit(fruits));
    }
    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right=0;right<fruits.length;right++) {
            //Add right fruit to the window
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);
            //If more than 2 types, shrink from left
            while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit)-1);
                if (map.get(leftFruit) == 0)
                    map.remove(leftFruit);
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
    public static int totalFruitBrute(int[] fruits) {
        int n = fruits.length;
        int maxLen = 0;

        //Try every subarray [i,j]
        for (int i=0;i<n;i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j=i;j<n;j++) {
                map.put(fruits[j], map.getOrDefault(fruits[j],0)+1);

                //If more than 2 types break
                if (map.size() > 2) break;

                //update max length
                maxLen = Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }
}
