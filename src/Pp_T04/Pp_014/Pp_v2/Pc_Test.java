package Pp_T04.Pp_014.Pp_v2;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/longest-common-prefix/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        String[] strs1 = new String[]{"flower","flow","flight"};
        String[] strs2 = new String[]{"dog","racecar","car"};
        String[] strs3 = new String[]{"cir","car", "corima"};
        String[] strs4 = new String[]{"reflower", "flow", "flight"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.longestCommonPrefix(strs1) = " + solution.longestCommonPrefix(strs1));
        System.out.println("solution.longestCommonPrefix(strs2) = " + solution.longestCommonPrefix(strs2));
        System.out.println("solution.longestCommonPrefix(strs3) = " + solution.longestCommonPrefix(strs3));
        System.out.println("solution.longestCommonPrefix(strs4) = " + solution.longestCommonPrefix(strs4));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public String longestCommonPrefix(String[] strs) {

        String stringMinLength = strs[strs.length-1];
        for (int i = 0; i < strs.length-1; i++) {
            if (stringMinLength.length() > strs[i].length())
                stringMinLength = strs[i];
        }
        int minString = stringMinLength.length();

        for (int i = minString; i >0 ; i--) {
            boolean t = true;
            for (int j = 1; j < strs.length; j++) {
                System.out.println(i+" "+j);
                strs[0].substring(0, i);
                System.out.println("strs[j].substring(0, i) = " + strs[j].substring(0, i));
                System.out.println("strs[0].substring(0, i) = " + strs[0].substring(0, i));

                if (!strs[j].substring(0, i).equals(strs[0].substring(0, i))) {
                    System.out.println("---");
                    t = false;
                    break;}
            }
            if (t)
                return strs[0].substring(0, i);
        }
        return "";
    }
}
//--------------------------------------------------------------------------------------------------------------------//



