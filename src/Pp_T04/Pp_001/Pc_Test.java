package Pp_T04.Pp_001;

import java.util.Arrays;

public class Pc_Test {
    //https://leetcode.com/problems/two-sum/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int[] nums1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        int[] nums2 = new int[]{3,2,4};
        int target2 = 6;
        int[] nums3 = new int[]{3,3};
        int target3 = 6;
//--------------------------------------------------------------------------------------------------------------------//
        double time = System.currentTimeMillis();
        Solution solution = new Solution();
        System.out.println("Arrays.toString(solution.twoSum(nums1, target1)) = " + Arrays.toString(solution.twoSum(nums1, target1)));
        System.out.println("Arrays.toString(solution.twoSum(nums2, target2)) = " + Arrays.toString(solution.twoSum(nums2, target2)));
        System.out.println("Arrays.toString(solution.twoSum(nums3, target3)) = " + Arrays.toString(solution.twoSum(nums3, target3)));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        throw new IllegalArgumentException("N");
    }
}
//--------------------------------------------------------------------------------------------------------------------//



