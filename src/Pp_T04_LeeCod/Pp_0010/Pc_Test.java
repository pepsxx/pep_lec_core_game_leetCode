package Pp_T04_LeeCod.Pp_0010;

public class Pc_Test {
    //https://leetcode.com/problems/regular-expression-matching/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1};
        String s1 = "cab";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "c*a*b";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.isMatch(s1, s2) = " + solution.isMatch(s1, s2));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public boolean isMatch(String s1, String s2) {
        if (s1.isEmpty() || s2.isEmpty()) return false;
        int idx1 = 0;
        int idx2 = 0;

        while (idx1 < s1.length()) {
            if (idx2 == s2.length()) return false;

            if (s2.charAt(idx2) == '.') {
                idx1++;
                idx2++;
                continue;
            }

            if (s2.charAt(idx2) == '*') {

                if (idx2 + 1 == s2.length()) return true;

                if (s1.charAt(idx1) == s2.charAt(idx2 + 1)) {
                    idx1++;
                    idx2 += 2;
                } else {
                    idx1++;
                }

            } else {
                if (s1.charAt(idx1++) != s2.charAt(idx2++)) return false;
            }

        }
        return true;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



