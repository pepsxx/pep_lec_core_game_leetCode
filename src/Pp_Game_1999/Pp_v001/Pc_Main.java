package Pp_Game_1999.Pp_v001;

import java.util.Scanner;

public class Pc_Main {

    private static Integer[][] pgMMIn_map = new Integer[][]{
            // 4 - Герой.
            // 1 - Пустота.
            // 8 - Стена.
            // 6 - Куб.
            // 9 - Место для куба.

            {8, 8, 8, 8, 8, 8},
            {8, 1, 1, 1, 1, 8},
            {1, 4, 1, 6, 1, 8},
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

    private static Integer[][] pgMMIn_map_ghost = pf_map_ghost(pgMMIn_map);

    public static void main(String[] args) {
        for (int i = 0; i <= 2048; i++) {
            System.out.printf("%6d ", i);
            System.out.print((char) i);
            if (i != 0) {
                if (i % 10 == 0) System.out.println();
            }
        }
        System.out.println();

        System.out.println();
        System.out.println((char) 164+" " +164);
        System.out.println((char) 161+" " +161);
        System.out.println((char) 160+" " +160);
        System.out.println((char) 165+" " +165);
        System.out.println((char) 174+" " +174);
        System.out.println((char) 183+" " +183);

        while (pf_check_finish(pgMMIn_map, pgMMIn_map_ghost)) {
            pf_inputMap(pgMMIn_map);
            pf_hod();
        }
    }

    private static Integer[][] pf_map_ghost(Integer[][] pgMMIn_map) {
        Integer[][] pmMMIn_temp = new Integer[pgMMIn_map.length][pgMMIn_map[0].length];
        for (int i = 0; i < pgMMIn_map.length; i++) {
            for (int j = 0; j < pgMMIn_map[i].length; j++) {
                pmMMIn_temp[i][j] = pgMMIn_map[i][j];
            }
        }
        return pmMMIn_temp;
    }

    private static void pf_hod() {
        String pgSt_presKey = pf_keyPres();
        switch (pgSt_presKey) {
            case "w","W","ц","Ц" -> pf_hod_up();
            case "a","A","ф","Ф" -> pf_hod_left();
            case "s","S","ы","Ы" -> pf_hod_down();
            case "d","D","в","В" -> pf_hod_right();
        }
    }

    private static int[] pf_corReturnUser(Integer[][] pgMMIn_map) {
        int[] pmMi_corUser = new int[2];
        for (int i = 0; i < pgMMIn_map.length; i++) {
            for (int j = 0; j < pgMMIn_map[i].length; j++) {
                if (pgMMIn_map[i][j] == 4) {
                    pmMi_corUser[0] = i;
                    pmMi_corUser[1] = j;
                }
            }
        }
        return pmMi_corUser;
    }

    private static void pf_popytHoda(int[] pmMi_corUser, int[] pmi_nextHop1, int[] pmi_nextHop2) {
        if (pmi_nextHop1 == pmi_nextHop2) return;

        int pmi_ghost = pgMMIn_map_ghost[pmMi_corUser[0]][pmMi_corUser[1]];
        if (pmi_ghost != 9) {
            pmi_ghost = 1;
        }

        int pmi_im = pgMMIn_map[pmMi_corUser[0]][pmMi_corUser[1]];
        int pmi_next1 = pgMMIn_map[pmi_nextHop1[0]][pmi_nextHop1[1]];
        int pmi_next2 = pgMMIn_map[pmi_nextHop2[0]][pmi_nextHop2[1]];
        if (pmi_next1 == 1 || pmi_next1 == 9) {
            pgMMIn_map[pmMi_corUser[0]][pmMi_corUser[1]] = pmi_ghost;
            pgMMIn_map[pmi_nextHop1[0]][pmi_nextHop1[1]] = pmi_im;
        } else if (pmi_next1 == 6 && (pmi_next2 == 1 || pmi_next2 == 9)) {
            pgMMIn_map[pmMi_corUser[0]][pmMi_corUser[1]] = pmi_ghost;
            pgMMIn_map[pmi_nextHop1[0]][pmi_nextHop1[1]] = pmi_im;
            pgMMIn_map[pmi_nextHop2[0]][pmi_nextHop2[1]] = pmi_next1;
        }
    }

    private static void pf_hod_left() {
        int[] pmMi_corUser = pf_corReturnUser(pgMMIn_map);

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
        int[] pmMi_corUser = pf_corReturnUser(pgMMIn_map);

        if (pmMi_corUser[1] != pgMMIn_map[0].length - 1) { // Если не в 1 шаге от обрыва по направлению движения.
            int[] pmi_nextHop1 = {pmMi_corUser[0], pmMi_corUser[1] + 1};
            int[] pmi_nextHop2 = {pmMi_corUser[0], pmMi_corUser[1] + 1};
            if (pmMi_corUser[1] != pgMMIn_map[0].length - 2) { // Если не в 2 шагах от обрыва по направлению движения.
                pmi_nextHop2[1] = pmMi_corUser[1] + 2;
            }
            pf_popytHoda(pmMi_corUser, pmi_nextHop1, pmi_nextHop2);
        }


    }

    private static void pf_hod_up() {
        int[] pmMi_corUser = pf_corReturnUser(pgMMIn_map);

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
        int[] pmMi_corUser = pf_corReturnUser(pgMMIn_map);
        if (pmMi_corUser[0] != pgMMIn_map.length - 1) { // Если не в 1 шаге от обрыва по направлению движения.
            int[] pmi_nextHop1 = {pmMi_corUser[0] + 1, pmMi_corUser[1]};
            int[] pmi_nextHop2 = {pmMi_corUser[0] + 1, pmMi_corUser[1]};
            if (pmMi_corUser[0] != pgMMIn_map.length - 2) { // Если не в 2 шагах от обрыва по направлению движения.
                pmi_nextHop2[0] = pmMi_corUser[0] + 2;
            }
            pf_popytHoda(pmMi_corUser, pmi_nextHop1, pmi_nextHop2);
        }

    }

    private static String pf_keyPres() {
        Scanner poSc_scanner = new Scanner(System.in);
        return poSc_scanner.nextLine();
    }

    private static void pf_inputMap(Integer[][] pgMMIn_map) {
        for (Integer[] pmMIn_map : pgMMIn_map) {
            for (Integer pmIn_map : pmMIn_map) {
                pf_convertMap(pmIn_map);
            }
            System.out.println();
        }
    }

    private static boolean pf_check_finish(Integer[][] pgMMIn_map, Integer[][] pgMMIn_map_ghost) {
        boolean pmb_finish = false;

        for (Integer[] pmMIn_map : pgMMIn_map) {
            for (Integer pmIn_map : pmMIn_map) {
                if (pmIn_map == 9) {
                    pmb_finish = true;
                    return pmb_finish;
                }
            }
        }
        // получаем координаты 4.
        int[] pmMi_temp = pf_corReturnUser(pgMMIn_map);

        // Проверяем что по ним в призраке/
        if (pgMMIn_map_ghost[pmMi_temp[0]][pmMi_temp[1]] == 9) {
            pmb_finish = true;
            return pmb_finish;
        }
        pf_inputMap(pgMMIn_map);
        System.out.println("Победа в сокобане!");
        return pmb_finish;
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
                for (int i = 0; i < pmi_kolvo; i++) System.out.print((char) 160);
            }
            case 4 -> {
                for (int i = 0; i < pmi_kolvo; i++) System.out.print((char) 11);
            }
            case 6 -> {
                for (int i = 0; i < pmi_kolvo; i++) System.out.print((char) 1120);
            }
            case 8 -> {
                for (int i = 0; i < pmi_kolvo; i++) System.out.print((char) 72);
            }
            case 9 -> {
                for (int i = 0; i < pmi_kolvo; i++) System.out.print((char) 47);
            }
        }
    }


}
