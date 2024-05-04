package Pp_T04_LeeCod.Pp_0066;

import java.util.Arrays;

public class Pc_Test {
    //https://leetcode.com/problems/plus-one/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 2, 3};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {4, 3, 2, 1};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {9};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("Arrays.toString(solution.plusOne(nums1)) = " + Arrays.toString(solution.plusOne(nums1)));
        System.out.println("Arrays.toString(solution.plusOne(nums2)) = " + Arrays.toString(solution.plusOne(nums2)));
        System.out.println("Arrays.toString(solution.plusOne(nums3)) = " + Arrays.toString(solution.plusOne(nums3)));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
                if (i == 0) {
                    int[] digitsPlus = new int[digits.length + 1];
                    digitsPlus[0] = 1;
                    for (int j = 0; j < digits.length; j++)
                        digitsPlus[j + 1] = digits[i];
                    return digitsPlus;
                }
            }
        }
        return digits;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



