package Pp_T04_LeeCod.Pp_0004;

import java.util.*;

public class Pc_Test {
    //https://leetcode.com/problems/median-of-two-sorted-arrays/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 2};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {3, 4};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.findMedianSortedArrays(nums1, nums2) = " + solution.findMedianSortedArrays(nums1, nums2));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums1) list.add(i);
        for (int i : nums2) list.add(i);
        Collections.sort(list);
        int m = list.size() / 2;
        if (list.size() % 2 != 0) return list.get(m);
        else return ((double) (list.get(m) + list.get(m - 1))) / 2;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



