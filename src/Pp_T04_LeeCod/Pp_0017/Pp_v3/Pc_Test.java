package Pp_T04_LeeCod.Pp_0017.Pp_v3;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1};
        String s1 = "23";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "2";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.letterCombinations(s1) = " + solution.letterCombinations(s1));
        System.out.println("solution.letterCombinations(s2) = " + solution.letterCombinations(s2));
        System.out.println("solution.letterCombinations(s3) = " + solution.letterCombinations(s3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.isEmpty()) return list;
        String[][] keyboard = {{},
                {}, {"a", "b", "c"}, {"d", "e", "f"},
                {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"},
                {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};
        List<String[]> keysPress = new ArrayList<>();

//        digits = new StringBuilder(digits).reverse().toString();
        int number = Integer.parseInt(new StringBuilder(digits).reverse().toString());

        while (number > 0) {
            keysPress.add(keyboard[number % 10]);
            number /= 10;
        }

        return method(keysPress, "", keysPress.get(0), 0, list);
    }

    static public List<String> method(List<String[]> keysPress, String s, String[] key, int iterator, List<String> list) {
        int i = 0;
        while (i < (key.length)) {
            if (iterator < keysPress.size() - 1) {
                method(keysPress, (s + key[i]), keysPress.get(iterator + 1), iterator + 1, list);
            } else {
                list.add(s + key[i]);
            }
            i++;
        }
        return list;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



