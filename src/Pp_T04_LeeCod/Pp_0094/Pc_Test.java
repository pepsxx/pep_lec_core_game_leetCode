package Pp_T04_LeeCod.Pp_0094;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/binary-tree-inorder-traversal/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1,1};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2,2};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3,3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();

        System.out.println("solution.inorderTraversal(root) = " + solution.inorderTraversal(root));
    }
}
//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        recurs(root, rs);
        return rs;
    }
    public void recurs (TreeNode node, List<Integer> rs){
        if (node == null) return;
        recurs(node.left, rs);
        rs.add(node.val);
        recurs(node.right, rs);
    }
}
//--------------------------------------------------------------------------------------------------------------------//

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

