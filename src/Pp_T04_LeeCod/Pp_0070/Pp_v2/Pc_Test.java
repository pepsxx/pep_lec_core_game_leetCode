package Pp_T04_LeeCod.Pp_0070.Pp_v2;

public class Pc_Test {
    //https://leetcode.com/problems/climbing-stairs/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 34;
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
        System.out.println("solution.climbStairs(x1) = " + solution.climbStairs(x1));
//        System.out.println("solution.climbStairs(1) = " + solution.climbStairs(1));
//        System.out.println("solution.climbStairs(2) = " + solution.climbStairs(2));
//        System.out.println("solution.climbStairs(3) = " + solution.climbStairs(3));
//        System.out.println("solution.climbStairs(4) = " + solution.climbStairs(4));
//        System.out.println("solution.climbStairs(5) = " + solution.climbStairs(5));
//        System.out.println("solution.climbStairs(6) = " + solution.climbStairs(6));
//        System.out.println("solution.climbStairs(7) = " + solution.climbStairs(7));
//        System.out.println("solution.climbStairs(8) = " + solution.climbStairs(8));
//        System.out.println("solution.climbStairs(9) = " + solution.climbStairs(9));
//        System.out.println("solution.climbStairs(10) = " + solution.climbStairs(10));
//        System.out.println("solution.climbStairs(11) = " + solution.climbStairs(11));
//        System.out.println("solution.climbStairs(12) = " + solution.climbStairs(12));
//        System.out.println("solution.climbStairs(13) = " + solution.climbStairs(13));
//        System.out.println("solution.climbStairs(14) = " + solution.climbStairs(14));
//        System.out.println("solution.climbStairs(15) = " + solution.climbStairs(15));
//        System.out.println("solution.climbStairs(16) = " + solution.climbStairs(16));
//        System.out.println("solution.climbStairs(17) = " + solution.climbStairs(17));
//        System.out.println("solution.climbStairs(18) = " + solution.climbStairs(18));
//        System.out.println("solution.climbStairs(19) = " + solution.climbStairs(19));
//        System.out.println("solution.climbStairs(20) = " + solution.climbStairs(20));
//        System.out.println("solution.climbStairs(21) = " + solution.climbStairs(21));
//        System.out.println("solution.climbStairs(22) = " + solution.climbStairs(22));
//        System.out.println("solution.climbStairs(23) = " + solution.climbStairs(23));
//        System.out.println("solution.climbStairs(24) = " + solution.climbStairs(24));
//        System.out.println("solution.climbStairs(25) = " + solution.climbStairs(25));
//        System.out.println("solution.climbStairs(26) = " + solution.climbStairs(26));
//        System.out.println("solution.climbStairs(27) = " + solution.climbStairs(27));
//        System.out.println("solution.climbStairs(28) = " + solution.climbStairs(28));
//        System.out.println("solution.climbStairs(29) = " + solution.climbStairs(29));
//        System.out.println("solution.climbStairs(30) = " + solution.climbStairs(30));
//        System.out.println("solution.climbStairs(31) = " + solution.climbStairs(31));
//        System.out.println("solution.climbStairs(32) = " + solution.climbStairs(32));
//        System.out.println("solution.climbStairs(33) = " + solution.climbStairs(33));

    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int climbStairs(int n) {
        int fir = 1;
        int sec = 1;
        int tmp = 1;

        for (int i = 1; i < n; i++) {
            tmp = fir + sec;
            fir = sec;
            sec = tmp;
        }
        return tmp;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



