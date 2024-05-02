package Pp_T01_AliBeg.Pp_L07_Input_Scaner;

import java.util.Scanner;

public class Pc_Input {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=Y2iB_DwdyfM
    //Java для начинающих. Урок 7: Ввод данных. Класс Scanner.
    public static void main(String[] args) {
        String pmSt_s1 = "Hello";
        String pmSt_s2 = new String("Hello");
        Scanner poSc_s = new Scanner(System.in);

        System.out.println("Введите что-нибудь");
        String pmSt_string = poSc_s.nextLine();
        System.out.println("Вы ввели: " + pmSt_string);

        System.out.println("Введите что-нибудь");
        int pmi_x = poSc_s.nextInt();
        System.out.println("Вы ввели: " + pmi_x);
    }
}
