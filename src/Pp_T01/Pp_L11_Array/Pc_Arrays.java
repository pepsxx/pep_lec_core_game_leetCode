package Pp_T01.Pp_L11_Array;

public class Pc_Arrays {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=li86TEAEhYM
    //Java для начинающих. Урок 11: Массивы в Java.
    public static void main(String[] args) {
        int pmi_number = 10;
        int[] pmMi_numbers = new int[5];
        System.out.println(pmMi_numbers[0]);

        System.out.println();

        for (int pmi_i = 0; pmi_i < pmMi_numbers.length; pmi_i++) {
            pmMi_numbers[pmi_i] = pmi_i * 10;
            System.out.println(pmMi_numbers[pmi_i]);
        }

        System.out.println();

        int[] pmMi_numbers2 = {1, 2, 3};
        for (int pmi_i = 0; pmi_i < pmMi_numbers2.length; pmi_i++) {
            System.out.println(pmMi_numbers2[pmi_i]);
        }
    }
}
