package Pp_T04_LeeCod.Pp_0002.Pp_v001;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://leetcode.com/problems/add-two-numbers/
    public static void main(String[] args) {
//--------------------------------------------------------------------------------------------------------------------//
//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//        System.out.println("l1.val           = " + l1.val);
//        System.out.println("l1.next.val      = " + l1.next.val);
//        System.out.println("l1.next.next.val = " + l1.next.next.val);
//
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
//        System.out.println("l2.val           = " + l2.val);
//        System.out.println("l2.next.val      = " + l2.next.val);
//        System.out.println("l2.next.next.val = " + l2.next.next.val);

        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9))))))))));

//--------------------------------------------------------------------------------------------------------------------//
        double time = System.currentTimeMillis();
        Solution solution = new Solution();
//--------------------------------------------------------------------------------------------------------------------//
        ListNode resultList = solution.addTwoNumbers(l1, l2);
        System.out.println("resultList.val = " + resultList.val);
//--------------------------------------------------------------------------------------------------------------------//
        System.out.println("(System.currentTimeMillis()-t) = " + (System.currentTimeMillis() - time));
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Long sum = listToNumber(l1) + listToNumber(l2);
        System.out.println("listToNumber(l1) = " + listToNumber(l1));
        System.out.println("listToNumber(l2) = " + listToNumber(l2));
        System.out.println("sum = " + sum);

        ListNode nodeMyFinal = null;
        List<Integer> listForInversion = new ArrayList<>();

        int p = ((int) Long.toString(sum).length());

        for (int i = 0; i < p; i++) {
            listForInversion.add((int)(sum % 10));
            sum /= 10;
        }

        for (int i = listForInversion.size() - 1; i >= 0; i--) {
            nodeMyFinal = nodeCreat(listForInversion.get(i), nodeMyFinal);
        }
        return nodeMyFinal;
    }

    public static ListNode nodeCreat(int value, ListNode next) {
        return new ListNode(value, next);
    }

    private static Long listToNumber(ListNode l) {
        ListNode lt = l;
        List<Integer> listMyTemp = new ArrayList<>();
        while (true) {
            listMyTemp.add(lt.val);
            if (lt.next == null) break;
            lt = lt.next;
        }
        Long number = 0L;
        for (int i = 0; i < listMyTemp.size(); i++){
            System.out.println("listMyTemp.get(i) = " + listMyTemp.get(i));
            number = number + (listMyTemp.get(i) *  (long)Math.pow(10, i));
        }
        return number;
    }
}


