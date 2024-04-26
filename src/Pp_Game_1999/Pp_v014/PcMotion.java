package Pp_Game_1999.Pp_v014;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class PcMotion {

    static void set_mi_x(int mi_x) {
        PcMotion.mi_x = mi_x;
    }

    static void set_mi_y(int mi_y) {
        PcMotion.mi_y = mi_y;
    }

    static int get_mi_x() {
        return mi_x;
    }

    static int get_mi_y() {
        return mi_y;
    }

    private static int mi_x, mi_y, nextHop1_x, nextHop1_y, nextHop2_x, nextHop2_y;

//    static void start(int i) {
//        String keyPressed = keyPressed();
//        motion(keyPressed);
//        switch (keyPressed) {
//            case "r", "R", "к", "К" -> {
//                List<Integer[]> coordinatesFinish = new ArrayList<>();
//                Main.preparation(i, coordinatesFinish);
//                PcMessage.pf_pepLogo1();
//                PcMessage.roundRestart(i);
//            }
//        }
//    }

    static void motion(String keyPressed) {
        System.out.println("keyPressed = " + keyPressed);
        switch (keyPressed) {
            case "w", "W", "ц", "Ц" -> motionUp();
            case "a", "A", "ф", "Ф" -> motionLeft();
            case "s", "S", "ы", "Ы" -> motionDown();
            case "d", "D", "в", "В" -> motionRight();
        }
    }

    private static String keyPressed() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void motionLeft() {
        if (mi_x != 0) { // Если не в 1 шаге от обрыва по направлению движения.
            nextHop1_x = mi_x - 1;
            nextHop1_y = mi_y;
            nextHop2_x = mi_x - 1;
            nextHop2_y = mi_y;

            if (mi_x != 1) // Если не в 2 шагах от обрыва по направлению движения.
                nextHop2_x = mi_x - 2;

            go(nextHop1_x, nextHop1_y, nextHop2_x, nextHop2_y);
        }
    }

    private static void motionRight() {
        int tmp = Main.mapsForCurrentRound.get("curMap")[0].length;
        if (mi_x != (tmp - 1)) { // Если не в 1 шаге от обрыва по направлению движения.
            nextHop1_x = mi_x + 1;
            nextHop1_y = mi_y;
            nextHop2_x = mi_x + 1;
            nextHop2_y = mi_y;

            if (mi_x != (tmp - 2)) // Если не в 2 шагах от обрыва по направлению движения.
                nextHop2_x = mi_x + 2;

            go(nextHop1_x, nextHop1_y, nextHop2_x, nextHop2_y);
        }

    }

    private static void motionUp() {
        if (mi_y != 0) { // Если не в 1 шаге от обрыва по направлению движения.
            nextHop1_x = mi_x;
            nextHop1_y = mi_y - 1;
            nextHop2_x = mi_x;
            nextHop2_y = mi_y - 1;

            if (mi_y != 1)  // Если не в 2 шагах от обрыва по направлению движения.
                nextHop2_y = mi_y - 2;

            go(nextHop1_x, nextHop1_y, nextHop2_x, nextHop2_y);
        }

    }

    private static void motionDown() {
        int tmp = Main.mapsForCurrentRound.get("curMap").length;
        if (mi_y != (tmp - 1)) { // Если не в 1 шаге от обрыва по направлению движения.
            nextHop1_x = mi_x;
            nextHop1_y = mi_y + 1;
            nextHop2_x = mi_x;
            nextHop2_y = mi_y + 1;

            if (mi_y != (tmp - 2))  // Если не в 2 шагах от обрыва по направлению движения.
                nextHop2_y = mi_y + 2;

            go(nextHop1_x, nextHop1_y, nextHop2_x, nextHop2_y);
        }
    }

    private static void go(int nextHop1_x, int nextHop1_y, int nextHop2_x, int nextHop2_y) {
        Integer[][] mapCurTemp = Main.mapsForCurrentRound.get("curMap");
        Integer[][] mapGhoTemp = Main.mapsForCurrentRound.get("ghoMap");
        int next1Val = mapCurTemp[nextHop1_y][nextHop1_x];
        int next2Val = mapCurTemp[nextHop2_y][nextHop2_x];
        int imCurVal = mapCurTemp[mi_y][mi_x];
        int miGhoVal = mapGhoTemp[mi_y][mi_x];
        if (miGhoVal != 9)
            miGhoVal = 1;

        if (next1Val == 6 && ((nextHop1_x == nextHop2_x) && (nextHop1_y == nextHop2_y))) // Попытка сдвинуть ящик в обрыв.
            return;

        int pmi_variant = 0;
        if (next1Val == 1 || next1Val == 9)
            pmi_variant = 1;
        else if (next1Val == 6 && (next2Val == 1 || next2Val == 9))
            pmi_variant = 2;

        if (pmi_variant != 0) {

            mapCurTemp[mi_y][mi_x] = miGhoVal;
            if (pmi_variant == 1)
                mapCurTemp[nextHop1_y][nextHop1_x] = imCurVal;
            if (pmi_variant == 2) {
                mapCurTemp[nextHop1_y][nextHop1_x] = imCurVal;
                mapCurTemp[nextHop2_y][nextHop2_x] = next1Val;
            }
            mi_x = nextHop1_x;
            mi_y = nextHop1_y;
        }
    }

}
