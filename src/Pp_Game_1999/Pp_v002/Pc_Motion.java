package Pp_Game_1999.Pp_v002;

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

    private static void pf_popytHoda(int[] pmMi_corUser, int[] pmi_nextHop1, int[] pmi_nextHop2) {
        if (pmi_nextHop1 == pmi_nextHop2) return;

        int pmi_ghost = Pc_Main.getPgMMIn_map_ghost()[pmMi_corUser[0]][pmMi_corUser[1]];
        if (pmi_ghost != 9) {
            pmi_ghost = 1;
        }

        int pmi_im = Pc_Main.getPgMMIn_map()[pmMi_corUser[0]][pmMi_corUser[1]];
        int pmi_next1 = Pc_Main.getPgMMIn_map()[pmi_nextHop1[0]][pmi_nextHop1[1]];
        int pmi_next2 = Pc_Main.getPgMMIn_map()[pmi_nextHop2[0]][pmi_nextHop2[1]];
        if (pmi_next1 == 1 || pmi_next1 == 9) {
            Pc_Main.getPgMMIn_map()[pmMi_corUser[0]][pmMi_corUser[1]] = pmi_ghost;
            Pc_Main.getPgMMIn_map()[pmi_nextHop1[0]][pmi_nextHop1[1]] = pmi_im;
        } else if (pmi_next1 == 6 && (pmi_next2 == 1 || pmi_next2 == 9)) {
            Pc_Main.getPgMMIn_map()[pmMi_corUser[0]][pmMi_corUser[1]] = pmi_ghost;
            Pc_Main.getPgMMIn_map()[pmi_nextHop1[0]][pmi_nextHop1[1]] = pmi_im;
            Pc_Main.getPgMMIn_map()[pmi_nextHop2[0]][pmi_nextHop2[1]] = pmi_next1;
        }
    }

    private static void pf_hod_left() {
        int[] pmMi_corUser = Pc_Main.pf_corReturnUser(Pc_Main.getPgMMIn_map());

        if (pmMi_corUser[1] != 0) { // Если не в 1 шаге от обрыва по направлению движения.
            int[] pmi_nextHop1 = {pmMi_corUser[0], pmMi_corUser[1] - 1};
            int[] pmi_nextHop2 = {pmMi_corUser[0], pmMi_corUser[1] - 1};
            if (pmMi_corUser[1] != 1) { // Если не в 2 шагах от обрыва по направлению движения.
                pmi_nextHop2[1] = pmMi_corUser[1] - 2;
            }
            pf_popytHoda(pmMi_corUser, pmi_nextHop1, pmi_nextHop2);
        }

    }

    private static void pf_hod_right() {
        int[] pmMi_corUser = Pc_Main.pf_corReturnUser(Pc_Main.getPgMMIn_map());

        if (pmMi_corUser[1] != Pc_Main.getPgMMIn_map()[0].length - 1) { // Если не в 1 шаге от обрыва по направлению движения.
            int[] pmi_nextHop1 = {pmMi_corUser[0], pmMi_corUser[1] + 1};
            int[] pmi_nextHop2 = {pmMi_corUser[0], pmMi_corUser[1] + 1};
            if (pmMi_corUser[1] != Pc_Main.getPgMMIn_map()[0].length - 2) { // Если не в 2 шагах от обрыва по направлению движения.
                pmi_nextHop2[1] = pmMi_corUser[1] + 2;
            }
            pf_popytHoda(pmMi_corUser, pmi_nextHop1, pmi_nextHop2);
        }


    }

    private static void pf_hod_up() {
        int[] pmMi_corUser = Pc_Main.pf_corReturnUser(Pc_Main.getPgMMIn_map());

        if (pmMi_corUser[0] != 0) { // Если не в 1 шаге от обрыва по направлению движения.
            int[] pmi_nextHop1 = {pmMi_corUser[0] - 1, pmMi_corUser[1]};
            int[] pmi_nextHop2 = {pmMi_corUser[0] - 1, pmMi_corUser[1]};
            if (pmMi_corUser[0] != 1) { // Если не в 2 шагах от обрыва по направлению движения.
                pmi_nextHop2[0] = pmMi_corUser[0] - 2;
            }
            pf_popytHoda(pmMi_corUser, pmi_nextHop1, pmi_nextHop2);
        }

    }

    private static void pf_hod_down() {
        int[] pmMi_corUser = Pc_Main.pf_corReturnUser(Pc_Main.getPgMMIn_map());
        if (pmMi_corUser[0] != Pc_Main.getPgMMIn_map().length - 1) { // Если не в 1 шаге от обрыва по направлению движения.
            int[] pmi_nextHop1 = {pmMi_corUser[0] + 1, pmMi_corUser[1]};
            int[] pmi_nextHop2 = {pmMi_corUser[0] + 1, pmMi_corUser[1]};
            if (pmMi_corUser[0] != Pc_Main.getPgMMIn_map().length - 2) { // Если не в 2 шагах от обрыва по направлению движения.
                pmi_nextHop2[0] = pmMi_corUser[0] + 2;
            }
            pf_popytHoda(pmMi_corUser, pmi_nextHop1, pmi_nextHop2);
        }

    }
}
