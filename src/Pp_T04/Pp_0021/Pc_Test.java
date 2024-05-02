package Pp_T04.Pp_0021;

public class Pc_Test {
    //https://leetcode.com/problems/merge-two-sorted-lists/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//

        ListNode l11 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode l12 = null;
        ListNode l13 = null;
//        System.out.println("l1.val           = " + l1.val);
//        System.out.println("l1.next.val      = " + l1.next.val);
//        System.out.println("l1.next.next.val = " + l1.next.next.val);

        ListNode l21 = new ListNode(2, new ListNode(4, new ListNode(6)));
        ListNode l22 = null;
        ListNode l23 = new ListNode(0);
//        System.out.println("l2.val           = " + l2.val);
//        System.out.println("l2.next.val      = " + l2.next.val);
//        System.out.println("l2.next.next.val = " + l2.next.next.val);

//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
        System.out.println("solution.mergeTwoLists(l11, l21).val = " + solution.mergeTwoLists(l11, l21).val);
        System.out.println("solution.mergeTwoLists(l12, l22)     = " + solution.mergeTwoLists(l12, l22));
        System.out.println("solution.mergeTwoLists(l13, l23).val = " + solution.mergeTwoLists(l13, l23).val);
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

//--------------------------------------------------------------------------------------------------------------------//

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return list1;
        else if (list1 == null) return list2;
        else if (list2 == null) return list1;

        ListNode listMyReturn;
        ListNode listMyTemp;

        if (list1.val <= list2.val) {
            listMyReturn = list1;
            list1 = list1.next;
        } else {
            listMyReturn = list2;
            list2 = list2.next;
        }

        listMyTemp = listMyReturn;

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                listMyTemp.next = list2;
                break;
            } else if (list2 == null) {
                listMyTemp.next = list1;
                break;
            }

            if (list1.val <= list2.val) {
                listMyTemp.next = list1;
                listMyTemp = list1;
                list1 = list1.next;
            } else {
                listMyTemp.next = list2;
                listMyTemp = list2;
                list2 = list2.next;
            }
        }
        return listMyReturn;
    }
}
//--------------------------------------------------------------------------------------------------------------------//



