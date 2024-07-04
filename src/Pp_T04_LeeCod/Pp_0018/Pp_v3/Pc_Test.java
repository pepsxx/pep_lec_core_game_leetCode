package Pp_T04_LeeCod.Pp_0018.Pp_v3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/4sum/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 0;
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 8;
        int[] nums2 = {2, 2, 2, 2, 2};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 0;
        int[] nums3 = {-3, -2, -1, 0, 0, 1, 2, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
        int x4 = 3;
        int[] nums4 = {-3, -4, -5, 0, -5, -2, 5, 2, -3};
        int x5 = -294967296;
        int[] nums5 = {1000000000, 1000000000, 1000000000, 1000000000};
        int x6 = 0;
        int[] nums6 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.fourSum(nums1, x1) = " + solution.fourSum(nums1, x1));
        System.out.println("solution.fourSum(nums2, x2) = " + solution.fourSum(nums2, x2));
        System.out.println("solution.fourSum(nums3, x3) = " + solution.fourSum(nums3, x3));
        System.out.println("solution.fourSum(nums4, x4) = " + solution.fourSum(nums4, x4));
        System.out.println("solution.fourSum(nums5, x5) = " + solution.fourSum(nums5, x5));
        System.out.println("solution.fourSum(nums6, x6) = " + solution.fourSum(nums6, x6));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 4) return result;
        Arrays.sort(nums);
        if ((target / 4) > nums[nums.length - 1] || (target / 4) < nums[0]) return result;

        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            if ((target - nums[i]) / 3 > nums[nums.length - 1] || (target - nums[i]) / 3 < nums[i+1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if ((j - 1) != i && nums[j] == nums[j - 1]) continue;
                if ((target - nums[i] - nums[j]) / 2 > nums[nums.length - 1] || (target - nums[i] - nums[j]) / 2 < nums[j+1]) continue;
                this.towSplash(nums, (target - nums[i] - nums[j]), (j + 1), nums.length - 1, result, i, j);
            }
        }
        return result;
    }

    public void towSplash(int[] nums, int tar, int str, int fin, List<List<Integer>> result, int i, int j) {
        long sum;
        while (str < fin) {
            sum = nums[str] + nums[fin];

            if (str - 1 != j && nums[str] == nums[str - 1]) {
                str++;
                continue;
            }
            if (fin != nums.length - 1 && nums[fin] == nums[fin + 1]) {
                fin--;
                continue;
            }

            if (sum < tar) {
                str++;
            } else if (sum > tar) {
                fin--;
            } else {
                sum += (long) nums[i] + nums[j];
                if (sum < Integer.MAX_VALUE && sum > Integer.MIN_VALUE) {
                    result.add(List.of(nums[i], nums[j], nums[str], nums[fin]));
                }
                str++;
            }
        }
    }
}
//--------------------------------------------------------------------------------------------------------------------//












