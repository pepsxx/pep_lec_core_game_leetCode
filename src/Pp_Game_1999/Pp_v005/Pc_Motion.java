package Pp_Game_1999.Pp_v005;

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

    static void pf_hod() {
        String pgSt_presKey = pf_keyPres();
        switch (pgSt_presKey) {
            case "w", "W", "ц", "Ц" -> pf_hod_up();
            case "a", "A", "ф", "Ф" -> pf_hod_left();
            case "s", "S", "ы", "Ы" -> pf_hod_down();
            case "d", "D", "в", "В" -> pf_hod_right();
        }
    }

    private static String pf_keyPres() {
        Scanner poSc_scanner = new Scanner(System.in);
        return poSc_scanner.nextLine();
    }

    private static void pf_hod_left() {
        if (pgi_mi_x != 0) { // Если не в 1 шаге от обрыва по направлению движения.
            pgi_nextHop1_x = pgi_mi_x - 1;
            pgi_nextHop1_y = pgi_mi_y;
            pgi_nextHop2_x = pgi_mi_x - 1;
            pgi_nextHop2_y = pgi_mi_y;

            if (pgi_mi_x != 1) // Если не в 2 шагах от обрыва по направлению движения.
                pgi_nextHop2_x = pgi_mi_x - 2;

            pf_popytHoda(pgi_nextHop1_x, pgi_nextHop1_y, pgi_nextHop2_x, pgi_nextHop2_y);
        }
    }

    private static void pf_hod_right() {
        if (pgi_mi_x != Pc_Main.getPgMMIn_map()[0].length - 1) { // Если не в 1 шаге от обрыва по направлению движения.
            pgi_nextHop1_x = pgi_mi_x + 1;
            pgi_nextHop1_y = pgi_mi_y;
            pgi_nextHop2_x = pgi_mi_x + 1;
            pgi_nextHop2_y = pgi_mi_y;

            if (pgi_mi_x != Pc_Main.getPgMMIn_map()[0].length - 2) // Если не в 2 шагах от обрыва по направлению движения.
                pgi_nextHop2_x = pgi_mi_x + 2;

            pf_popytHoda(pgi_nextHop1_x, pgi_nextHop1_y, pgi_nextHop2_x, pgi_nextHop2_y);
        }

    }

    private static void pf_hod_up() {
        if (pgi_mi_y != 0) { // Если не в 1 шаге от обрыва по направлению движения.
            pgi_nextHop1_x = pgi_mi_x;
            pgi_nextHop1_y = pgi_mi_y - 1;
            pgi_nextHop2_x = pgi_mi_x;
            pgi_nextHop2_y = pgi_mi_y - 1;

            if (pgi_mi_y != 1)  // Если не в 2 шагах от обрыва по направлению движения.
                pgi_nextHop2_y = pgi_mi_y - 2;

            pf_popytHoda(pgi_nextHop1_x, pgi_nextHop1_y, pgi_nextHop2_x, pgi_nextHop2_y);
        }

    }

    private static void pf_hod_down() {
        if (pgi_mi_y != Pc_Main.getPgMMIn_map().length - 1) { // Если не в 1 шаге от обрыва по направлению движения.
            pgi_nextHop1_x = pgi_mi_x;
            pgi_nextHop1_y = pgi_mi_y + 1;
            pgi_nextHop2_x = pgi_mi_x;
            pgi_nextHop2_y = pgi_mi_y + 1;

            if (pgi_mi_y != Pc_Main.getPgMMIn_map().length - 2)  // Если не в 2 шагах от обрыва по направлению движения.
                pgi_nextHop2_y = pgi_mi_y + 2;

            pf_popytHoda(pgi_nextHop1_x, pgi_nextHop1_y, pgi_nextHop2_x, pgi_nextHop2_y);
        }
    }


    private static void pf_popytHoda(int pgi_nextHop1_x, int pgi_nextHop1_y, int pgi_nextHop2_x, int pgi_nextHop2_y) {

        int pmi_next1_value = Pc_Main.getPgMMIn_map()[pgi_nextHop1_y][pgi_nextHop1_x];
        int pmi_next2_value = Pc_Main.getPgMMIn_map()[pgi_nextHop2_y][pgi_nextHop2_x];
        int pmi_im_value = Pc_Main.getPgMMIn_map()[pgi_mi_y][pgi_mi_x];
        int pmi_mi_ghost_value = Pc_Main.getPgMMIn_map_ghost()[pgi_mi_y][pgi_mi_x];
        if (pmi_mi_ghost_value != 9)
            pmi_mi_ghost_value = 1;

        if (pmi_next1_value == 6 && ((pgi_nextHop1_x == pgi_nextHop2_x) && (pgi_nextHop1_y == pgi_nextHop2_y))) // Попытка сдвинуть ящик в обрыв.
            return;

        int pmi_variant = 0;
        if (pmi_next1_value == 1 || pmi_next1_value == 9)
            pmi_variant = 1;
        else if (pmi_next1_value == 6 && (pmi_next2_value == 1 || pmi_next2_value == 9))
            pmi_variant = 2;

        if (pmi_variant != 0) {
            Pc_Main.setPgMMIn_map(pgi_mi_y, pgi_mi_x, pmi_mi_ghost_value);
            if (pmi_variant == 1)
                Pc_Main.setPgMMIn_map(pgi_nextHop1_y, pgi_nextHop1_x, pmi_im_value);
            if (pmi_variant == 2) {
                Pc_Main.setPgMMIn_map(pgi_nextHop1_y, pgi_nextHop1_x, pmi_im_value);
                Pc_Main.setPgMMIn_map(pgi_nextHop2_y, pgi_nextHop2_x, pmi_next1_value);
            }
            pgi_mi_x = pgi_nextHop1_x;
            pgi_mi_y = pgi_nextHop1_y;
        }
    }
}
