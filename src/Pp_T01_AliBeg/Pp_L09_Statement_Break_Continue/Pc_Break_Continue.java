package Pp_T01_AliBeg.Pp_L09_Statement_Break_Continue;

public class Pc_Break_Continue {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=otfC1v5YVAY
    //Java для начинающих. Урок 9: Операторы break и continue.
    public static void main(String[] args) {
        int pmi_i = 0;
        while (true) {
            if (pmi_i == 15) {
                break;
            }
            System.out.println(pmi_i);
            pmi_i++;
        }
        System.out.println("Мы вышли из цикла");

        for (int pmi_i2 = 0; pmi_i2 <= 15; pmi_i2++) {
            if (pmi_i2 % 2 == 0) {
                continue;
            }
            System.out.println("Это нечетное число " + pmi_i2);
        }
    }
}
