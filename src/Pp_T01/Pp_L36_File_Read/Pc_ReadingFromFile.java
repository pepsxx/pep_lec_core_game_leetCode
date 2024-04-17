package Pp_T01.Pp_L36_File_Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pc_ReadingFromFile {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=j3I-jLGW8yU
    //Java для начинающих. Урок 36: Чтение из файла.
    public static void main(String[] args) throws FileNotFoundException {
        // Mac OS String pmSt_path = "/Users/neil/Desktop/test";
        // Win OS String pmSt_path = "\\Users\\neil\\Desktop\\test";
        String pmSt_separator = File.separator; // В зависимости от OS ставит нужный символ "\" или "/".
        // Pc_Test.class.getResource("").getPath() - Определяет путь к классу Pc_Test.
        String pmSt_path = Pc_ReadingFromFile.class.getResource("").getPath() + "Pp_Files" + pmSt_separator + "test.txt";
        System.out.println("pmSt_path = " + pmSt_path);

        System.out.println("--------------------------------------------------");

        File poFi_file = new File(pmSt_path);

        Scanner poSc_scanner = new Scanner(poFi_file);
        while (poSc_scanner.hasNextLine()) { // метод hasNextLine() выдает True если еще есть строки для считывания.
            System.out.println(poSc_scanner.nextLine());
        }

        poSc_scanner.close(); // Закрываем сканер для освобождения ресурсов.

        System.out.println("--------------------------------------------------");

        File poFi_file2 = new File(Pc_ReadingFromFile.class.getResource("").getPath() + "Pp_Files" + pmSt_separator + "test2.txt");
        Scanner poSc_scanner2 = new Scanner(poFi_file2);
        String pmSt_line = poSc_scanner2.nextLine(); // Считываем 1у строку, т.к. знаем что она всего одна.
        String[] pmMSt_numbersString = pmSt_line.split(" "); // Формируем массив из строки. Пробел означает что далее идет новый элемент массива.

        System.out.println("pmMSt_numbersString " + Arrays.toString(pmMSt_numbersString));   // Вывод элементов массива в стиле [11, 22, 33].

        int[] pmMi_numbers = new int[3];
        int pmi_counter = 0;

        for (String pmSt_x : pmMSt_numbersString) {
            pmMi_numbers[pmi_counter++] = Integer.parseInt(pmSt_x);
        }
        System.out.println("pmMi_numbers " + Arrays.toString(pmMi_numbers));

        System.out.println("--------------------------------------------------");
        System.out.println("-------------- Дополнительные тесты --------------");
        List<Integer> pLSt_numbers2 = new ArrayList<>();

        for (String pmSt_x : pmMSt_numbersString) {
            pLSt_numbers2.add(Integer.parseInt(pmSt_x));
        }
        System.out.println("pLSt_numbers2 " + pLSt_numbers2);

        poSc_scanner2.close();


    }
}
