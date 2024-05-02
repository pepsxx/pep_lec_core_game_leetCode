package Pp_T04.Pp_0002.Pp_v002;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/add-two-numbers/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        System.out.println("l1.val           = " + l1.val);
        System.out.println("l1.next.val      = " + l1.next.val);
        System.out.println("l1.next.next.val = " + l1.next.next.val);

        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println("l2.val           = " + l2.val);
        System.out.println("l2.next.val      = " + l2.next.val);
        System.out.println("l2.next.next.val = " + l2.next.next.val);


//--------------------------------------------------------------------------------------------------------------------//
        Solution solution = new Solution();
//--------------------------------------------------------------------------------------------------------------------//
        ListNode resultList = solution.addTwoNumbers(l1, l2);
//--------------------------------------------------------------------------------------------------------------------//
    }
}


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
    private static List<Integer> MyTempList = new ArrayList<>();

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        MyTempList.clear();
        int dec = 0;
        while (l1 != null || l2 != null || dec != 0) {
            dec = sumTemp(l1, l2, dec);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        ListNode nodeMyFinal = null;
        for (int i = MyTempList.size() - 1; i >= 0; i--) {
            nodeMyFinal = nodeCreat(MyTempList.get(i), nodeMyFinal);
        }

        System.out.println("MyTempList.toString() = " + MyTempList.toString());
        return nodeMyFinal;
    }

    public static ListNode nodeCreat(int value, ListNode next) {
        return new ListNode(value, next);
    }

    private static int sumTemp(ListNode l1, ListNode l2, int dec) {
        int temp, t1 = 0, t2 = 0;
        if (l1 != null) t1 = l1.val;
        if (l2 != null) t2 = l2.val;
        temp = t1 + t2 + dec;
        MyTempList.add(temp % 10);
        dec = temp / 10;
        return dec;
    }
}


