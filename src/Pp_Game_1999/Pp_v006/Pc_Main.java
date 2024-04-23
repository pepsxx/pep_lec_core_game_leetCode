package Pp_Game_1999.Pp_v006;

import java.util.ArrayList;
import java.util.List;

public class Pc_Main {

    public static void main(String[] args) {

        // Загрузка всех карт.
        Pc_Map.pf_Load_map();

        // Поочередный запуск этапов.
        for (int x = 0; x < Pc_Map.poLi_maps.size(); x++) {

            // Создаём переменную текущей карты.
            Integer[][] pgMMIn_map = Pc_Map.poLi_maps.get(x);

            // Создаём переменную призрака текущей карты.
            Integer[][] pgMMIn_map_ghost = Pc_Map.pf_map_ghost(pgMMIn_map);

            // Создаём переменную с координатами "9 - Место для куба".
            List<Integer[]> poLi_finishCoordinate = new ArrayList<>();
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

            // Запускаем игру.
            while (Pc_Map.pf_check_finish(pgMMIn_map, pgMMIn_map_ghost, poLi_finishCoordinate)) {
                System.out.println("--------------------------------------------------");
                pf_getMasDuble(pgMMIn_map);
                pf_getMasDuble(pgMMIn_map_ghost);
                pf_getListMasUno(poLi_finishCoordinate);

                Pc_Map.pf_inputMap(pgMMIn_map); // Вывод текущей карты.
                pgMMIn_map = Pc_Motion.pf_hod(pgMMIn_map);   // Функция хода.


                System.out.println("+++++++++++++++++++++++++d");
                pf_getMasDuble(pgMMIn_map);
                pf_getMasDuble(pgMMIn_map_ghost);
                pf_getListMasUno(poLi_finishCoordinate);
            }
        }
    }

    static void pf_getMasDuble(Integer[][] MasDuble) {
        for (Integer[] integers : MasDuble) {
            for (Integer integer : integers) {
                System.out.print(integer);
            }
            System.out.println();
        }

    }

    static void pf_getListMasUno(List<Integer[]> ListMasUno) {
        for (Integer[] integers : ListMasUno) {
            for (Integer integer : integers) {
                System.out.print(integer);
            }
            System.out.println();
        }

    }
}
