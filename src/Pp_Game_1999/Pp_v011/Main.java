package Pp_Game_1999.Pp_v011;

import java.util.*;


public abstract class Main {
    static Map<String, Integer[][]> mapsForCurrentRound = new HashMap<>();

    // mapCur mapCurrent.
    // mapCur mapCurst.
    public static void main(String[] args) {
        // Загрузка всех карт.
        PcMap.mapsLoad();

        // Поочередный запуск этапов.
        for (int i = 0; i < PcMap.getMapsAll().size(); i++) {
            List<Integer[]> coordinatesFinish = new ArrayList<>();

            // Подготовка карты, карты призрака, координат пользователя, координат финиша.
            preparation(i, coordinatesFinish);

            // Вывод Logo.
            pf_pepLogo1();
            System.out.printf("""
                    -                                 Раунд %3d                                 -
                    -----------------------------------------------------------------------------
                    """, i + 1);

            // Старт игры.
            while (finishCheck(coordinatesFinish)) {

                // Прорисовка карты.
                PcMap.mapIn(mapsForCurrentRound.get("curMap"));

                // Ход пользователя.
                PcMotion.start(i);
            }

            // Вывод Logo.
            pf_pepLogo1();
            System.out.println("""
                    -                                 Game Over                                 -
                    -----------------------------------------------------------------------------
                    """);
        }
    }

    static void preparation(int i, List<Integer[]> coordinatesFinish) {
        System.out.println("-=preparation=-");
        System.out.println("i = " + i);

        // Клонируем в Map массив текущей карты.
        mapsForCurrentRound.put("curMap", PcMap.mapCloneCreat(PcMap.getMapsAll().get(i)));

        // Клонируем в Map массив призрака текущей карты.
        mapsForCurrentRound.put("ghoMap", PcMap.mapCloneCreat(PcMap.getMapsAll().get(i)));


        // Создаём List c координатами финиша и задаем переменные координат x и y пользователя.
        for (int y = 0; y < mapsForCurrentRound.get("curMap").length; y++) {
            for (int x = 0; x < mapsForCurrentRound.get("curMap")[y].length; x++) {
                if (mapsForCurrentRound.get("curMap")[y][x] == 4) {
                    PcMotion.set_mi_x(x); // Создаём координату пользователя x.
                    PcMotion.set_mi_y(y); // Создаём координату пользователя y.
                    // Добавить проверку на карту без пользователя.
                    // Добавить проверку на карту с пользователями более 1.
                    // Добавить проверку на карту без ящиков.
                    // Добавить проверку на карту, где количество ящиков не соответствует количеству "9 - Место для куба".
                } else if (mapsForCurrentRound.get("curMap")[y][x] == 9) {
                    coordinatesFinish.add(new Integer[]{y, x}); // Формирование List.
                }
            }
        }
    }

    private static boolean finishCheck(List<Integer[]> coordinatesFinish) {
        // Поиск свободных мест для кубов.
        for (Integer[] coordinate : coordinatesFinish)
            if (Main.mapsForCurrentRound.get("curMap")[coordinate[0]][coordinate[1]] == 9)
                return true;


        // Проверяем стоит ли пользователь на месте для кубов.
        if (Main.mapsForCurrentRound.get("ghoMap")[PcMotion.get_mi_y()][PcMotion.get_mi_x()] == 9)
            return true;

        // Прорисовка карты перед победой.
        PcMap.mapIn(mapsForCurrentRound.get("curMap"));

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

//    public static void test1 (Integer[][] t) {
//        for (Integer[] integers : t) {
//            for (Integer integer : integers) {
//                System.out.print(integer);
//            }
//            System.out.println();
//        }
//    }

}
