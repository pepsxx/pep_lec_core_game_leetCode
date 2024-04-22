package Pp_Game_1999.Pp_v003;

import java.util.Scanner;

public abstract class Pc_Motion {

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

    private static void pf_popytHoda(int[] pmi_nextHop1, int[] pmi_nextHop2) {
        int pmi_x = Pc_Main.getPgMa_corUser("x");
        int pmi_y = Pc_Main.getPgMa_corUser("y");

        if (pmi_nextHop1 == pmi_nextHop2) return;

        int pmi_ghost = Pc_Main.getPgMMIn_map_ghost()[pmi_y][pmi_x];
        if (pmi_ghost != 9) {
            pmi_ghost = 1;
        }

        int pmi_im = Pc_Main.getPgMMIn_map()[pmi_y][pmi_x];
        int pmi_next1 = Pc_Main.getPgMMIn_map()[pmi_nextHop1[0]][pmi_nextHop1[1]];
        int pmi_next2 = Pc_Main.getPgMMIn_map()[pmi_nextHop2[0]][pmi_nextHop2[1]];

        if (pmi_next1 == 1 || pmi_next1 == 9) {
            Pc_Main.getPgMMIn_map()[pmi_y][pmi_x] = pmi_ghost;
            Pc_Main.getPgMMIn_map()[pmi_nextHop1[0]][pmi_nextHop1[1]] = pmi_im;
            Pc_Main.setPgMa_corUser("x",pmi_nextHop1[1]);
            Pc_Main.setPgMa_corUser("y",pmi_nextHop1[0]);
        } else if (pmi_next1 == 6 && (pmi_next2 == 1 || pmi_next2 == 9)) {
            Pc_Main.getPgMMIn_map()[pmi_y][pmi_x] = pmi_ghost;
            Pc_Main.getPgMMIn_map()[pmi_nextHop1[0]][pmi_nextHop1[1]] = pmi_im;
            Pc_Main.getPgMMIn_map()[pmi_nextHop2[0]][pmi_nextHop2[1]] = pmi_next1;
            Pc_Main.setPgMa_corUser("x",pmi_nextHop1[1]);
            Pc_Main.setPgMa_corUser("y",pmi_nextHop1[0]);
        }
    }

    private static void pf_hod_left() {
        int pmi_x = Pc_Main.getPgMa_corUser("x");
        int pmi_y = Pc_Main.getPgMa_corUser("y");
        //int[] pmMi_corUser = new int[]{pmi_y, pmi_x};

        if (pmi_x != 0) { // Если не в 1 шаге от обрыва по направлению движения.
            int[] pmi_nextHop1 = {pmi_y, pmi_x - 1};
            int[] pmi_nextHop2 = {pmi_y, pmi_x - 1};
            if (pmi_x != 1) { // Если не в 2 шагах от обрыва по направлению движения.
                pmi_nextHop2[1] = pmi_x - 2;
            }
            pf_popytHoda(pmi_nextHop1, pmi_nextHop2);
        }

    }

    private static void pf_hod_right() {
        int pmi_x = Pc_Main.getPgMa_corUser("x");
        int pmi_y = Pc_Main.getPgMa_corUser("y");
        //int[] pmMi_corUser = new int[]{pmi_y, pmi_x};

        if (pmi_x != Pc_Main.getPgMMIn_map()[0].length - 1) { // Если не в 1 шаге от обрыва по направлению движения.
            int[] pmi_nextHop1 = {pmi_y, pmi_x + 1};
            int[] pmi_nextHop2 = {pmi_y, pmi_x + 1};
            if (pmi_x != Pc_Main.getPgMMIn_map()[0].length - 2) { // Если не в 2 шагах от обрыва по направлению движения.
                pmi_nextHop2[1] = pmi_x + 2;
            }
            pf_popytHoda(pmi_nextHop1, pmi_nextHop2);
        }


    }

    private static void pf_hod_up() {
        int pmi_x = Pc_Main.getPgMa_corUser("x");
        int pmi_y = Pc_Main.getPgMa_corUser("y");
        //int[] pmMi_corUser = new int[]{pmi_y, pmi_x};

        if (pmi_y != 0) { // Если не в 1 шаге от обрыва по направлению движения.
            int[] pmi_nextHop1 = {pmi_y-1, pmi_x};
            int[] pmi_nextHop2 = {pmi_y-1, pmi_x};
            if (pmi_y != 1) { // Если не в 2 шагах от обрыва по направлению движения.
                pmi_nextHop2[0] = pmi_y - 2;
            }
            pf_popytHoda(pmi_nextHop1, pmi_nextHop2);
        }

    }

    private static void pf_hod_down() {
        int pmi_x = Pc_Main.getPgMa_corUser("x");
        int pmi_y = Pc_Main.getPgMa_corUser("y");
        //int[] pmMi_corUser = new int[]{pmi_y, pmi_x};

        if (pmi_y != Pc_Main.getPgMMIn_map().length - 1) { // Если не в 1 шаге от обрыва по направлению движения.
            int[] pmi_nextHop1 = {pmi_y+1, pmi_x};
            int[] pmi_nextHop2 = {pmi_y+1, pmi_x};
            if (pmi_y != Pc_Main.getPgMMIn_map().length - 2) { // Если не в 2 шагах от обрыва по направлению движения.
                pmi_nextHop2[0] = pmi_y + 2;
            }
            pf_popytHoda(pmi_nextHop1, pmi_nextHop2);
        }
    }
}
