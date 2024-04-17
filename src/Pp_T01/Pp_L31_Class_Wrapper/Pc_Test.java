package Pp_T01.Pp_L31_Class_Wrapper;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=P7b_dzMFG7s
    //Java для начинающих. Урок 31: Классы-обертки примитивных типов данных.
    public static void main(String[] args) {
        // У примитивов нет методов, эту проблему решают Классы-обертки.
        // Классы-обертки
        // Double, Float, Long, Integer, Short, Byte, Character, Boolean.
        int pmi_x = 1;
        Integer pmIn_x1 = 1;                     // Упаковка в обертку.
        Integer pmIn_x2 = new Integer(12); // Упаковка в обертку.
        Integer pmIn_x3 = Integer.parseInt("123");

        int pmi_y = pmIn_x1;

        System.out.println("pmIn_x1 = " + pmIn_x1);
        System.out.println("pmIn_x2 = " + pmIn_x2);
        System.out.println("pmIn_x3 = " + pmIn_x3);
        System.out.println("pmi_y = " + pmi_y);

        Boolean pmBo_b = Boolean.TRUE;
        System.out.println("pmBo_b = " + pmBo_b);

    }
}
