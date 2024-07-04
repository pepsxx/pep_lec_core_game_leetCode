package Pp_T04_LeeCod.Pp_0018.Pp_v2;

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
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        Solution solution3 = new Solution();
        Solution solution4 = new Solution();
        Solution solution5 = new Solution();
        System.out.println("solution1.fourSum(nums1, x1) = " + solution1.fourSum(nums1, x1));
        System.out.println("solution2.fourSum(nums2, x2) = " + solution2.fourSum(nums2, x2));
        System.out.println("solution3.fourSum(nums3, x3) = " + solution3.fourSum(nums3, x3));
        System.out.println("solution4.fourSum(nums4, x4) = " + solution4.fourSum(nums4, x4));
        System.out.println("solution5.fourSum(nums5, x5) = " + solution5.fourSum(nums5, x5));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return result;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            this.tripleStart(nums, target, i, i + 1, nums.length - 1);
        }
        return result;
    }

    public void tripleStart(int[] nums, int tar, int cor, int str, int fin) {
        int stp = fin - 2;
        int mid;
        long sum;
        tar -= nums[cor];
        while (str <= stp) {
            if (str - 1 != cor && nums[str] == nums[str - 1]) {
                str++;
                continue;
            }
            mid = str + 1;
            fin = stp + 2;
            while (mid < fin) {
                if (mid - 1 != str && nums[mid] == nums[mid - 1]) {
                    mid++;
                    continue;
                }
                if (fin != nums.length - 1 && nums[fin] == nums[fin + 1]) {
                    fin--;
                    continue;
                }


                sum = (long) nums[str] + nums[mid] + nums[fin];
                if (sum < tar) {
                    mid++;
                } else if (sum > tar) {
                    fin--;
                } else {
                    if (sum < Integer.MAX_VALUE) {
                        this.result.add(List.of(nums[cor], nums[str], nums[mid], nums[fin]));
                    }
                    mid++;
                }
            }
            str++;
        }
    }

}
//--------------------------------------------------------------------------------------------------------------------//



