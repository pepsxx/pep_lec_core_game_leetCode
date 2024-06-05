package Pp_T04_LeeCod.Pp_0012.Pp_v1;

public class Pc_Test {
    //https://leetcode.com/problems/integer-to-roman/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 3219;
        int[] nums1 = {1, 1};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.intToRoman(x1) = " + solution.intToRoman(x1));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public String intToRoman(int num) {
        int t;
        StringBuilder sb = new StringBuilder();
        if (num / 1000 != 0) {
            t = num % 10000 / 1000;
//            System.out.println("t = " + t);
            switch (t) {
                case 0 -> sb.append("");
                case 1 -> sb.append("M");
                case 2 -> sb.append("MM");
                case 3 -> sb.append("MMM");
                case 4 -> sb.append("");
                case 5 -> sb.append("");
                case 6 -> sb.append("");
                case 7 -> sb.append("");
                case 8 -> sb.append("");
                case 9 -> sb.append("");
            }
//            System.out.println("sb = " + sb);
        }
        if (num / 100 != 0) {
            t = num % 1000 / 100;
            System.out.println("t = " + t);
            switch (t) {
                case 0 -> sb.append("");
                case 1 -> sb.append("C");
                case 2 -> sb.append("CC");
                case 3 -> sb.append("CCC");
                case 4 -> sb.append("CD");
                case 5 -> sb.append("D");
                case 6 -> sb.append("DC");
                case 7 -> sb.append("DCC");
                case 8 -> sb.append("DCCC");
                case 9 -> sb.append("CM");
            }
//            System.out.println("sb = " + sb);
        }
        if (num / 10 != 0) {
            t = num % 100 / 10;
            System.out.println("t = " + t);
            switch (t) {
                case 0 -> sb.append("");
                case 1 -> sb.append("X");
                case 2 -> sb.append("XX");
                case 3 -> sb.append("XXX");
                case 4 -> sb.append("XL");
                case 5 -> sb.append("L");
                case 6 -> sb.append("LX");
                case 7 -> sb.append("LXX");
                case 8 -> sb.append("LXXX");
                case 9 -> sb.append("XC");
            }
//            System.out.println("sb = " + sb);
        }
        if (num / 1 != 0) {
            t = num % 10 / 1;
            System.out.println("t = " + t);
            switch (t) {
                case 0 -> sb.append("");
                case 1 -> sb.append("I");
                case 2 -> sb.append("II");
                case 3 -> sb.append("III");
                case 4 -> sb.append("IV");
                case 5 -> sb.append("V");
                case 6 -> sb.append("VI");
                case 7 -> sb.append("VII");
                case 8 -> sb.append("VIII");
                case 9 -> sb.append("IX");
            }
//            System.out.println("sb = " + sb);
        }
        return sb.toString();
    }
}
//--------------------------------------------------------------------------------------------------------------------//
//
//        3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
//        700 = DCC as 500 (D) + 100 (C) + 100 (C)
//        40 = XL as 10 (X) less of 50 (L)
//        9 = IX as 1 (I) less of 10 (X)


