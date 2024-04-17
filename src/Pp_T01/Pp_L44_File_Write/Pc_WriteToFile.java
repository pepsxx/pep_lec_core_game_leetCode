package Pp_T01.Pp_L44_File_Write;

import Pp_T01.Pp_L36_File_Read.Pc_ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Pc_WriteToFile {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=nmxeAO7CYVg
    //Java для начинающих. Урок 44: Запись в файл.
    public static void main(String[] args) throws FileNotFoundException {
        // Тестовый блок по файлу - Начало.
        // v2.4.0.4.1.6.
        // Измени Класс и имя файла.
        String pmSt_separator = File.separator;
        File poFi_file = new File(Pc_WriteToFile.class.getResource("").getPath() + "Pp_Files" + pmSt_separator + "test.txt");        System.out.printf("""
                
                ----------------------------------------------------------------------------------------------------
                Файл тут: %s
                ----------------------------------------------------------------------------------------------------
                
                """, poFi_file);
        // Тестовый блок по файлу - Начало.

        PrintWriter po_wp = new PrintWriter(poFi_file);
        po_wp.println("Test row 1");
        po_wp.println("Test row 2");
        po_wp.close();
    }
}
