package Pp_T04_LeeCod.Pp_0015.Pp_v2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/3sum/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {-2, -1, -1, 0, 1, 2, 3};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {1, 0, 1, 4};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {-1, 0, 1, 4};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.threeSum(nums1) = " + solution.threeSum(nums1));
//        System.out.println("solution.threeSum(nums2) = " + solution.threeSum(nums2));
//        System.out.println("solution.threeSum(nums3) = " + solution.threeSum(nums3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length < 3) return result;
        int str = 0;
        int med;
        int fin;
        int sum;

        while (str < nums.length - 2 && nums[str] <= 0) {

            if (str > 0 && nums[str] == nums[str - 1]) {
                str++;
                continue;
            }

            med = str + 1;
            fin = nums.length - 1;

            while (med != fin) {

                if (med > str + 1 && nums[med] == nums[med - 1]) {
                    med++;
                    continue;
                }

                if (fin < nums.length - 1 && nums[fin] == nums[fin + 1]) {
                    fin--;
                    continue;
                }

                sum = nums[str] + nums[med] + nums[fin];
                if (sum > 0) {
                    fin--;
                } else if (sum < 0) {
                    med++;
                } else {
                    result.add(List.of(nums[str], nums[med], nums[fin]));
                    med++;
                }

            }

            str++;

        }

        return result;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



