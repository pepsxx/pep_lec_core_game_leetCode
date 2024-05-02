package Pp_T03_AliAdv.Pp_L04_List_LinkedList_2.Pp_t_L;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Связный список LinkedList - Как устроен.
    public static void main(String[] args) {
        Pc_t_LinkedList po_t_LL1 = new Pc_t_LinkedList();

        po_t_LL1.pf_t_add(11);
        po_t_LL1.pf_t_add(22);
        po_t_LL1.pf_t_add(33);

        System.out.println("po_t_LL1.pf_t_get(2) = " + po_t_LL1.pf_t_get(2));
        System.out.println("po_t_LL1.pf_t_get(1) = " + po_t_LL1.pf_t_get(1));
        System.out.println("po_t_LL1.pf_t_get(0) = " + po_t_LL1.pf_t_get(0));

        System.out.println("po_t_LL1 = " + po_t_LL1);
        po_t_LL1.pf_t_rem(1);
        System.out.println("po_t_LL1 = " + po_t_LL1);
        po_t_LL1.pf_t_rem(0);
        System.out.println("po_t_LL1 = " + po_t_LL1);
        po_t_LL1.pf_t_rem(0);
        System.out.println("po_t_LL1 = " + po_t_LL1);

        po_t_LL1.pf_t_add(123);
        po_t_LL1.pf_t_add(456);
        po_t_LL1.pf_t_add(789);

        System.out.println("po_t_LL1.pf_t_get(2) = " + po_t_LL1.pf_t_get(2));
        System.out.println("po_t_LL1.pf_t_get(1) = " + po_t_LL1.pf_t_get(1));
        System.out.println("po_t_LL1.pf_t_get(0) = " + po_t_LL1.pf_t_get(0));

        System.out.println("po_t_LL1 = " + po_t_LL1);
        po_t_LL1.pf_t_rem(1);
        System.out.println("po_t_LL1 = " + po_t_LL1);
        po_t_LL1.pf_t_rem(0);
        System.out.println("po_t_LL1 = " + po_t_LL1);
        po_t_LL1.pf_t_rem(0);
        System.out.println("po_t_LL1 = " + po_t_LL1);





    }
}
