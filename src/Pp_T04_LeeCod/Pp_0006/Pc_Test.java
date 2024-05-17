package Pp_T04_LeeCod.Pp_0006;

public class Pc_Test {
    //https://leetcode.com/problems/zigzag-conversion/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 4;
        int[] nums1 = {1, 1};
        String s1 = "123432123432123";
        String[] sm1 = {"111", "111"};
        int x2 = 3;
        int[] nums2 = {2, 2};
        String s2 = "PAYPALISHIRING";
        String[] sm2 = {"222", "222"};
        int x3 = 4;
        int[] nums3 = {3, 3};
        String s3 = "PAYPALISHIRING";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.convert(s1, x1) = " + solution.convert(s1, x1));
        System.out.println("solution.convert(s2, x2) = " + solution.convert(s2, x2));
        System.out.println("solution.convert(s3, x3) = " + solution.convert(s3, x3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int hope1 = numRows * 2 - 2;
        int hope2;
        int hopeBack = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= hope1 / 2; i++) {
            for (int j = i; j < s.length(); j += hope1) {
                sb.append(s.charAt(j));
                hope2 = j + hope1 - hopeBack;
                if ((j == hope2 - hope1) || (j == hope2)) continue;
                else if (hope2 < s.length()) sb.append(s.charAt(hope2));
            }
            hopeBack += 2;
        }

        return sb.toString();
    }
}
//--------------------------------------------------------------------------------------------------------------------//



