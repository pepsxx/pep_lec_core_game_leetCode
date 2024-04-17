package Pp_T01.Pp_L37_Exception_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pc_Exception1 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=DElNhj71YCk
    //Java для начинающих. Урок 37: Исключения (часть 1). Обработка исключений..
    public static void main(String[] args) {
        File poFi_file = new File("qwerty");
        try { // try Пытаться
            Scanner poSc_scanner = new Scanner(poFi_file);
            System.out.println("После 1 Scanner");
            poSc_scanner.close();
        } catch (FileNotFoundException e) { // try Ловить
            System.out.println("Файл не найден");
        }
        System.out.println("После 1 блока try catch");
        System.out.println();

        try {
            pf_readFile();
            System.out.println("После 2 pf_readFile()");
        } catch (FileNotFoundException e) { // try Ловить
            System.out.println("Файл не найден Опять");
        }
        System.out.println("После 2 блока try catch");
    }

    public void pf_FileNotFoundException() throws FileNotFoundException {
        File poFi_file = new File("qwerty");
        Scanner poSc_scanner = new Scanner(poFi_file);
    }
    public static void pf_readFile() throws FileNotFoundException {
        File poFi_file = new File("qwerty");
        Scanner poSc_scanner = new Scanner(poFi_file);
    }
}
