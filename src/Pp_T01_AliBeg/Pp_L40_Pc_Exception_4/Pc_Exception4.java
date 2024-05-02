package Pp_T01_AliBeg.Pp_L40_Pc_Exception_4;

import java.io.IOException;
import java.text.ParseException;

public class Pc_Exception4 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=9gw81XDJoKs
    //Java для начинающих. Урок 40: Исключения (часть 4).
    public static void main(String[] args) {
        try {
            pf_run();

// Вариант 1: Разная обработка для разных исключений.
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();

// Вариант 2: Одна обработка для разных исключений.
//        } catch (IOException | ParseException e) { // Catching Multiple Exception
//            e.printStackTrace();
//        }

// Вариант 3: Обработка родителя для разных исключений.
        } catch (Exception e) { // Catching Multiple Exception
            e.printStackTrace();
        }
    }

    public static void pf_run() throws IOException, ParseException, IllegalAccessError { // IllegalAccessError наследник IOException

    }
}
