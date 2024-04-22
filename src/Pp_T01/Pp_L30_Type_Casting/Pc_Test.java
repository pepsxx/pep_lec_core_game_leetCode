package Pp_T01.Pp_L30_Type_Casting;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=bHWDG9bfDRg
    //Java для начинающих. Урок 30: Приведение примитивных типов данных.
    public static void main(String[] args) {
        byte pmy_T1 = 102;                            // Бит: 8,  Байт: 1, Диапазон: [-128;127], 01111111
        short pms_T1 = 30_000;                        // Бит: 16, Байт: 2, Диапазон: [-32_768;32_767], 01111111_11111111
        int pmi_T1 = 2_000_000_000;                   // Бит: 32, Байт: 4, Диапазон: [-2_147_483_648;2_147_483_647], 01111111_11111111_11111111_11111111
        long poLi_T1 = 9_000_000_000_000_000_000L; //L // Бит: 64, Байт: 8, Диапазон: [-9_223_372_036_854_775_808;9_223_372_036_854_775_807], 01111111_11111111_11111111_11111111_11111111_11111111_11111111_11111111

        float pmf_T1 = 1.0F;                      //F // Бит: 32, Байт: 4
        double pmd_T1 = 1.0;                          // Бит: 64, Байт: 8

        char pmc_T1 = 'c';
        boolean pmb_T1 = true;

        // byte -> short -> char -> int -> long -> float -> double
        int pm_a =123;
        long pm_l = pm_a;     // int < long. Приведение типа - не явное (делается за нас).
        int pm_x = (int)pm_l; // long > int. Приведение типа - явное.
        System.out.println(pm_x);

        //float pmf_T2 = 1.0;       // Ошибка. Не сделано приведение.
        float pmf_T3 = 1.0F;        // Явное приведение с помощью "F"
        float pmf_T4 = (float) 1.0; // Явное приведение с помощью "(float)"

        int pm_a2 = 123;
        double pm_x2 = pm_a2;
        System.out.println(pm_x2);

        double pm_x3 = 123.5;
        int pm_y3 = (int) pm_x3;        // Идет не округление, а отрезка вещественной части числа.
        System.out.println(pm_y3);

        long pm_l3 = Math.round(pm_x3); // округление.
        System.out.println(pm_l3);

        // Примеры ошибок при явном приведении. Число больше возможного (127).
        System.out.println("--------------------------------------------------");
        byte pm_y11 = (byte)128;
        System.out.println(pm_y11);
        byte pm_y12 = (byte)129;
        System.out.println(pm_y12);
        byte pm_y13 = (byte)130;
        System.out.println(pm_y13);
        byte pm_y14 = (byte)131;
        System.out.println(pm_y14);
        byte pm_y15 = (byte)132;
        System.out.println(pm_y15);






    }
}
