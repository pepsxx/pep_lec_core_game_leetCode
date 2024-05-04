package Pp_T04_LeeCod.Pp_0058;

import java.util.Arrays;

public class Pc_Test {
    //https://leetcode.com/problems/length-of-last-word/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1,1};
        String s1 = "Hello World";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2,2};
        String s2 = "   fly me   to   the moon  ";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3,3};
        String s3 = "luffy is still joyboy";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.lengthOfLastWord(s1) = " + solution.lengthOfLastWord(s1));
        System.out.println("solution.lengthOfLastWord(s2) = " + solution.lengthOfLastWord(s2));
        System.out.println("solution.lengthOfLastWord(s3) = " + solution.lengthOfLastWord(s3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int lengthOfLastWord(String s) {
        String[] ss = s.trim().split(" ");
        return ss[ss.length - 1].length();
    }
}
//--------------------------------------------------------------------------------------------------------------------//



