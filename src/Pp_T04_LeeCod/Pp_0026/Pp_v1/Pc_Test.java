package Pp_T04_LeeCod.Pp_0026.Pp_v1;

public class Pc_Test {
    //https://xXx/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1, 2};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.removeDuplicates(nums1) = " + solution.removeDuplicates(nums1));
//        System.out.println("solution.removeDuplicates(nums2) = " + solution.removeDuplicates(nums2));
//        System.out.println("solution.removeDuplicates(nums3) = " + solution.removeDuplicates(nums3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int[] masMyTemp = new int[nums.length];
        masMyTemp[0] =  nums[0];

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != masMyTemp[k-1]) {
                masMyTemp[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < nums.length; i++)
            nums[i] = masMyTemp[i];

        return k;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



