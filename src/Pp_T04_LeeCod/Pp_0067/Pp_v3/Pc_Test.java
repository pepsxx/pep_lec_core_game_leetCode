package Pp_T04_LeeCod.Pp_0067.Pp_v3;

public class Pc_Test {
    //https://leetcode.com/problems/add-binary/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1};
        String s1 = "1010";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "1011";
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
        int xt = 0;

        StringBuilder sm = new StringBuilder();

        while (al > 0 || bl > 0) {
            if (al > 0 && a.charAt(--al) == '1') xt++;
            if (bl > 0 && b.charAt(--bl) == '1') xt++;
            if (xt % 2 == 1) sm.append('1');
            else sm.append('0');
            xt /= 2;
        }
        if (xt == 1) sm.append(1);
        return sm.reverse().toString();
    }
}
//--------------------------------------------------------------------------------------------------------------------//



