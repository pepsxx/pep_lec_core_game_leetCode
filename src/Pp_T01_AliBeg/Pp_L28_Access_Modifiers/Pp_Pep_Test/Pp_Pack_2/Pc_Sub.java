package Pp_T01_AliBeg.Pp_L28_Access_Modifiers.Pp_Pep_Test.Pp_Pack_2;

import Pp_T01_AliBeg.Pp_L28_Access_Modifiers.Pp_Pep_Test.Pp_Pack_1.Pc_Pri;

public class Pc_Sub extends Pc_Pri {
    static public String psSt_publ_Pck2 = "public";
    static protected String psSt_prot_Pck2 = "protected";
    static String psSt_defa_Pck2 = "default";
    static private String psSt_priv_Pck2 = "private";
    public String pgSt_publ_Pck2 = "public";
    protected String pgSt_prot_Pck2 = "protected";
    String pgSt_defa_Pck2 = "default";
    private String pgSt_priv_Pck2 = "private";

    public static void main(String[] args) {
        Pc_Pri po_Pri = new Pc_Pri();
        Pc_Sub po_Sub = new Pc_Sub();

/*
        // public переменные класса (static), переменные объекта, методы
        // Всегда доступны.                                                
        System.out.println(Pc_Pri.psSt_publ_Pck1); // +++++++++++++++
        System.out.println(Pc_Sub.psSt_publ_Pck1); // +++++++++++++++
        System.out.println(Pc_Sub.psSt_publ_Pck2); // +++++++++++++++
        System.out.println(po_Pri.pgSt_publ_Pck1); // +++++++++++++++
        System.out.println(po_Sub.pgSt_publ_Pck1); // +++++++++++++++
        System.out.println(po_Sub.pgSt_publ_Pck2); // +++++++++++++++
        po_Pri.pf_publ_Pck1();                     // +++++++++++++++
        po_Sub.pf_publ_Pck1();                     // +++++++++++++++
        po_Sub.pf_publ_Pck2();                     // +++++++++++++++

        // private переменные класса (static), переменные объекта, методы
        // Доступны в пределах Класса.                Sub
        System.out.println(Pc_Pri.psSt_priv_Pck1); // --------------- Pri
        System.out.println(Pc_Sub.psSt_priv_Pck1); // --------------- Pri_to_Sub
        System.out.println(Pc_Sub.psSt_priv_Pck2); // +++++++++++++++ Sub
        System.out.println(po_Pri.pgSt_priv_Pck1); // --------------- Pri
        System.out.println(po_Sub.pgSt_priv_Pck1); // --------------- Pri_to_Sub
        System.out.println(po_Sub.pgSt_priv_Pck2); // +++++++++++++++ Sub
        po_Pri.pf_priv_Pck1();                     // --------------- Pri
        po_Sub.pf_priv_Pck1();                     // --------------- Pri_to_Sub
        po_Sub.pf_priv_Pck2();                     // +++++++++++++++ Sub

        // default переменные класса (static), переменные объекта, методы
        // Доступны в пределах Пакета                 Pck2                   
        System.out.println(Pc_Pri.psSt_defa_Pck1); // --------------- Pck1
        System.out.println(Pc_Sub.psSt_defa_Pck1); // --------------- Pck1_to_Pck2
        System.out.println(Pc_Sub.psSt_defa_Pck2); // +++++++++++++++ Pck2
        System.out.println(po_Pri.pgSt_defa_Pck1); // --------------- Pck1
        System.out.println(po_Sub.pgSt_defa_Pck1); // --------------- Pck1_to_Pck2
        System.out.println(po_Sub.pgSt_defa_Pck2); // +++++++++++++++ Pck2
        po_Pri.pf_defa_Pck1();                     // --------------- Pck1
        po_Sub.pf_defa_Pck1();                     // --------------- Pck1_to_Pck2
        po_Sub.pf_defa_Pck2();                     // +++++++++++++++ Pck2

        //protected переменные класса (static), переменные объекта, методы
        // Доступны в пределах Пакета + Подкласс      Pri_to_Sub Pck2
        System.out.println(Pc_Pri.psSt_prot_Pck1); // +++++++++++++++ Pri             Pck1 ? Возможно из-за того что эта общая переменная Класса ?
        System.out.println(Pc_Sub.psSt_prot_Pck1); // +++++++++++++++ Pri_to_Sub +    Pck1_to_Pck2
        System.out.println(Pc_Sub.psSt_prot_Pck2); // +++++++++++++++ Sub           + Pck2
        System.out.println(po_Pri.pgSt_prot_Pck1); // --------------- Pri             Pck1
        System.out.println(po_Sub.pgSt_prot_Pck1); // +++++++++++++++ Pri_to_Sub +    Pck1_to_Pck2
        System.out.println(po_Sub.pgSt_prot_Pck2); // +++++++++++++++ Sub           + Pck2
        po_Pri.pf_prot_Pck1();                     // --------------- Pri             Pck1
        po_Sub.pf_prot_Pck1();                     // +++++++++++++++ Pri_to_Sub +    Pck1_to_Pck2
        po_Sub.pf_prot_Pck2();                     // +++++++++++++++ Sub           + Pck2
*/
    }

    public void pf_publ_Pck2() {
    }

    protected void pf_prot_Pck2() {
    }

    void pf_defa_Pck2() {
    }

    private void pf_priv_Pck2() {
    }
}
