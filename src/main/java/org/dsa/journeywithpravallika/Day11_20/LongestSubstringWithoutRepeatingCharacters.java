package org.dsa.journeywithpravallika.Day11_20;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int right=0;right<s.length();right++) {
            char ch = s.charAt(right);

            //Duplicate found
            if (map.containsKey(ch))
                left = Math.max(left, map.get(ch)+1);

            //Store latest index
            map.put(ch, right);

            //update answer
            maxLen =Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
