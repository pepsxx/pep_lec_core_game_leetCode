package Pp_T04.Pp_020.Pp_v1;

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
        while (stringBuilder.length() > 0) {
            int indexLeft = 0, indexRight = stringBuilder.length() - 1;
            int codCharLeft = 0, codCharRight = 10;

            for (int i = 0; i < stringBuilder.length(); i++) {
                int codChar = (int) stringBuilder.charAt(i);
                if (codChar == 41 || codChar == 93 || codChar == 125)
                    return false;
                if (codChar == 40 || codChar == 91 || codChar == 123) {
                    indexLeft = i;
                    codCharLeft = codChar;
                    break;
                }
                if (i == stringBuilder.length() - 1)
                    return true;
            }

            if (stringBuilder.length()-1 == indexLeft)
                return false;

            for (int i = stringBuilder.length() - 1; i > indexLeft; i--) {
                int codChar = (int) stringBuilder.charAt(i);
                if (codChar == 40 || codChar == 91 || codChar == 123)
                    return false;
                if (codChar == 41 || codChar == 93 || codChar == 125) {
                    indexRight = i;
                    codCharRight = codChar;
                    break;
                }
            }

            if (codCharRight - codCharLeft > 3)
                return false;
            stringBuilder.delete(indexRight, stringBuilder.length());
            stringBuilder.delete(0, indexLeft + 1);
        }
        return true;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



