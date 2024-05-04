package Pp_T04_LeeCod.Pp_0035;

public class Pc_Test {
    //https://xXx/
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
        int x3 = 7;
        int[] nums3 = {1, 3, 5, 6};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.searchInsert(nums1, x1) = " + solution.searchInsert(nums1, x1));
        System.out.println("solution.searchInsert(nums2, x2) = " + solution.searchInsert(nums2, x2));
        System.out.println("solution.searchInsert(nums3, x3) = " + solution.searchInsert(nums3, x3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            else if (nums[i] < target && (i == (nums.length -1) || nums[i + 1] > target)) return i+1;
        }
        return 0;
    }
}

//--------------------------------------------------------------------------------------------------------------------//



