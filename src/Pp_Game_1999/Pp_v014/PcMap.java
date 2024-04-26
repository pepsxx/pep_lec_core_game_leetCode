package Pp_Game_1999.Pp_v014;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

abstract class PcMap {
    static List<Integer[][]> getMapsAll() {
        return mapsAll;
    }

    private static List<Integer[][]> mapsAll = new ArrayList<>();

    static void mapsLoad() {
        // 4 - Герой.
        // 1 - Пустота.
        // 8 - Стена.
        // 6 - Куб.
        // 9 - Место для куба.
        mapsAll.add(new Integer[][]{
                {8, 8, 8, 8, 8, 8},
                {8, 1, 1, 1, 1, 8},
                {8, 1, 4, 6, 9, 8},
                {8, 1, 1, 1, 1, 8},
                {8, 8, 8, 8, 8, 8}
        });
        mapsAll.add(new Integer[][]{
                {1, 1, 1, 1, 8, 8, 8, 8, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 8, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 8, 6, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 8, 8, 8, 1, 1, 6, 8, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 8, 1, 1, 6, 1, 6, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {8, 8, 8, 1, 8, 1, 8, 8, 1, 8, 1, 1, 1, 8, 8, 8, 8, 8, 8},
                {8, 1, 1, 1, 8, 1, 8, 8, 1, 8, 8, 8, 8, 8, 1, 1, 9, 9, 8},
                {8, 1, 6, 1, 1, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 8},
                {8, 8, 8, 8, 8, 1, 8, 8, 8, 1, 8, 4, 8, 8, 1, 1, 9, 9, 8},
                {1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 8, 8, 8, 8, 8, 8, 8, 8, 8},
                {1, 1, 1, 1, 8, 8, 8, 8, 8, 8, 8, 1, 1, 1, 1, 1, 1, 1, 1}
        });
    }

    static Integer[][] mapCloneCreat(Integer[][] mapCurrent) {
        Integer[][] mapTemp = new Integer[mapCurrent.length][mapCurrent[0].length];
        for (int i = 0; i < mapCurrent.length; i++) {
            for (int j = 0; j < mapCurrent[i].length; j++) {
                mapTemp[i][j] = mapCurrent[i][j];
            }
        }
        return mapTemp;
    }

    static void mapIn(Integer[][] map) {
        PcGui.gui.getContentPane().removeAll();
        PcGui.gui.setSize((map[0].length*50),(map.length*50)+30);
        PcGui.gui.setLayout(new GridLayout(map.length, map[0].length,0,0));
        for (Integer[] integers : map) {
            for (Integer integer : integers) {
                for (int i = 0; i < 2; i++) {
                    mapConvert(integer);
                }
            }
            System.out.println();
        }
        PcGui.gui.setVisible(true);
    }

    private static void mapConvert(int integer) {
        // 4 - Герой.
        // 1 - Пустота.
        // 8 - Стена.
        // 6 - Куб.
        // 9 - Место для куба.
        JPanel jp = new JPanel();
        switch (integer) {
            case 1 -> {
                System.out.print((char) 160);
                jp.setBackground(Color.DARK_GRAY);
            }
            case 4 -> {
                //System.out.print((char) 2017);
                System.out.print((char) 1365);
                jp.setBackground(Color.green);
            }
            case 6 -> {
                System.out.print((char) 1120);
                jp.setBackground(Color.orange);
            }
            case 8 -> {
                System.out.print((char) 166);
                jp.setBackground(Color.red);
//                    System.out.print((char) 72);
            }
            case 9 -> {
                System.out.print((char) 58);
                jp.setBackground(Color.pink);
//                    System.out.print((char) 47);
            }
        }
        PcGui.gui.add(jp);
    }
}
