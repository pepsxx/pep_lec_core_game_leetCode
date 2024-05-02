package Pp_T01_AliBeg.Pp_L13_Arrays_Multidimensional;

public class Pc_Multidimensional_Arrays {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=17FwEtVsIMQ
    //Java для начинающих. Урок 13: Многомерные массивы.
    public static void main(String[] args) {
        int[] pmMi_number = {1, 2, 3};
        System.out.println(pmMi_number[1]);

        int[][] pmMMi_matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(pmMMi_matrice[2][2]);
        System.out.println(pmMMi_matrice[1][0]);

        System.out.println();

        int[][] pmMMi_matrice2 = {{1, 2, 3, 4, 5}, {6}, {7, 8, 9}};
        System.out.println(pmMMi_matrice2[2][2]);
        System.out.println(pmMMi_matrice2[1][0]);

        System.out.println();

        String[][] pmMMSt_string = new String[2][3];
        System.out.println(pmMMSt_string[0][1]);
        pmMMSt_string[0][1] = "Привет";
        System.out.println(pmMMSt_string[0][1]);

        System.out.println();

        for (int pmi_i = 0; pmi_i < pmMMi_matrice.length; pmi_i++) {
            for (int pmi_j = 0; pmi_j < pmMMi_matrice[pmi_i].length; pmi_j++) {
                System.out.print(pmMMi_matrice[pmi_i][pmi_j] + " ");
            }
            System.out.println();
        }
    }
}
