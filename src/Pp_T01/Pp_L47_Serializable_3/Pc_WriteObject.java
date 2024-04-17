package Pp_T01.Pp_L47_Serializable_3;

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

        Pc_Person po_person1 = new Pc_Person(1, "Mike");
        try {
            ObjectOutputStream po_OiOS_oos = new ObjectOutputStream(new FileOutputStream(poFi_file));   // При такой реализации поток нужно будет закрыть.

            po_OiOS_oos.writeObject(po_person1);

            po_OiOS_oos.close(); // Закрытие потока.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
