package Pp_T01_AliBeg.Pp_L10_Statement_Switch;

import java.util.Scanner;

public class Pc_Switch {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=QJHcGWbzk3U
    //Java для начинающих. Урок 10: Оператор switch.
    public static void main(String[] args) {
        Scanner poSc_scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int pmi_age = poSc_scanner.nextInt();
        if (pmi_age == 10) {
            System.out.println("Ты учишься в школе");
        } else {
            if (pmi_age == 18) {
                System.out.println("Ты закончил в школу");
            }
        }

        System.out.println();

        switch (pmi_age) {
            case 0:
                System.out.println("Ты родился");
                break;
            case 7:
                System.out.println("Ты Пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил в школу");
                break;
        }

        System.out.println();


        String pmSt_age = poSc_scanner.nextLine();
////////^ Почему сразу присваивается, а не ждет ввода?
        System.out.println("Напишите возраст буквами");
        pmSt_age = poSc_scanner.nextLine();
        switch (pmSt_age) {
            case "Ноль":
                System.out.println("Ты родился");
                break;
            case "Семь":
                System.out.println("Ты Пошел в школу");
                break;
            case "Восемнадцать":
                System.out.println("Ты закончил в школу");
                break;
        }
    }
}
