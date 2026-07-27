package org.dsa.PradeepDSASheet._9Stack;

import java.util.Stack;

// https://leetcode.com/problems/remove-duplicate-letters/description/
public class RemoveTheDuplicate {
    public static void main(String[] args) {
        /*Input: s = "bcabc"
        Output: "abc"
        Example 2:

        Input: s = "cbacdcbc"
        Output: "acdb"*/

        System.out.println(removeDuplicateLetters("bcabc"));

        System.out.println(removeDuplicateLetters("cbacdcbc"));
    }
    public static String removeDuplicateLetters(String s) {
        int []count = new int[26];
        boolean[] inStack = new boolean[26];

        //Count occurences of each character
        for (char c : s.toCharArray())
            count[c - 'a']++;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            count[c - 'a']--; //one less occurence left to process

            if (inStack[c - 'a'])
                continue; //already in stack, skip

            //Pop stack while:
            // - top is greater than current char (to keep lexicographically smaller)
            // - top character still appears later in the string (safe to remove now)
            while (!stack.isEmpty() && stack.peek() > c && count[stack.peek() - 'a'] > 0)
                inStack[stack.pop() - 'a'] = false;

            stack.push(c);
            inStack[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack)
            sb.append(c);
        return sb.toString();
    }
}
