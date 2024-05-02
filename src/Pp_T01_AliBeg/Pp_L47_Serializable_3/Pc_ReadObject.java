package Pp_T01_AliBeg.Pp_L47_Serializable_3;

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
        try ( ObjectInputStream po_OiIS_oos = new ObjectInputStream(new FileInputStream(poFi_file))) { // При такой реализации поток можно не закрывать.

            Pc_Person po_person1 = (Pc_Person) po_OiIS_oos.readObject(); // readObject() возвращает объект класса Object, поэтому требуется Downcast.

            System.out.println("po_person1 = " + po_person1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
