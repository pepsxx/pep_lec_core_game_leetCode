package Pp_T01_AliBeg.Pp_L38_Exception_2;

import java.util.Scanner;

public class Pc_Exception2 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=jL7-VdBeh9s
    //Java для начинающих. Урок 38: Исключения (часть 2). Выбрасывание исключений.
    public static void main(String[] args) throws ScannerException {
        Scanner poSc_scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введи ноль: ");
            int pmi_x = Integer.parseInt(poSc_scanner.nextLine());
            if (pmi_x != 0) {
                    throw new ScannerException("Пользователь ввел не ноль"); //https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
            }
        }
    }
}
