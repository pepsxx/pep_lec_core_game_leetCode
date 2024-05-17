package Pp_T04_LeeCod.Pp_0007.Pp_v2;

public class Pc_Test {
    //https://leetcode.com/problems/reverse-integer/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 123;
        int[] nums1 = {1, 1};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = -123;
        int[] nums2 = {2, 2};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 120;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.reverse(x1) = " + solution.reverse(x1));
        System.out.println("solution.reverse(x2) = " + solution.reverse(x2));
        System.out.println("solution.reverse(x3) = " + solution.reverse(x3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int reverse(int x) {
        long l = 0;
        while (x != 0) {
            l = (l * 10) + (x % 10);
            x /= 10;
        }
        if (l > Integer.MAX_VALUE || l < Integer.MIN_VALUE)            return 0;
        else return (int) l;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



