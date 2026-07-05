package org.dsa.journeywithpravallika.Day11_20;

public class LongestCharRepeatCount {
    public static void main(String[] args) {

        // https://leetcode.com/problems/longest-repeating-character-replacement/description/
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s,k));
    }
    public static int characterReplacement(String s, int k) {

        int []freq = new int[26]; //frequent of count
        int left = 0, maxFreq=0,maxLen=0;

        for (int right=0;right<s.length();right++) {
            char ch = s.charAt(right);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch-'A']);

            //Current window size
            //int windowSize = right - left + 1;

            //If replacement needed > k shrink window
            if ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left)-'A']--;
                left++;
            }

            //update the max length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
