package Pp_T04_LeeCod.Pp_0016;

import java.util.Arrays;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/3sum-closest/description/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {-1, 2, 1, -4};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 1;
        int[] nums2 = {0, 0, 0};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 0;
        int[] nums3 = {1, 1, 1, 1};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.threeSumClosest(nums1, x1) = " + solution.threeSumClosest(nums1, x1));
        System.out.println("solution.threeSumClosest(nums2, x2) = " + solution.threeSumClosest(nums2, x2));
        System.out.println("solution.threeSumClosest(nums3, x3) = " + solution.threeSumClosest(nums3, x3));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length < 3) return 0;
        int result = nums[0] + nums[1] + nums[2];
        int str = 0;
        int med;
        int fin;
        int sum;

        while (str < nums.length - 2) {

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

                if (Math.abs(sum-target) < Math.abs(result-target)) {
                    result = sum;
                }

                if (sum > target) {
                    fin--;
                } else if (sum < target) {
                    med++;
                } else {
                    return sum;
                }

            }

            str++;

        }

        return result;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



