package Pp_Game_1999.Pp_v004;

import java.util.HashMap;
import java.util.Map;

public class Pc_Main {


    private static Integer[][] pgMMIn_map = new Integer[][]{
            // 4 - Герой.
            // 1 - Пустота.
            // 8 - Стена.
            // 6 - Куб.
            // 9 - Место для куба.

            {8, 8, 8, 8, 8, 8},
            {4, 1, 1, 1, 1, 8},
            {8, 1, 1, 6, 1, 8},
            {8, 1, 1, 1, 9, 8},
            {8, 8, 8, 8, 8, 8}};

//            {1, 1, 1, 1, 8, 8, 8, 8, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//            {1, 1, 1, 1, 8, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//            {1, 1, 1, 1, 8, 6, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//            {1, 1, 8, 8, 8, 1, 1, 6, 8, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//            {1, 1, 8, 1, 1, 6, 1, 6, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//            {8, 8, 8, 1, 8, 1, 8, 8, 1, 8, 1, 1, 1, 8, 8, 8, 8, 8, 8},
//            {8, 1, 1, 1, 8, 1, 8, 8, 1, 8, 8, 8, 8, 8, 1, 1, 9, 9, 8},
//            {8, 1, 6, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 8},
//            {8, 8, 8, 8, 8, 1, 8, 8, 8, 1, 8, 4, 8, 8, 1, 1, 9, 9, 8},
//            {1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 8, 8, 8, 8, 8, 8, 8, 8, 8},
//            {1, 1, 1, 1, 8, 8, 8, 8, 8, 8, 8, 1, 1, 1, 1, 1, 1, 1, 1}};

    public static void setPgMMIn_map(int pmi_y, int pmi_x, int pmi_value) {
        pgMMIn_map[pmi_y][pmi_x] = pmi_value;
    }

    public static Integer[][] getPgMMIn_map() {
        return pgMMIn_map;
    }

    private static Integer[][] pgMMIn_map_ghost = Pc_Map.pf_map_ghost(pgMMIn_map);

    public static Integer[][] getPgMMIn_map_ghost() {
        return pgMMIn_map_ghost;
    }

    public static void main(String[] args) {
//        for (int i = 0; i <= 2048; i++) {
//            System.out.printf("%6d ", i);
//            System.out.print((char) i);
//            if (i != 0) {
//                if (i % 10 == 0) System.out.println();
//            }
//        }
//        System.out.println();
//
//        System.out.println();
//        System.out.println((char) 164+" " +164);
//        System.out.println((char) 161+" " +161);
//        System.out.println((char) 160+" " +160);
//        System.out.println((char) 165+" " +165);
//        System.out.println((char) 174+" " +174);
//        System.out.println((char) 183+" " +183);

        for (int i = 0; i < pgMMIn_map.length; i++) {
            for (int j = 0; j < pgMMIn_map[i].length; j++) {
                if (pgMMIn_map[i][j] == 4) {
                    Pc_Motion.setPgi_mi_x(j);
                    Pc_Motion.setPgi_mi_y(i);
                }
            }
        }

        System.out.println("Pc_Motion.getPgi_mi_x() = " + Pc_Motion.getPgi_mi_x());
        System.out.println("Pc_Motion.getPgi_mi_y() = " + Pc_Motion.getPgi_mi_y());

        while (Pc_Map.pf_check_finish(pgMMIn_map, getPgMMIn_map_ghost())) {
            Pc_Map.pf_inputMap(pgMMIn_map);
            Pc_Motion.pf_hod();
        }
    }
}
