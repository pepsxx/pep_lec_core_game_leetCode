package Pp_T02.Pp_L04_LinkedList_2.Pp_t_A;

import Pp_T02.Pp_L04_LinkedList_2.Pp_t_L.Pc_t_LinkedList;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Связный список LinkedList - Как устроен.
    public static void main(String[] args) {
        Pc_t_ArrayList po_t_AL1 = new Pc_t_ArrayList();

        System.out.println("po_t_LL1 = " + po_t_AL1);
        po_t_AL1.pf_t_add(101);
        System.out.println("po_t_LL1 = " + po_t_AL1);
        po_t_AL1.pf_t_add(202);
        System.out.println("po_t_LL1 = " + po_t_AL1);
        po_t_AL1.pf_t_add(303);
        System.out.println("po_t_LL1 = " + po_t_AL1);

        System.out.println("po_t_AL1.pf_t_get(2) = " + po_t_AL1.pf_t_get(2));
        System.out.println("po_t_AL1.pf_t_get(1) = " + po_t_AL1.pf_t_get(1));
        System.out.println("po_t_AL1.pf_t_get(0) = " + po_t_AL1.pf_t_get(0));

        System.out.println("po_t_AL1 = " + po_t_AL1);
        po_t_AL1.pf_t_rem(1);
        System.out.println("po_t_AL1 = " + po_t_AL1);
        po_t_AL1.pf_t_rem(0);
        System.out.println("po_t_AL1 = " + po_t_AL1);
        po_t_AL1.pf_t_rem(0);
        System.out.println("po_t_LL1 = " + po_t_AL1);

        System.out.println("po_t_LL1 = " + po_t_AL1);
        po_t_AL1.pf_t_add(101);
        System.out.println("po_t_LL1 = " + po_t_AL1);
        po_t_AL1.pf_t_add(202);
        System.out.println("po_t_LL1 = " + po_t_AL1);
        po_t_AL1.pf_t_add(303);
        System.out.println("po_t_LL1 = " + po_t_AL1);

        System.out.println("po_t_AL1.pf_t_get(2) = " + po_t_AL1.pf_t_get(2));
        System.out.println("po_t_AL1.pf_t_get(1) = " + po_t_AL1.pf_t_get(1));
        System.out.println("po_t_AL1.pf_t_get(0) = " + po_t_AL1.pf_t_get(0));

        System.out.println("po_t_AL1 = " + po_t_AL1);
        po_t_AL1.pf_t_rem(1);
        System.out.println("po_t_AL1 = " + po_t_AL1);
        po_t_AL1.pf_t_rem(0);
        System.out.println("po_t_AL1 = " + po_t_AL1);
        po_t_AL1.pf_t_rem(0);
        System.out.println("po_t_LL1 = " + po_t_AL1);
    }
}
