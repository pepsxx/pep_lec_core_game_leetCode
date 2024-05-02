package Pp_T01_AliBeg.Pp_L49_Recursion;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=9Hs7DuIJ3LE
    //Java для начинающих. Урок 49: Рекурсия.
    public static void main(String[] args) {
        //pf_someMethod();
        pf_counter(3);
        System.out.println("--------------------------------------------------");
        //4! = 4 * 3 * 2 * 1
        System.out.println("pf_fac(4) = " + pf_fac(4));
    }

    public static void pf_someMethod() {
        System.out.println("Hello!");
        pf_someMethod();
    }

    public static void pf_counter(int pmi_n) {
        if (pmi_n == 0) return;
        System.out.println(pmi_n);
        pf_counter(pmi_n - 1);
    }

    // fac(4) = 4 * fac(3)
    //              fac(3) = 3 * fac(2)
    //                           fac(2) = 2 * fac(1)
    //                                        fac(1) = return 1;
    public static int pf_fac(int pmi_n) {
        if (pmi_n == 1) {
            System.out.println("pf_fac(" + pmi_n + ") = 1");
            System.out.println();
            return 1;
        }
        System.out.println("pf_fac(" + pmi_n + ") = " + pmi_n + " * pf_fac(" + (pmi_n - 1) + ")");
        return pmi_n * pf_fac(--pmi_n);
    }
}
