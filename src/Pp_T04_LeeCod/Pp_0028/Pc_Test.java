package Pp_T04_LeeCod.Pp_0028;

public class Pc_Test {
    //https://xXx/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1};
        String haystack = "sadbutsad";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String needle = "sad";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.strStr(haystack, needle) = " + solution.strStr(haystack, needle));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int strStr(String haystack, String needle) {
        int sl1 = haystack.length();
        int sl2 = needle.length();
        if (sl1 < sl2) return -1;
        for (int i = 0; i <= sl1-sl2; i++)
            if (haystack.substring(i, i+sl2).equals(needle)) return i;
        return -1;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



