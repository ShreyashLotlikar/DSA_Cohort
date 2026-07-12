package org.dsa.alphaIntern;
// https://www.instagram.com/alphaintern.in?utm_source=ig_web_button_share_sheet&igsh=ZDNlZDc0MzIxNw==
public class alphaIntern100_125 {
    public static void main(String[] args) {

        //Day 125 : 151. Reverse Words in a String
        //https://leetcode.com/problems/reverse-words-in-a-string/description/
//        System.out.println(reverseWords("the sky is blue"));
//        System.out.println(reverseWords("  hello world  "));

        //Day 125 : 58. Length of Last Word
        //https://leetcode.com/problems/length-of-last-word/description/
//        System.out.println(lengthOfLastWord("Hello World"));
//        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

        // Day 123 : 392. Is Subsequence
        // https://leetcode.com/problems/is-subsequence/description/
//        System.out.println(isSubsequence("abc","ahbgdc"));
//        System.out.println(isSubsequence("axc","ahbgdc"));

    }
    public static int lengthOfLastWord(String s) {
        /*String []strs = s.trim().split("\\s+");
        return strs[strs.length-1].length();*/
        int i = s.length()-1;

        //skip the trailing spaces
        while (i >= 0 && s.charAt(i) == ' ')
            i--;
        // Count characters of the last word
        int length = 0;
        while (i>=0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
    public static String reverseWords(String input) {
        String []strs = input.trim().split("\\s+");

        StringBuilder result = new StringBuilder();
        for (int i= strs.length-1;i>=0;i--) {
            result.append(strs[i]);
            if (i != 0)
                result.append(" ");
        }
        return result.toString();
    }
    public static String reverseWordsSimpler(String input) {
        String []strs = input.trim().split(" ");
        int left = 0 , right = strs.length-1;
        while (left < right) {
            String temp = strs[left];
            strs[left] = strs[right];
            strs[right] = temp;
            left++;
            right--;
        }
        return String.join(" ",strs);
    }
    public static boolean isSubsequence(String s1, String s2) {
        int i=0,j=0;
        for (;i < s1.length() && j < s2.length();j++)
        {
            if (s1.charAt(i) == s2.charAt(j))
                i++;
        }
        return (i == s1.length());
    }
}
