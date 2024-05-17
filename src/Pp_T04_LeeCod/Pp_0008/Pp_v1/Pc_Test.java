package Pp_T04_LeeCod.Pp_0008.Pp_v1;

public class Pc_Test {
    //https://leetcode.com/problems/string-to-integer-atoi/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1};
        String s1 = "  0-1  ";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "-91283472332";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "  1337c0d3  ";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.myAtoi(s1) = " + solution.myAtoi(s1));
        System.out.println("solution.myAtoi(s2) = " + solution.myAtoi(s2));
        System.out.println("solution.myAtoi(s3) = " + solution.myAtoi(s3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int myAtoi(String s) {

        if (s.trim().length() == 0) return 0;
        int multiple = 1;
        int startChar = 0;

        if (s.trim().charAt(0) == '-' || s.trim().charAt(0) == '+') {
            startChar++;
            if (s.trim().charAt(0) == '-') multiple = -1;
        }

        long result = 0;

        for (int i = startChar; i < s.trim().length(); i++) {
            if (result == 0 && s.trim().charAt(i) == '0') continue;
            if (s.trim().charAt(i) >= '0' && s.trim().charAt(i) <= '9') {
                result = result * 10 + (s.trim().charAt(i) - '0');
                if (result > Integer.MAX_VALUE) break;
            } else break;
        }

        result *= multiple;

        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else return (int) result;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



