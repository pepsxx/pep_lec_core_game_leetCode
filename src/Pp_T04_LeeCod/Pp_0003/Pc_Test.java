package Pp_T04_LeeCod.Pp_0003;

import java.util.HashSet;
import java.util.Set;

public class Pc_Test {
    //https://xXx/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1};
        String s1 = "jbpnbwwd";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "bbbbb";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "pwwkew";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.lengthOfLongestSubstring(s1) = " + solution.lengthOfLongestSubstring(s1));
//        System.out.println("solution.lengthOfLongestSubstring(s2) = " + solution.lengthOfLongestSubstring(s2));
//        System.out.println("solution.lengthOfLongestSubstring(s3) = " + solution.lengthOfLongestSubstring(s3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> setTemp = new HashSet<>();
        for (int i = 0; i < s.length(); i++)
            setTemp.add(s.charAt(i));
        int len = s.length();
        int maxTior = setTemp.size();
        int maxFact = 0;

        for (int i = 0; i < len; i++) {
            setTemp.removeAll(setTemp);
            for (int j = i; j < len; j++) {
                setTemp.add(s.charAt(j));
                if (j - i == setTemp.size())
                    break;
            }
            if (maxFact < setTemp.size()) {
                maxFact = setTemp.size();
                if (maxFact == maxTior) return maxFact;
            }
        }
        return maxFact;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



