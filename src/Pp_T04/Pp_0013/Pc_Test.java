package Pp_T04.Pp_0013;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://https://leetcode.com/problems/roman-to-integer/description//
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        String s1 = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.romanToInt(s1) = " + solution.romanToInt(s1));
        System.out.println("solution.romanToInt(s2) = " + solution.romanToInt(s2));
        System.out.println("solution.romanToInt(s3) = " + solution.romanToInt(s3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int romanToInt(String s) {

        List<Integer> MyList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' -> MyList.add(1);
                case 'V' -> MyList.add(5);
                case 'X' -> MyList.add(10);
                case 'L' -> MyList.add(50);
                case 'C' -> MyList.add(100);
                case 'D' -> MyList.add(500);
                case 'M' -> MyList.add(1000);
            }
        }

        int sum = 0;
        for (int i = MyList.size() - 1; i >= 0; i--) {
            if (i != 0 && MyList.get(i) > MyList.get(i - 1)) {
                sum += (MyList.get(i) - MyList.get(i - 1));
                i--;
            } else
                sum += MyList.get(i);
        }
        return sum;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



