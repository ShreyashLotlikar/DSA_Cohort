package org.dsa.journeywithpravallika.Day1_10;
// find string is palindromr
public class PalindromeString {
    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("don"));
        System.out.println(isPalindrome("mom"));
    }
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
