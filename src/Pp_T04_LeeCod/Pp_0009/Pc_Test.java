package Pp_T04_LeeCod.Pp_0009;

public class Pc_Test {
    //https://xXx/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 121;
        int x2 = -121;
        int x3 = 10;
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.isPalindrome(x1) = " + solution.isPalindrome(x1));
        System.out.println("solution.isPalindrome(x2) = " + solution.isPalindrome(x2));
        System.out.println("solution.isPalindrome(x3) = " + solution.isPalindrome(x3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != (string.charAt(string.length() - 1 - i))) return false;
        }
        return true;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



