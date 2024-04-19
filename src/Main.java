public class Main {
    public static void main(String[] args) throws InterruptedException {
        pf_pepLogo1();
        pf_pepLogo2();
        pf_pepNote();
        // Ошибки - Начало.
        // v2.4.0.4.1.6.
        // Ошибка:  java.io.NotSerializableException: Pc_Class.
        // Причина: Pc_Class(у) не разрешена сериализация.
        // Решение: public class Pc_Class -> implements Serializable <- {
        //
        // Ошибка:  java.lang.StackOverflowError.
        // Причина: Бесконечная рекурсия. Stack переполнился.
        // Решение: Править код.
        //
        // Ошибка:  хХх.
        // Причина: хХх.
        // Решение: Править код.
        // Ошибки - Конец.
    }

    private static void pf_pepLogo1() {
        // Logo - Начало.
        // v2.4.0.4.1.3.
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
                -----------------------------------------------------------------------------
                """);
        // Logo - Конец.
    }

    private static void pf_pepLogo2() throws InterruptedException {
        // Logo - Начало.
        // v2.4.0.4.1.8.
        pf_printString("-----------------------------------------------------------------------------");
        pf_printString("-                                              $$                           -");
        pf_printString("- $$$$$$$$     $$$$$$   $$$$$$$$            $$$$$$$$  $$$$  $$$$ $$$$  $$$$ -");
        pf_printString("- $$$$$$$$$   $$$$$$$$  $$$$$$$$$          $$$$$$$$$$ $$$$  $$$$ $$$$  $$$$ -");
        pf_printString("- $$$$  $$$$ $$$$  $$$$ $$$$  $$$$         $$$$   $$$  $$$  $$$   $$$  $$$  -");
        pf_printString("- $$$$  $$$$ $$$$  $$$$ $$$$  $$$$         $$$$         $$$$$$     $$$$$$   -");
        pf_printString("- $$$$$$$$$  $$$$$$$$$$ $$$$$$$$$          $$$$$$$$$     $$$$       $$$$    -");
        pf_printString("- $$$$$$$$   $$$$$$$$$$ $$$$$$$$            $$$$$$$$$    $$$$       $$$$    -");
        pf_printString("- $$$$       $$$$       $$$$                     $$$$   $$$$$$     $$$$$$   -");
        pf_printString("- $$$$       $$$$  $$$$ $$$$               $$$   $$$$  $$$  $$$   $$$  $$$  -");
        pf_printString("- $$$$        $$$$$$$$  $$$$     $$$$$$$$  $$$$$$$$$$ $$$$  $$$$ $$$$  $$$$ -");
        pf_printString("- $$$$          $$$$    $$$$     $$$$$$$$   $$$$$$$$  $$$$  $$$$ $$$$  $$$$ -");
        pf_printString("-                                              $$                           -");
        pf_printString("-----------------------------------------------------------------------------");
        // Logo - Конец.
    }

    private static void pf_printString(String pmSt_s) throws InterruptedException {
        for (int i = 0; i < pmSt_s.length(); i++) {
            System.out.print(pmSt_s.charAt(i));
            Thread.sleep(1);
        }
        System.out.println();
    }

    private static void pf_pepNote() {
        // Заметки - Начало.
        // v2.4.0.4.1.6.
        System.out.println("""
                /////////////////////////////////////////////////////////////////////////////////////////
                // Ctrl + D             - Создать копию выделенной(х) строки(ок) кода снизу.
                // Ctrl + /             - Закомментировать выделенную(е) строку(и).
                // Ctrl + Shift + /     - Закомментировать выделанный кусок кода.
                // Ctrl + Alt - L       - Выровнять код по стилю.
                // Ctrl + Alt  + Insert - Меню с выбором создания: Класса и др...
                //        Alt  + Insert - Меню с выбором создания: Конструктора, Гетора, Сетора...
                // Shift + F10          - Запустить код.");
                // psvm - Создать метод main
                // sout - Создать метод System.out.println();
                /////////////////////////////////////////////////////////////////////////////////////////
                // (public, protected, default, private)
                //// "public"    - Переменную можно будет задавать на прямую, следовательно, можно задать не корректное число (неправильно небезопасно).
                //// "protected" - Доступ к переменной в пределах пакета (папки) и из классов родителей.
                //// "default"   - Доступ к переменной в пределах пакета (папки).
                //// "private"   - Переменную можно будет поменять только через метод (правильно безопасно).
                // "static"      - Это переменная не объекта, а класса и поэтому при её смене она меняется сразу у всех объектов.
                // "final"       - Переменная которую нельзя менять (ПРИНЯТО ПИСАТЬ ИМЯ БОЛЬШИМИ БУКВАМИ).
                // pmxxxxxxx - Переменная - Объекта в методе.
                // pgxxxxxxx - Переменная - Объекта в классе ("глобальная").
                // psxxxxxxx - Переменная - Класса Общая.      (static)
                // PXXXXXXXx - Переменная - Неизменная. (final) //Конвенция - Всё большими буквами.
                //
                // Pc_Xxxxxx - Класс.                           //Конвенция - С большой буквы.
                // Pi_Xxxxxx - Интерфейс.
                // Pe_Xxxxxx - Перечисления.
                // Pp_Xxxxxx - Пакет.
                // pf_Xxxxxx - Функции (мои методы) ничего не возвращает.
                // pfi_Xxxxx - Функции (мои методы) возвращает int.
                // po_Xxxxxx - Объекты. Кроме: Оберточные, Массивы.
                //
                // poEn_Xxxx -> Enum.
                // poSb_Xxxx -> StringBuilder.
                // poSc_Xxxx -> Scanner.
                // poFi_Xxxx -> File.
                // poFiOS_Xx -> FileOutputStream.
                // poFiIS_Xx -> FileInputStream.
                // poObOS_Xx -> ObjectOutputStream.
                // poObIS_Xx -> ObjectInputStream.
                // poTh_Xxxx -> Thread.
                //
                // poLi_Xxxx - List. // Переделать.
                // poSe_Xxxx - Set.
                // poMa_Xxxx - Map.
                //
                // set_pgi_age - Сетор для переменной pgi_ag. // Лучше создавать средой разработки.
                // get_pgi_age - Гетор для переменной pgi_ag. // Лучше создавать средой разработки.
                // get_Xxxxxxx - Гетор для ещё чего-либо.
                // В методах set и get возможно проще использовать переменную "pgxxxxxx" с "this." вместо "ppxxxxxx".
                //
                // pmс_Xxxxx - Переменная примитивная -> char.
                // pmy_Xxxxx - Переменная примитивная -> byte.
                // pms_Xxxxx - Переменная примитивная -> short.
                // pmi_Xxxxx - Переменная примитивная -> int.
                // pml_Xxxxx - Переменная примитивная -> long.
                // pmf_Xxxxx - Переменная примитивная -> float.
                // pmd_Xxxxx - Переменная примитивная -> double.
                // pmb_Xxxxx - Переменная примитивная -> boolean.
                //
                // pmDo_Xxxx - Переменная - Ссылочная -> Double.
                // pmFl_Xxxx - Переменная - Ссылочная -> Float.
                // pmLo_Xxxx - Переменная - Ссылочная -> Long.
                // pmIn_Xxxx - Переменная - Ссылочная -> Integer.
                // pmSh_Xxxx - Переменная - Ссылочная -> Short.
                // pmBy_Xxxx - Переменная - Ссылочная -> Byte.
                // pmCh_Xxxx - Переменная - Ссылочная -> Character.
                // pmBo_Xxxx - Переменная - Ссылочная -> Boolean.
                //
                // pmМi_Xxxxx - Масив - Одномерный  -> int.
                // pmМMi_Xxxx - Масив - Двумерный   -> int.
                // pmМSt_Xxxx - Масив - Одномерный  -> String.
                // pmМMSt_Xxx - Масив - Двумерный   -> String.
                /////////////////////////////////////////////////////////////////////////////////////////
                """);
        // Заметки - Конец.
    }

}