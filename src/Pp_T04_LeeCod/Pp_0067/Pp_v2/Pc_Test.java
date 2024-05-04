package Pp_T04_LeeCod.Pp_0067.Pp_v2;

import java.util.Arrays;

public class Pc_Test {
    //https://leetcode.com/problems/add-binary/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1};
        String s1 = "101111";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "10";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.addBinary(s1, s2) = " + solution.addBinary(s1, s2));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public String addBinary(String a, String b) {

        int al = a.length();
        int bl = b.length();

        StringBuilder sum = new StringBuilder();

        if (al != bl) {
            int dl = al - bl;
            if (dl < 0) dl = dl * (-1);
            for (int i = 0; i < dl; i++)
                sum.append("0");
            if (al < bl) a = sum.toString() + a;
            else b = sum.toString() + b;
        }

        int y;
        int x = 0;
        sum.delete(0,sum.length());
        al = a.length();

        while (--al >= 0) {
            y = (a.charAt(al) - '0') + (b.charAt(al) - '0') + x;
            switch (y) {
                case 0 -> {
                    sum.append("0");
                    x = 0;
                }
                case 1 -> {
                    sum.append("1");
                    x = 0;
                }
                case 2 -> {
                    sum.append("0");
                    x = 1;
                }
                case 3 -> {
                    sum.append("1");
                    x = 1;
                }
            }
        }
        if (x == 1) sum.append("1");

        return sum.reverse().toString();
    }
}
//--------------------------------------------------------------------------------------------------------------------//



