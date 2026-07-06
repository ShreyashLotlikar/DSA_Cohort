package org.dsa.PradeepDSASheet._3SlidingWindow;

import java.util.HashSet;
import java.util.Set;
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubString("abcabcbb"));
        System.out.println(lengthOfLongestSubString("bbbbb"));
    }
    public static int lengthOfLongestSubString(String s) {
        Set<Character> set = new HashSet<>();
        int i=0,j=0,len=0;
        while (j < s.length()) {
            char currentChar = s.charAt(j);
            //fix if this curr is alreading exists
            if (set.contains(currentChar)) {
                //fix shrinking window
                while (i<j && set.contains(currentChar)){
                    set.remove(s.charAt(i));
                    i++;
                }
            }
            set.add(currentChar);
            len = Math.max(len, j-i+1);
            j++;
        }
        return len;
    }
}
