package Pp_T04_LeeCod.Pp_0020.Pp_v3;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/valid-parentheses/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        String s1 = "(){[]}";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "{[]}";
        String s5 = "[";
        String s6 = "((";
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.isValid(s1) = " + solution.isValid(s1));
        System.out.println("solution.isValid(s2) = " + solution.isValid(s2));
        System.out.println("solution.isValid(s3) = " + solution.isValid(s3));
        System.out.println("solution.isValid(s4) = " + solution.isValid(s4));
        System.out.println("solution.isValid(s5) = " + solution.isValid(s5));
        System.out.println("solution.isValid(s6) = " + solution.isValid(s6));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public boolean isValid(String s) {
        // 40, 41, 91, 93, 123, 125
        // (   )   [   ]   {    }

        if (s.length() < 2) return false;
        List<Integer> MyList = new ArrayList<>();
        int ndx = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 40 -> {
                    MyList.add(40);
                    ndx++;
                    continue;
                }
                case 91 -> {
                    MyList.add(91);
                    ndx++;
                    continue;
                }
                case 123 -> {
                    MyList.add(123);
                    ndx++;
                    continue;
                }
            }

            if (ndx < 1) return false;

            switch (s.charAt(i)) {
                case 41 -> {
                    if (MyList.get(ndx - 1) == 40) {
                        MyList.remove(ndx - 1);
                        ndx--;
                        continue;
                    } else return false;
                }
                case 93 -> {
                    if (MyList.get(ndx - 1) == 91) {
                        MyList.remove(ndx - 1);
                        ndx--;
                        continue;
                    } else return false;
                }
                case 125 -> {
                    if (MyList.get(ndx - 1) == 123) {
                        MyList.remove(ndx - 1);
                        ndx--;
                        continue;
                    } else return false;
                }
            }
        }
        if (ndx != 0)
            return false;
        return true;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



