package Pp_T04_LeeCod.Pp_0067.Pp_v1;

import java.util.Arrays;

public class Pc_Test {
    //https://leetcode.com/problems/add-binary/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1};
        String s1 = "1111";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "1111";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.addBinary(s1, s2) = " + solution.addBinary(s1, s2));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public String addBinary(String a, String b) {
        int maxLen;
        if (a.length() > b.length()) maxLen = a.length();
        else maxLen = b.length();
        int[] m1 = new int[maxLen + 1];
        int[] m2 = new int[maxLen + 1];
        int[] m3 = new int[maxLen + 1];

        int x = maxLen;
        for (int i = a.length() - 1; i >= 0; i--, x--)
            m1[x] = a.charAt(i) - '0';

        x = maxLen;
        for (int i = b.length() - 1; i >= 0; i--, x--)
            m2[x] = b.charAt(i) - '0';

        System.out.println("Arrays.toString(m1) = " + Arrays.toString(m1));
        System.out.println("Arrays.toString(m2) = " + Arrays.toString(m2));

        x = 0;
        int y = 0;
        for (int i = maxLen; i >= 0; i--) {
            y = m2[i] + m1[i] + x;
            System.out.println("y = " + y);
            if (y == 2 || y == 3) {
                m3[i] = y - 2;
                x = 1;
                System.out.println("+");
            } else {
                m3[i] = y;
                x = 0;
            }
        }

        System.out.println("Arrays.toString(m3) = " + Arrays.toString(m3));

        StringBuilder s = new StringBuilder();
        for (int i : m3) {
            s = s.append(i);
        }

        System.out.println("s = " + s);

        if (s.charAt(0) == '0')
            a = s.substring(1);
        else a = s.toString();

        return a;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



