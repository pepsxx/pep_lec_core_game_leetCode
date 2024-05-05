package Pp_T04_LeeCod.Pp_0069.Pp_v1;

public class Pc_Test {
    //https://leetcode.com/problems/sqrtx/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 4;
        int[] nums1 = {1,1};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 8;
        int[] nums2 = {2,2};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3,3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.mySqrt(x1) = " + solution.mySqrt(x1));
        System.out.println("solution.mySqrt(x2) = " + solution.mySqrt(x2));
        System.out.println("solution.mySqrt(x3) = " + solution.mySqrt(x3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}
//--------------------------------------------------------------------------------------------------------------------//



