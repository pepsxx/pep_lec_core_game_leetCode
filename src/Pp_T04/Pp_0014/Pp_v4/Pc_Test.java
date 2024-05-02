package Pp_T04.Pp_0014.Pp_v4;

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

        StringBuilder stringMinLength = new StringBuilder();
        stringMinLength.append(strs[strs.length - 1]);
        for (int i = 0; i < strs.length - 1; i++) {
            if (stringMinLength.length() > strs[i].length())
                stringMinLength
                        .delete(0,stringMinLength.length())
                        .append(strs[i]);
        }

        for (int i = stringMinLength.length(); i > 0; i--) {
            boolean tempBool = true;
            for (int j = 1; j < strs.length; j++) {
                if (!strs[0].substring(0, i).equals(strs[j].substring(0, i))) {
                    tempBool = false;
                    break;
                }
            }
            if (tempBool) return strs[0].substring(0, i);
        }
        return "";
    }
}
//--------------------------------------------------------------------------------------------------------------------//



