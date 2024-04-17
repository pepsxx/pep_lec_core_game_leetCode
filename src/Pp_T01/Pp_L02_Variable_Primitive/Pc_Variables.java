package Pp_T01.Pp_L02_Variable_Primitive;

public class Pc_Variables {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=lmK15qB_r70
    //Java для начинающих. Урок 2: Переменные. Примитивные типы данных.
    public static void main(String[] args) {
        byte pmy_T1;
        pmy_T1 = 101;
        System.out.println(pmy_T1);

        byte pmy_T2 = 102;
        // Бит: 8,  Байт: 1, Диапазон: [-128;127], 01111111
        System.out.println(pmy_T2);

        short pms_T1 = 30_000;
        // Бит: 16, Байт: 2, Диапазон: [-32_768;32_767], 01111111_11111111
        System.out.println(pms_T1);

        int pmi_T1 = 2_000_000_000;
        // Бит: 32, Байт: 4, Диапазон: [-2_147_483_648;2_147_483_647], 01111111_11111111_11111111_11111111
        System.out.println(pmi_T1);

        long pml_T1 = 9_000_000_000_000_000_000L; //L
        // Бит: 64, Байт: 8, Диапазон: [-9_223_372_036_854_775_808;9_223_372_036_854_775_807], 01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111
        System.out.println(pml_T1);

        float pmf_T1 = 1.0F; //F
        // Бит: 32, Байт: 4
        System.out.println(pmf_T1);

        double pmd_T1 = 1.0;
        // Бит: 64, Байт: 8
        System.out.println(pmd_T1);

        char pmc_T1 = 'c'; //'
        System.out.println(pmc_T1);

        boolean pmb_T1 = true; // true или false
        System.out.println(pmb_T1);
    }
}

