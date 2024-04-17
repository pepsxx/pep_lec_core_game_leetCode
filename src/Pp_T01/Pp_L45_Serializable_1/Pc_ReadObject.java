package Pp_T01.Pp_L45_Serializable_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Pc_ReadObject {
    public static void main(String[] args) {

        // Тестовый блок по файлу - Начало.
        // v2.4.0.4.1.6.
        // Измени Класс и имя файла.
        String pmSt_separator = File.separator;
        File poFi_file = new File(Pc_ReadObject.class.getResource("").getPath() + "Pp_Files" + pmSt_separator + "people.bin");
        System.out.printf("""
                                
                ----------------------------------------------------------------------------------------------------
                Файл тут: %s
                ----------------------------------------------------------------------------------------------------
                                
                """, poFi_file);
        // Тестовый блок по файлу - Начало.
        try {

            FileInputStream po_FiIS_fos = new FileInputStream(poFi_file);
            ObjectInputStream po_OiIS_oos = new ObjectInputStream(po_FiIS_fos);

            Pc_Person po_person1 = (Pc_Person) po_OiIS_oos.readObject(); // readObject() возвращает объект класса Object, поэтому требуется Downcast.
            Pc_Person po_person2 = (Pc_Person) po_OiIS_oos.readObject(); // readObject() возвращает объект класса Object, поэтому требуется Downcast.

            System.out.println("po_person1 = " + po_person1);
            System.out.println("po_person2 = " + po_person2);

            po_OiIS_oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
