package Pp_T04_LeeCod.Pp_0029;

public class Pc_Test {
    //https://xXx/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = -2_147_483_648;
        int[] nums1 = {1,1};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = -1;
        int[] nums2 = {2,2};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3,3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.divide(x1, x2) = " + solution.divide(x1, x2));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == (-1)) return Integer.MAX_VALUE;
        return dividend/divisor;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



