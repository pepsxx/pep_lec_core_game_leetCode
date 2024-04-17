package Pp_T01.Pp_L46_Serializable_2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Pc_WriteObject {
    public static void main(String[] args) {
        // Тестовый блок по файлу - Начало.
        // v2.4.0.4.1.6.
        // Измени Класс и имя файла.
        String pmSt_separator = File.separator;
        File poFi_file = new File(Pc_WriteObject.class.getResource("").getPath() + "Pp_Files" + pmSt_separator + "people.bin");
        System.out.printf("""
                                
                ----------------------------------------------------------------------------------------------------
                Файл тут: %s
                ----------------------------------------------------------------------------------------------------
                                
                """, poFi_file);
        // Тестовый блок по файлу - Начало.

        Pc_Person[] poM_people = {new Pc_Person(1, "Bob"), new Pc_Person(2, "Mike"), new Pc_Person(3, "Tom")};

        try {
            FileOutputStream po_FiOS_fos = new FileOutputStream(poFi_file); // Этот класс записывает последовательность байтов в файл.
            ObjectOutputStream po_OiOS_oos = new ObjectOutputStream(po_FiOS_fos);   // Этот класс записывает Объекты.

            // Вариант 1.
//            po_OiOS_oos.writeInt(poM_people.length);
//
//            for (Pc_Person po_person : poM_people) {
//                po_OiOS_oos.writeObject(po_person);
//            }

            // Вариант 2.
            po_OiOS_oos.writeObject(poM_people);

            // Конец для обоих вариантов.
            po_OiOS_oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
