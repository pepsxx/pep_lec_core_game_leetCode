package Pp_T04_LeeCod.Pp_0027.Pp_v1;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/remove-element/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 3;
        int[] nums1 = {3, 2, 2, 3};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.removeElement(nums1, x1) = " + solution.removeElement(nums1, x1));
        System.out.println("solution.removeElement(nums2, x2) = " + solution.removeElement(nums2, x2));
        System.out.println("solution.removeElement(nums3, x3) = " + solution.removeElement(nums3, x3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> myList = new ArrayList<>();
        for (int num : nums) {
            if (num!=val)
                myList.add(num);
        }
        System.out.println("myList.toString() = " + myList.toString());
        for (int i = 0; i < myList.size(); i++) {
            nums[i] = myList.get(i);
        }
        return myList.size();
    }
}
//--------------------------------------------------------------------------------------------------------------------//



