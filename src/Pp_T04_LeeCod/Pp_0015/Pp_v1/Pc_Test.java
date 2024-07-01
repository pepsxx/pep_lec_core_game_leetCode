package Pp_T04_LeeCod.Pp_0015.Pp_v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/3sum/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
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
        List<List<Integer>> triplets = new ArrayList<>();
        if (nums.length < 3) return triplets;

        for (int x = 0; x < nums.length - 2; x++) {
            for (int y = x + 1; y < nums.length - 1; y++) {
                for (int z = y + 1; z < nums.length; z++) {
                    if (nums[x] + nums[y] + nums[z] == 0) {

                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[x]);
                        tempList.add(nums[y]);
                        tempList.add(nums[z]);
                        Collections.sort(tempList);

                        if (triplets.isEmpty()) triplets.add(tempList);

                        boolean equal = true;
                        for (List<Integer> triplet : triplets) {
                            equal = true;
                            for (int i = 0; i < 3; i++) {
                                if (triplet.get(i) != tempList.get(i)) {
                                    equal = false;
                                }
                            }
                            if (equal) break;

                        }
                        if (!equal) {
                            triplets.add(tempList);
                        }
                    }
                }
            }
        }
        return triplets;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



