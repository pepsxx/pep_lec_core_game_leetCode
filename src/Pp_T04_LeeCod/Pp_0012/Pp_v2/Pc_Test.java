package Pp_T04_LeeCod.Pp_0012.Pp_v2;

public class Pc_Test {
    //https://leetcode.com/problems/integer-to-roman/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 59;
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
            convert(sb, t, 'M', ' ', ' ');
        }
        if (num / 100 != 0) {
            t = num % 1000 / 100;
            convert(sb, t, 'C', 'D', 'M');
        }
        if (num / 10 != 0) {
            t = num % 100 / 10;
            convert(sb, t, 'X', 'L', 'C');
        }
        if (num != 0) {
            t = num % 10;
            convert(sb, t, 'I', 'V', 'X');
        }
        return sb.toString();
    }

    private static void convert(StringBuilder sb, int t, char ch1, char ch2, char ch3) {
        switch (t) {
            case 1 -> sb.append(ch1);
            case 2 -> sb.append(ch1 + "" + ch1);
            case 3 -> sb.append(ch1 + "" + ch1 + "" + ch1);
            case 4 -> sb.append(ch1 + "" + ch2);
            case 5 -> sb.append(ch2);
            case 6 -> sb.append(ch2 + "" + ch1);
            case 7 -> sb.append(ch2 + "" + ch1 + "" + ch1);
            case 8 -> sb.append(ch2 + "" + ch1 + "" + ch1 + "" + ch1);
            case 9 -> sb.append(ch1 + "" + ch3);
        }
    }
}
//--------------------------------------------------------------------------------------------------------------------//


