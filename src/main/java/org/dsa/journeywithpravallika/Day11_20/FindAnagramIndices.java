package org.dsa.journeywithpravallika.Day11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagramIndices {
    public static void main(String[] args) {

        //Brute Force
        System.out.println(findAnagramBrute("cbaebabacd","abc"));

        // Optimal we need to do
    }
    public static List<Integer> findAnagramBrute(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int n = s.length(), k = p.length();
        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);

        for(int i=0;i<=n-k;i++) {
            char []sub = s.substring(i, i+k).toCharArray();
            Arrays.sort(sub);
            if (Arrays.equals(sub, pArr))
                res.add(i);
        }
        return res;
    }
}
