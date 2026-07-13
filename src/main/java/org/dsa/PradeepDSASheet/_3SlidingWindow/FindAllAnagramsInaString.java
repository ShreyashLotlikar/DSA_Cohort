package org.dsa.PradeepDSASheet._3SlidingWindow;

import java.util.*;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/
// https://youtu.be/bK1z7nWoIwE
//438. Find All Anagrams in a String
public class FindAllAnagramsInaString {
    public static void main(String[] args) {
        // need to go through multiple times as it diffivult level
//        System.out.println(findAnagramsBrute("cbaebabacd", "abc"));
//        System.out.println(findAnagramsBrute("abab", "ab"));

       System.out.println(findAnagrams("cbaebabacd", "abc"));
       System.out.println(findAnagrams("abab", "ab"));

    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);

        int left=0, count = p.length();

        for (int right =0;right<s.length();right++) {
            char ch = s.charAt(right);

            int val = map.getOrDefault(ch, 0);
            if (val > 0) count--;
            map.put(ch, val-1);

            if (right-left+1 > p.length()) {
                char leftChar = s.charAt(left);

                int leftVal = map.getOrDefault(leftChar, 0);
                if (leftVal >= 0) count++;
                map.put(leftChar, leftVal + 1);

                left++;
            }
                if (count == 0)
                    res.add(left);

        }
        return res;
    }
    public static List<Integer> findAnagramsBrute(String s, String p) {
        List<Integer> res = new ArrayList<>();

        int n = s.length();
        int k = p.length();

        int []pCount = new int[26];
        for (char c : p.toCharArray())
                pCount[c - 'a']++;

        for (int i=0;i<=n-k;i++) {
            int []sCount = new int[26];
            for (int j=i;j<=i+k-1;j++){
                sCount[s.charAt(j) - 'a']++;
            }
            if (Arrays.equals(pCount,sCount))
                res.add(i);
        }
        return res;
    }
}
