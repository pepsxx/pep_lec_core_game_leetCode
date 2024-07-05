package Pp_T04_LeeCod.Pp_0019;

public class Pc_Test {
    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
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

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        System.out.println("-----------------------------------------------------------------------------------------");

//--------------------------------------------------------------------------------------------------------------------//


        Solution solution = new Solution();
        ListNode lt = solution.removeNthFromEnd(l1, 2);
        solution.counterListNode(lt);
    }
}

//--------------------------------------------------------------------------------------------------------------------//

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n < 1) return head;
        if (n == 1 && head.next == null) return null;

        int ndxForDelete = this.counterListNode(head) - n + 1;
        if (ndxForDelete == 0) return head.next;
        this.listNodeDelete(head, ndxForDelete);

        return head;
    }

    public int counterListNode(ListNode listNode) {
        int ndxTmp = 0;
        while (true) {
            if (listNode.next == null) break;
            listNode = listNode.next;
            ndxTmp++;
        }
        return ndxTmp;
    }

    public void listNodeDelete(ListNode listNode, int ndx) {
        int ndxTmp = 0;
        while (true) {
            if (ndxTmp + 1 == ndx) {
                listNode.next = listNode.next.next;
                break;
            }
            if (listNode.next == null) break;
            listNode = listNode.next;
            ndxTmp++;
        }
    }
}
//--------------------------------------------------------------------------------------------------------------------//



