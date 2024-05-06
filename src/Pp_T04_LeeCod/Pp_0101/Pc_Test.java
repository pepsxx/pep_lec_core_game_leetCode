package Pp_T04_LeeCod.Pp_0101;

public class Pc_Test {
    //https://leetcode.com/problems/symmetric-tree/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        int x1 = 1;
        int[] nums1 = {1, 1};
        String s1 = "11";
        String[] sm1 = {"111", "111"};
        int x2 = 2;
        int[] nums2 = {2, 2};
        String s2 = "22";
        String[] sm2 = {"222", "222"};
        int x3 = 3;
        int[] nums3 = {3, 3};
        String s3 = "33";
        String[] sm3 = {"333", "333"};
//--------------------------------------------------------------------------------------------------------------------//
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        TreeNode t1 = new TreeNode(0, p1, q1);
        TreeNode p2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode t2 = new TreeNode(0, p2, q2);
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.isSymmetric(t1) = " + solution.isSymmetric(t1));
        System.out.println("solution.isSymmetric(t2) = " + solution.isSymmetric(t2));
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return recurs(root.left, root.right);
    }

    private boolean recurs(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        if (!(recurs(p.left, q.right))) return false;
        if (!(recurs(p.right, q.left))) return false;
        return true;
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


