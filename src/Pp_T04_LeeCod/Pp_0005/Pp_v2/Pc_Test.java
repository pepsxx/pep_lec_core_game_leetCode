package Pp_T04_LeeCod.Pp_0005.Pp_v2;

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
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        sb = syrchSubString(s.length() - 1, 0, s, sb);
        sb = syrchSubString(s.length() - 1, 1, s, sb);
        return sb.toString();
    }

    public StringBuilder syrchSubString(int lastIdx, int delta, String s, StringBuilder sb) {
        if (lastIdx - delta < 1) return sb;
        for (int i = 0; i < lastIdx - delta; i++) {
            if (s.charAt(i) == s.charAt(i + delta + 1)) {
                int srtIdx = i;
                int endIdx = i + delta + 1;
                do {
                    if (s.charAt(srtIdx) == s.charAt(endIdx)) {
                        if (sb.length() < endIdx - srtIdx  + 1) {
                            sb.setLength(0);
                            sb.append(s, srtIdx, endIdx + 1);
                        }
                        srtIdx--;
                        endIdx++;
                    } else break;
                }
                while (0 <= srtIdx && endIdx <= lastIdx);
            }
        }
        return sb;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



