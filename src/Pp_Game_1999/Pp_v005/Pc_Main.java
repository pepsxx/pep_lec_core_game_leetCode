package Pp_Game_1999.Pp_v005;

import java.util.ArrayList;
import java.util.List;

public class Pc_Main {


    private static Integer[][] pgMMIn_map = new Integer[][]{
            // 4 - Герой.
            // 1 - Пустота.
            // 8 - Стена.
            // 6 - Куб.
            // 9 - Место для куба.

//            {8, 8, 8, 8, 8, 8},
//            {4, 1, 1, 1, 1, 8},
//            {8, 1, 1, 6, 9, 8},
//            {8, 1, 1, 1, 1, 8},
//            {8, 8, 8, 8, 8, 8}};

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
            {1, 1, 1, 1, 8, 8, 8, 8, 8, 8, 8, 1, 1, 1, 1, 1, 1, 1, 1}};

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

        List<Integer[]> poLi_finishCoordinate = new ArrayList<>(); // List - с координатами "9 - Место для куба"

        for (int i = 0; i < pgMMIn_map.length; i++) {
            for (int j = 0; j < pgMMIn_map[i].length; j++) {
                if (pgMMIn_map[i][j] == 4) {
                    Pc_Motion.setPgi_mi_x(j); // Координата пользователя x.
                    Pc_Motion.setPgi_mi_y(i); // Координата пользователя у.
                    // Добавить проверку на карту без пользователя.
                    // Добавить проверку на карту с пользователями более 1.
                    // Добавить проверку на карту без ящиков.
                    // Добавить проверку на карту, где количество ящиков не соответствует количеству "9 - Место для куба".
                } else if (pgMMIn_map[i][j] == 9) {
                    poLi_finishCoordinate.add(new Integer[]{i, j}); // Формирование листа.
                }
            }
        }

        while (Pc_Map.pf_check_finish(pgMMIn_map, getPgMMIn_map_ghost(), poLi_finishCoordinate)) {
            Pc_Map.pf_inputMap(pgMMIn_map); // Вывод текущей карты.
            Pc_Motion.pf_hod();             // Функция хода.
        }
    }
}
