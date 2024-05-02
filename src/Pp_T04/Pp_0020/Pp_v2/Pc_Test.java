package Pp_T04.Pp_0020.Pp_v2;

public class Pc_Test {
    //https://leetcode.com/problems/valid-parentheses/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        String s1 = "()";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        String s2 = "()[]{}";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        String s3 = "(]";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.isValid(s1) = " + solution.isValid(s1));
        System.out.println("solution.isValid(s2) = " + solution.isValid(s2));
        System.out.println("solution.isValid(s3) = " + solution.isValid(s3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public boolean isValid(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        // 40, 41, 91, 93, 123, 125
        // (   )   [   ]   {    }
        if (s.length()%2 != 0) return false;

        for (int i = 0; i < s.length(); i += 2) {
            int codChar1 = (int) stringBuilder.charAt(i);
            int codChar2 = (int) stringBuilder.charAt(i+1);
            if (!((codChar1 == 40 && codChar2 == 41) || (codChar1 == 91 && codChar2 == 93) || (codChar1 == 123 && codChar2 == 125)))
                return false;
        }
        return true;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



