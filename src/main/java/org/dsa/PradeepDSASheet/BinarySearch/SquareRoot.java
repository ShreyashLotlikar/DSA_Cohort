package org.dsa.PradeepDSASheet.BinarySearch;
//https://leetcode.com/problems/sqrtx/description/
// https://youtu.be/-gUwj9ZSRn8?list=PLvNVexrplJJx8Fi1geIYySPo3L13-0ZJr
public class SquareRoot {
    public static void main(String[] args) {

    }
    public static int mySqrt(int x) {
        if (x < 2) return x;
        long left = 1, right = x/2;
        while (left <= right) {
            long mid = left + (right-left) / 2;
            long square = mid * mid;

            if (square == mid) return (int) mid;

            if (square > x) right = mid - 1;
            else left = mid + 1;
        }
        return (int) right;
    }
}
