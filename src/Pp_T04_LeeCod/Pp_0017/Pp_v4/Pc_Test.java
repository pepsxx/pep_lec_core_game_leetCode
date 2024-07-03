package Pp_T04_LeeCod.Pp_0017.Pp_v4;

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
        Solution solution1 = new Solution();
        System.out.println("solution.letterCombinations(s1) = " + solution1.letterCombinations(s1));
        Solution solution2 = new Solution();
        System.out.println("solution.letterCombinations(s2) = " + solution2.letterCombinations(s2));
        Solution solution3 = new Solution();
        System.out.println("solution.letterCombinations(s3) = " + solution3.letterCombinations(s3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    static private final String[][] keyboard = {{},                       //    0
            {}, {"a", "b", "c"}, {"d", "e", "f"},                         // 1, 2, 3
            {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"},            // 4, 5, 6
            {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}}; // 7, 8, 9
    private final List<String> resultList = new ArrayList<>();
    private final List<String[]> keysPress = new ArrayList<>();


    public List<String> letterCombinations(String digits) {

        if (digits.isEmpty()) return resultList;

        int number = Integer.parseInt(new StringBuilder(digits).reverse().toString());

        while (number > 0) {
            this.keysPress.add(keyboard[number % 10]);
            number /= 10;
        }

        this.method("", this.keysPress.get(0), 0);
        return resultList;
    }

    public void method(String s, String[] key, int iterator) {
        int i = 0;
        while (i < (key.length)) {
            if (iterator < this.keysPress.size() - 1) {
                this.method((s + key[i]), this.keysPress.get(iterator + 1), iterator + 1);
            } else {
                resultList.add(s + key[i]);
            }
            i++;
        }
    }
}
//--------------------------------------------------------------------------------------------------------------------//



