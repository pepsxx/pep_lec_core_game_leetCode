package Pp_T04_LeeCod.Pp_0005.Pp_v1;

public class Pc_Test {
    //https://leetcode.com/problems/longest-palindromic-substring/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1};
        String s1 = "wqweewq";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "babad";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "cbbd";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.longestPalindrome(s1) = " + solution.longestPalindrome(s1));
        System.out.println("solution.longestPalindrome(s2) = " + solution.longestPalindrome(s2));
        System.out.println("solution.longestPalindrome(s3) = " + solution.longestPalindrome(s3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public String longestPalindrome(String s) {
        String ss = String.valueOf(s.charAt(0));
        ss = syrchSubString(s.length() - 1, 0, s , ss);
        ss = syrchSubString(s.length() - 1, 1, s , ss);
        return ss;
    }

    public String syrchSubString(int lastIdx, int delta, String s, String ss){
        if (lastIdx - delta < 1) return ss;
        for (int i = 0; i < lastIdx - delta; i++) {
            if (s.charAt(i) == s.charAt(i + delta + 1)) {
                int srtIdx = i;
                int endIdx = i + delta + 1;
                do {
                    if (s.charAt(srtIdx) == s.charAt(endIdx)) {
                        if (ss.length() < ((endIdx + 1) - srtIdx)) ss = s.substring(srtIdx, endIdx + 1);
                        srtIdx--;
                        endIdx++;
                    } else break;
                }
                while (0 <= srtIdx && endIdx <= lastIdx);
            }
        }
        return ss;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



