package Pp_T01.Pp_L08_Loop_DoWhile;

import java.util.Scanner;

public class Pc_DoWhile {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=XV1M9sSWrhI
    //Java для начинающих. Урок 8: Цикл do...while.
    public static void main(String[] args) {
        Scanner poSc_scaner = new Scanner(System.in);

        System.out.println("Введи 5");
        int pmi_value = poSc_scaner.nextInt();
        while (pmi_value != 5) {
            System.out.println("Введи 5");
            pmi_value = poSc_scaner.nextInt();
        }
        System.out.println("Вы ввели 5");

        System.out.println();

        int pmi_value2;
        do {
            System.out.println("Введи 3");
            pmi_value2 = poSc_scaner.nextInt();
        } while (pmi_value2 != 3);
        System.out.println("Вы ввели 3");
    }
}
