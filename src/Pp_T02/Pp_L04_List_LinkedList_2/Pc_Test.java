package Pp_T02.Pp_L04_List_LinkedList_2;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Связный список LinkedList - Как устроен.
    public static void main(String[] args) {
        Pc_MyLinkedList po_myLinkedList = new Pc_MyLinkedList();
        po_myLinkedList.pf_add(1);
        po_myLinkedList.pf_add(2);
        po_myLinkedList.pf_add(10);
        System.out.println("po_myLinkedList = " + po_myLinkedList);
        System.out.println("po_myLinkedList.pf_get(0) = " + po_myLinkedList.pf_get(0));
        System.out.println("po_myLinkedList.pf_get(1) = " + po_myLinkedList.pf_get(1));
        System.out.println("po_myLinkedList.pf_get(2) = " + po_myLinkedList.pf_get(2));

        po_myLinkedList.pf_remove(1);
        System.out.println("po_myLinkedList = " + po_myLinkedList);
        po_myLinkedList.pf_remove(1);
        System.out.println("po_myLinkedList = " + po_myLinkedList);
    }
}
