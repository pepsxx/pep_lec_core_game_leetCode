package Pp_T04_LeeCod.Pp_0083;

public class Pc_Test {
    //https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
        ListNode l1 = new ListNode(1, new ListNode(1, new ListNode(1,new ListNode(1))));
//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        solution.deleteDuplicates(l1);
    }
}

//--------------------------------------------------------------------------------------------------------------------//
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if (head != null) recurs(head);
        return head;
    }
    private void recurs (ListNode node) {
        if (node.next == null) return;
        if (node.val == node.next.val) {
            node.next = node.next.next;
            if (node.next != null) recurs(node);
        }
        if (node.next != null) recurs(node.next);
    }
}
//--------------------------------------------------------------------------------------------------------------------//
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


