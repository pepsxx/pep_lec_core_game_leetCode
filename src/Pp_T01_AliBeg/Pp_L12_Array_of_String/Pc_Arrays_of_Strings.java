package Pp_T01_AliBeg.Pp_L12_Array_of_String;

public class Pc_Arrays_of_Strings {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=8AD55r64yNw
    //Java для начинающих. Урок 12: Цикл for each, Массивы строк.
    public static void main(String[] args) {
        int[] pmMi_numbers = new int[5];
        pmMi_numbers[0] = 10;
        System.out.println(pmMi_numbers[0]);
        System.out.println(pmMi_numbers[1]);

        System.out.println();

        String[] pmMSt_string = new String[3];
        pmMSt_string[0] = "привет";
        pmMSt_string[1] = "пока";
        pmMSt_string[2] = "джава";
        System.out.println(pmMSt_string[0]);
        System.out.println(pmMSt_string[2]);

        System.out.println();

        for (int pmi_i = 0; pmi_i < pmMSt_string.length; pmi_i++) {
            System.out.println(pmMSt_string[pmi_i]);
        }

        System.out.println();

        for (String pmSt_string : pmMSt_string) {
            System.out.println(pmSt_string);
        }

        System.out.println();

        int[] pmMi_numbers1 = {1, 2, 3};
        int pmi_sum = 0;
        for (int pmi_x : pmMi_numbers1) {
            pmi_sum = pmi_sum + pmi_x;
        }
        System.out.println(pmi_sum);

        int pmi_value = 0;        //Выделяется память под переменную.
        String pmSt_s1;           //Выделяется память только под ссылку.
        String pmSt_s2 = "Hello"; //Выделяется память под ссылку и строку.
    }
}
