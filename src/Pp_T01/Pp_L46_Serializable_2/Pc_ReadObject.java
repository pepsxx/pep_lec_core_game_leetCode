package Pp_T01.Pp_L46_Serializable_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

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

            // Вариант 1.
//            int pmi_personCount = po_OiIS_oos.readInt();
//            Pc_Person[] poM_people = new Pc_Person[pmi_personCount];
//
//            for (int i = 0; i < pmi_personCount; i++) {
//                poM_people[i] = (Pc_Person) po_OiIS_oos.readObject(); // readObject() возвращает объект класса Object, поэтому требуется Downcast.
//            }

            // Вариант 2.
            Pc_Person[] poM_people = (Pc_Person[]) po_OiIS_oos.readObject();// readObject() возвращает объект класса Object, поэтому требуется Downcast.

            // Результат.
            System.out.println(Arrays.toString(poM_people));

            po_OiIS_oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
