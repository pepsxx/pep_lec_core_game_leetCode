package Pp_T04_LeeCod.Pp_0088.Pp_v1;

public class Pc_Test {
    //https://leetcode.com/problems/merge-sorted-array/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 0;
        int[] nums1 = {0};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 1;
        int[] nums2 = {1};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        solution.merge(nums1, x1, nums2, x2);
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int idx1 = m - 1;
        int idx2 = n - 1;

        while (idx1 >= 0 && idx2 >= 0) {
            if (nums1[idx1] <= nums2[idx2])
                nums1[idx1+idx2+1] = nums2[idx2--];
            else nums1[idx1+idx2+1] = nums1[idx1--];
        }

        if (idx2 >= 0) {
            for (int i = 0; i <= idx2; i++)
                nums1[i] = nums2[i];
        }
    }
}
//--------------------------------------------------------------------------------------------------------------------//



