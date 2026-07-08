package org.dsa.journeywithpravallika.Day11_20;

//https://leetcode.com/problems/minimum-window-substring/description/
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        // Hard level
        // got it from pravilika
        // need to check again
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s,t));
    }
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] need = new int[128];
        int[] window = new int[128];
        for (char ch : t.toCharArray()) need[ch]++;
        int required = t.length();
        int formed = 0;
        int l = 0, minLen = Integer.MAX_VALUE;
        int start = 0;
        for (int r = 0; r < s.length(); r++) {
            char rc = s.charAt(r);
            window[rc]++;
            if (window[rc] <= need[rc]) formed++;
            while (formed == required) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                char lc = s.charAt(l);
                window[lc]--;
                if (window[lc] < need[lc]) formed--;
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
