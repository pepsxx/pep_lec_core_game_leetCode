package Pp_T04_LeeCod.Pp_0069.Pp_v2;

public class Pc_Test {
    //https://leetcode.com/problems/sqrtx/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 4;
        int[] nums1 = {1, 1};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 8;
        int[] nums2 = {2, 2};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 2147395599;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
//        System.out.println("solution.mySqrt(x1) = " + solution.mySqrt(x1));
//        System.out.println("solution.mySqrt(x2) = " + solution.mySqrt(x2));
        System.out.println("solution.mySqrt(x3) = " + solution.mySqrt(x3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int mySqrt(int x) {

        if (x <= 0) return 0;

        int str = 0;
        int end = x;
        int med = x;

        while (end - str > 1) {
            med = str + (end - str) / 2;
            long m = ((long) med * (long) med);
            if (m == x) return med;
            else if (x < m) end = med;
            else str = med;
        }
        if (med * med <= x) return med;
        else return (med - 1);
    }
}
//--------------------------------------------------------------------------------------------------------------------//



