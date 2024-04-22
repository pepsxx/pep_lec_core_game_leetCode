package Pp_Game_1999.Pp_v005;

import java.util.List;

public abstract class Pc_Map {
    static Integer[][] pf_map_ghost(Integer[][] pgMMIn_map) {
        Integer[][] pmMMIn_temp = new Integer[pgMMIn_map.length][pgMMIn_map[0].length];
        for (int i = 0; i < pgMMIn_map.length; i++) {
            for (int j = 0; j < pgMMIn_map[i].length; j++) {
                pmMMIn_temp[i][j] = pgMMIn_map[i][j];
            }
        }
        return pmMMIn_temp;
    }

    //static boolean pf_check_finish(Integer[][] pgMMIn_map, Integer[][] pgMMIn_map_ghost) {
    static boolean pf_check_finish(Integer[][] pgMMIn_map, Integer[][] pgMMIn_map_ghost, List<Integer[]> poLi_finishCoordinate ) {
        boolean pmb_finish = false;

        for (Integer[] q : poLi_finishCoordinate) {
                if (pgMMIn_map[q[0]][q[1]] == 9) {
                    pmb_finish = true;
                    return pmb_finish;
                }

        }

        // получаем координаты 4.
        int pmi_x = Pc_Motion.getPgi_mi_x();
        int pmi_y = Pc_Motion.getPgi_mi_y();

        // Проверяем что по ним в призраке.
        if (pgMMIn_map_ghost[pmi_y][pmi_x] == 9) {
            pmb_finish = true;
            return pmb_finish;
        }
        pf_inputMap(pgMMIn_map);
        System.out.println("Победа в сокобане!");
        return pmb_finish;
    }

    static void pf_inputMap(Integer[][] pgMMIn_map) {

        for (Integer[] pmMIn_map : pgMMIn_map) {
            for (Integer pmIn_map : pmMIn_map) {
                pf_convertMap(pmIn_map);
            }
            System.out.println();
        }
    }

    private static void pf_convertMap(int pmi_ch) {
        // 4 - Герой.
        // 1 - Пустота.
        // 8 - Стена.
        // 6 - Куб.
        // 9 - Место для куба.
        int pmi_kolvo = 2;
        switch (pmi_ch) {
            case 1 -> {
                for (int i = 0; i < pmi_kolvo; i++)
                    System.out.print((char) 160);
            }
            case 4 -> {
                for (int i = 0; i < pmi_kolvo; i++)
                    //System.out.print((char) 2017);
                    System.out.print((char) 11);
            }
            case 6 -> {
                for (int i = 0; i < pmi_kolvo; i++)
                    System.out.print((char) 1120);
            }
            case 8 -> {
                for (int i = 0; i < pmi_kolvo; i++)
                    System.out.print((char) 72);
            }
            case 9 -> {
                for (int i = 0; i < pmi_kolvo; i++)
                    System.out.print((char) 47);
            }
        }
    }
}



