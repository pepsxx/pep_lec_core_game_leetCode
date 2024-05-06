package Pp_T04_LeeCod.Pp_0035.Pp_v2;

public class Pc_Test {
    //https://leetcode.com/problems/search-insert-position/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 5;
        int[] nums1 = {1, 3, 5, 6};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {1, 3, 5, 6};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 66_666_666;
        int[] nums3 = new int[200_000_000];
        for (int i = 0; i < nums3.length; i++) {
            nums3[i] = i;
        }
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.searchInsert(nums1, x1) = " + solution.searchInsert(nums1, x1));
        System.out.println("solution.searchInsert(nums2, x2) = " + solution.searchInsert(nums2, x2));
        double t1 = System.currentTimeMillis();
        System.out.println("solution.searchInsert(nums3, x3) = " + solution.searchInsert(nums3, x3));
        double t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int searchInsert(int[] nums, int target) {

        if (target <= nums[0]) return 0;
        if (nums[nums.length - 1] < target) return nums.length;
        if (nums.length == 1) return 0;

        int str = 0;
        int end = nums.length - 1;
        int med;
        int x=0;

        while (true) {
            med = str + ((end - str) / 2);
            System.out.println("x++ = " + x++);
            if (nums[med] == target) return med;
            else if (nums[med] < target) str = med;
            else end = med;

            if (end - str == 1) return end;
        }
    }
}

//--------------------------------------------------------------------------------------------------------------------//



