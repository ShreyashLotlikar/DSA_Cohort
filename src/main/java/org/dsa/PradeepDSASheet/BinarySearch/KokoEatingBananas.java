package org.dsa.PradeepDSASheet.BinarySearch;
// https://leetcode.com/problems/koko-eating-bananas/description/
// https://youtu.be/sPlRs126bFU || pen n ppr do ||  try to code brute
public class KokoEatingBananas {
    public static void main(String[] args) {
        int []piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles)
            high = Math.max(high, pile);
        int ans = high;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if (canEat(piles, h, mid)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    private static boolean canEat(int []piles, int h,int k){
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + k -1) / k;
        }
        return hours <= h;
    }
}
