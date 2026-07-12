package org.dsa.journeywithpravallika.Day11_20;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));

        System.out.println(isValidParenthese("()"));
        System.out.println(isValidParenthese("()[]{}"));
        System.out.println(isValidParenthese("(]"));
        System.out.println(isValidParenthese("([])"));

    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                //If closing bracket
                //stack should not be empty
                // top should br matching the opening bracket
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[') ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isValidParenthese(String s) {
        while (true)
        {
            if (s.contains("()"))
                s = s.replace("()","");
            else if (s.contains("[]"))
                s = s.replace("[]","");
            else if(s.contains("{}"))
                s = s.replace("{}","");
            else
                return s.isEmpty();
        }
    }
}
