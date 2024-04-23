package Pp_Game_1999.Pp_v006;

import java.util.Scanner;

public abstract class Pc_Motion {

    private static int pgi_mi_x, pgi_mi_y, pgi_nextHop1_x, pgi_nextHop1_y, pgi_nextHop2_x, pgi_nextHop2_y;

    static int getPgi_mi_x() {
        return pgi_mi_x;
    }

    static void setPgi_mi_x(int pgi_mi_x) {
        Pc_Motion.pgi_mi_x = pgi_mi_x;
    }

    static int getPgi_mi_y() {
        return pgi_mi_y;
    }

    static void setPgi_mi_y(int pgi_mi_y) {
        Pc_Motion.pgi_mi_y = pgi_mi_y;
    }

    static Integer[][] pf_hod(Integer[][] pgMMIn_map) {
        String pgSt_presKey = pf_keyPres();
        switch (pgSt_presKey) {
            case "w", "W", "ц", "Ц" -> pgMMIn_map = pf_hod_up(pgMMIn_map);
            case "a", "A", "ф", "Ф" -> pgMMIn_map = pf_hod_left(pgMMIn_map);
            case "s", "S", "ы", "Ы" -> pgMMIn_map = pf_hod_down(pgMMIn_map);
            case "d", "D", "в", "В" -> pgMMIn_map = pf_hod_right(pgMMIn_map);
        }
        return pgMMIn_map;
    }

    private static String pf_keyPres() {
        Scanner poSc_scanner = new Scanner(System.in);
        return poSc_scanner.nextLine();
    }

    private static Integer[][] pf_hod_left(Integer[][] pgMMIn_map) {
        if (pgi_mi_x != 0) { // Если не в 1 шаге от обрыва по направлению движения.
            pgi_nextHop1_x = pgi_mi_x - 1;
            pgi_nextHop1_y = pgi_mi_y;
            pgi_nextHop2_x = pgi_mi_x - 1;
            pgi_nextHop2_y = pgi_mi_y;

            if (pgi_mi_x != 1) // Если не в 2 шагах от обрыва по направлению движения.
                pgi_nextHop2_x = pgi_mi_x - 2;

            pgMMIn_map = pf_popytHoda(pgi_nextHop1_x, pgi_nextHop1_y, pgi_nextHop2_x, pgi_nextHop2_y, pgMMIn_map);
        }
        return pgMMIn_map;
    }

    private static Integer[][] pf_hod_right(Integer[][] pgMMIn_map) {
        if (pgi_mi_x != pgMMIn_map.length - 1) { // Если не в 1 шаге от обрыва по направлению движения.
            pgi_nextHop1_x = pgi_mi_x + 1;
            pgi_nextHop1_y = pgi_mi_y;
            pgi_nextHop2_x = pgi_mi_x + 1;
            pgi_nextHop2_y = pgi_mi_y;

            if (pgi_mi_x != pgMMIn_map.length - 2) // Если не в 2 шагах от обрыва по направлению движения.
                pgi_nextHop2_x = pgi_mi_x + 2;

            pgMMIn_map = pf_popytHoda(pgi_nextHop1_x, pgi_nextHop1_y, pgi_nextHop2_x, pgi_nextHop2_y, pgMMIn_map);
        }
        return pgMMIn_map;

    }

    private static Integer[][] pf_hod_up(Integer[][] pgMMIn_map) {
        if (pgi_mi_y != 0) { // Если не в 1 шаге от обрыва по направлению движения.
            pgi_nextHop1_x = pgi_mi_x;
            pgi_nextHop1_y = pgi_mi_y - 1;
            pgi_nextHop2_x = pgi_mi_x;
            pgi_nextHop2_y = pgi_mi_y - 1;

            if (pgi_mi_y != 1)  // Если не в 2 шагах от обрыва по направлению движения.
                pgi_nextHop2_y = pgi_mi_y - 2;

            pgMMIn_map = pf_popytHoda(pgi_nextHop1_x, pgi_nextHop1_y, pgi_nextHop2_x, pgi_nextHop2_y, pgMMIn_map);
        }
        return pgMMIn_map;

    }

    private static Integer[][] pf_hod_down(Integer[][] pgMMIn_map) {
        if (pgi_mi_y != pgMMIn_map.length - 1) { // Если не в 1 шаге от обрыва по направлению движения.
            pgi_nextHop1_x = pgi_mi_x;
            pgi_nextHop1_y = pgi_mi_y + 1;
            pgi_nextHop2_x = pgi_mi_x;
            pgi_nextHop2_y = pgi_mi_y + 1;

            if (pgi_mi_y != pgMMIn_map.length - 2)  // Если не в 2 шагах от обрыва по направлению движения.
                pgi_nextHop2_y = pgi_mi_y + 2;

            pgMMIn_map = pf_popytHoda(pgi_nextHop1_x, pgi_nextHop1_y, pgi_nextHop2_x, pgi_nextHop2_y, pgMMIn_map);
        }
        return pgMMIn_map;
    }


    private static Integer[][] pf_popytHoda(int pgi_nextHop1_x, int pgi_nextHop1_y, int pgi_nextHop2_x, int pgi_nextHop2_y, Integer[][] pgMMIn_map) {

        int pmi_next1_value = pgMMIn_map[pgi_nextHop1_y][pgi_nextHop1_x];
        int pmi_next2_value = pgMMIn_map[pgi_nextHop2_y][pgi_nextHop2_x];
        int pmi_im_value = pgMMIn_map[pgi_mi_y][pgi_mi_x];
        int pmi_mi_ghost_value = pgMMIn_map[pgi_mi_y][pgi_mi_x];
        if (pmi_mi_ghost_value != 9)
            pmi_mi_ghost_value = 1;

        if (pmi_next1_value == 6 && ((pgi_nextHop1_x == pgi_nextHop2_x) && (pgi_nextHop1_y == pgi_nextHop2_y))) // Попытка сдвинуть ящик в обрыв.
            return pgMMIn_map;

        int pmi_variant = 0;
        if (pmi_next1_value == 1 || pmi_next1_value == 9)
            pmi_variant = 1;
        else if (pmi_next1_value == 6 && (pmi_next2_value == 1 || pmi_next2_value == 9))
            pmi_variant = 2;

        if (pmi_variant != 0) {
            pgMMIn_map[pgi_mi_y][pgi_mi_x] = pmi_mi_ghost_value;
            if (pmi_variant == 1)

                pgMMIn_map[pgi_nextHop1_y][pgi_nextHop1_x] = pmi_im_value;
            if (pmi_variant == 2) {

                pgMMIn_map[pgi_nextHop1_y][pgi_nextHop1_x] = pmi_im_value;
                pgMMIn_map[pgi_nextHop2_y][pgi_nextHop2_x] = pmi_next1_value;
            }
            pgi_mi_x = pgi_nextHop1_x;
            pgi_mi_y = pgi_nextHop1_y;
        }
        return pgMMIn_map;
    }
}
