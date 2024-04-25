package Pp_Game_1999.Pp_v010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Main {
    static List<Integer[][]> mapsForCurrentRound = new ArrayList<>();
    // 0 mapCurrent.
    // 1 mapGhost.
    public static void main(String[] args) {
        // Загрузка всех карт.
        Map.mapsLoad();

        // Поочередный запуск этапов.
        for (int i = 0; i < Map.getMapsAll().size(); i++) {

            // Создаём массив текущей карты.
            Integer[][] mapCurrentTemp = Map.getMapsAll().get(i);
            mapsForCurrentRound.add(0, mapCurrentTemp);

            // Создаём массив призрака текущей карты.
            Integer[][] mapGhostTemp = Map.mapGhostCreat(mapCurrentTemp);
            mapsForCurrentRound.add(1, mapGhostTemp);

            // Создаём List c координатами финиша и задаем переменные координат x и y пользователя.
            List<Integer[]> coordinatesFinish = new ArrayList<>();
            for (int y = 0; y < mapCurrentTemp.length; y++) {
                for (int x = 0; x < mapCurrentTemp[y].length; x++) {
                    if (mapCurrentTemp[y][x] == 4) {
                        Motion.set_mi_x(x); // Создаём координату пользователя x.
                        Motion.set_mi_y(y); // Создаём координату пользователя y.
                        // Добавить проверку на карту без пользователя.
                        // Добавить проверку на карту с пользователями более 1.
                        // Добавить проверку на карту без ящиков.
                        // Добавить проверку на карту, где количество ящиков не соответствует количеству "9 - Место для куба".
                    } else if (mapCurrentTemp[y][x] == 9) {
                        coordinatesFinish.add(new Integer[]{y, x}); // Формирование List.
                    }
                }
            }

            // Вывод Logo.
            pf_pepLogo1();
            System.out.printf("""
                    -                                 Раунд %3d                                 -
                    -----------------------------------------------------------------------------
                    """, i+1);

            // Старт игры.
            while (finishCheck(coordinatesFinish)) {

                // Прорисовка карты.
                Map.mapIn(mapsForCurrentRound.get(0));

                // Ход пользователя.
                Motion.start();
            }

            // Вывод Logo.
            pf_pepLogo1();
            System.out.println("""
                    -                                 Game Over                                 -
                    -----------------------------------------------------------------------------
                    """);
        }
    }

    private static boolean finishCheck(List<Integer[]> coordinatesFinish) {
        // Поиск свободных мест для кубов.
        for (Integer[] coordinate : coordinatesFinish)
            if (Main.mapsForCurrentRound.get(0)[coordinate[0]][coordinate[1]] == 9)
                return true;


        // Проверяем стоит ли пользователь на месте для кубов.
        if (Main.mapsForCurrentRound.get(1)[Motion.get_mi_y()][Motion.get_mi_x()] == 9)
            return true;

        // Прорисовка карты перед победой.
        Map.mapIn(mapsForCurrentRound.get(0));

        // Вывод поздравления и ожидание нажатия клавиши пользователем.
        System.out.printf("""
                    -----------------------------------------------------------------------------
                    -                              Победа в раунде                              -
                    -----------------------------------------------------------------------------
                    """);
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        return false;
    }

    private static void pf_pepLogo1() {
        // Logo - Начало.
        // V2.4.0.4.2.3.
        System.out.println("""
                -----------------------------------------------------------------------------
                -                                              $$                           -
                - $$$$$$$$     $$$$$$   $$$$$$$$            $$$$$$$$  $$$$  $$$$ $$$$  $$$$ -
                - $$$$$$$$$   $$$$$$$$  $$$$$$$$$          $$$$$$$$$$ $$$$  $$$$ $$$$  $$$$ -
                - $$$$  $$$$ $$$$  $$$$ $$$$  $$$$         $$$$   $$$  $$$  $$$   $$$  $$$  -
                - $$$$  $$$$ $$$$  $$$$ $$$$  $$$$         $$$$         $$$$$$     $$$$$$   -
                - $$$$$$$$$  $$$$$$$$$$ $$$$$$$$$          $$$$$$$$$     $$$$       $$$$    -
                - $$$$$$$$   $$$$$$$$$$ $$$$$$$$            $$$$$$$$$    $$$$       $$$$    -
                - $$$$       $$$$       $$$$                     $$$$   $$$$$$     $$$$$$   -
                - $$$$       $$$$  $$$$ $$$$               $$$   $$$$  $$$  $$$   $$$  $$$  -
                - $$$$        $$$$$$$$  $$$$     $$$$$$$$  $$$$$$$$$$ $$$$  $$$$ $$$$  $$$$ -
                - $$$$          $$$$    $$$$     $$$$$$$$   $$$$$$$$  $$$$  $$$$ $$$$  $$$$ -
                -                                              $$                           -
                -----------------------------------------------------------------------------""");
        // Logo - Конец.
    }
}
