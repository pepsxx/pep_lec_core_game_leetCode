package Pp_T04_LeeCod.Pp_0007.Pp_v1;

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
        StringBuilder sb = new StringBuilder();
        sb.append(x);

        if (sb.length() == 0) return x;
        else if (x < 0) sb.deleteCharAt(0);

        String s = sb.reverse().toString();
        long l = Long.parseLong(s);

        if ((x > 0 && l > 2_147_483_647L) || (x < 0 && l > 2_147_483_648L)) return 0;
        else if (x >= 0) return Integer.parseInt(s);
        else return Integer.parseInt(s) * (-1);
    }
}
//--------------------------------------------------------------------------------------------------------------------//



