package Pp_T04_LeeCod.Pp_0011.Pp_v2;

public class Pc_Test {
    //https://leetcode.com/problems/container-with-most-water/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.maxArea(nums1) = " + solution.maxArea(nums1));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int tmp = 0;
        int str = 0;
        int end = height.length - 1;

        while (str < end) {
            tmp = Math.min(height[str], height[end]) * (end - str);
            if (tmp > max) max = tmp;
            if (height[str] < height[end]) str++;
            else end--;
        }
        return max;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



