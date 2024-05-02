package Pp_T04_LeeCod.Pp_0014.Pp_v1;

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

        String stringMaxLength = strs[0];
        String stringMixLength = strs[0];
        for (int i = 0; i < strs.length - 1; i++) {
            if (strs[i].length() <= strs[i + 1].length())
                stringMaxLength = strs[i + 1];
            else stringMixLength = strs[i + 1];
        }
        int maxString = stringMaxLength.length();
        int minString = stringMixLength.length();

        List<String> MyList = new ArrayList<>();
        while (minString != 0) {
            for (int i = 0; i <= maxString - minString; i++) {
                MyList.add(stringMaxLength.substring(i, i + minString));
            }
            minString--;
        }
        System.out.println("MyList = " + MyList);

        for (int i = 0; i < MyList.size(); i++) {
            for (int j = 0; j < strs.length; j++) {
                System.out.println("strs[j] = " + strs[j]);
                System.out.println("MyList.get(i) = " + MyList.get(i));
                if (!strs[j].contains(MyList.get(i)))
                    break;
                return MyList.get(i);
            }
        }
        return "";
    }
}
//--------------------------------------------------------------------------------------------------------------------//



