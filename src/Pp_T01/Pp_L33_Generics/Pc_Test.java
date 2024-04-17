package Pp_T01.Pp_L33_Generics;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=iQIR2Zgb93k
    //Java для начинающих. Урок 33: Введение в параметризацию. (Generics).
    public static void main(String[] args) {
        // Как было до появления Generics. До Java 5.
        List pmLs_list = new ArrayList(); // List хранит в себе любые объекты.
        pmLs_list.add("");

        List pmL_animals = new ArrayList();
        pmL_animals.add("cat");  // Мы добавляем String.
        pmL_animals.add("dog");  // Мы добавляем String.
        pmL_animals.add("frog"); // Мы добавляем String.
        pmL_animals.add(1);      // Мы добавляем число.

        String pmSt_animal = (String) pmL_animals.get(1); // Делаем Downcast в String т.к. знаем то добавляли String.
        System.out.println("pmSt_animal = " + pmSt_animal);

        // Как стало с появлением Generics. В Java 5. Далее написано по синтаксису Java 7+.
        List<String> pmLSt_animals2 = new ArrayList<>(); // List хранит в себе только объекты String.
        pmLSt_animals2.add("cat");  // Мы добавляем String.
        pmLSt_animals2.add("dog");  // Мы добавляем String.
        pmLSt_animals2.add("frog"); // Мы добавляем String.
        //pmLSt_animals2.add(1);      // Мы не можем добавлять число.
        String pmSt_animal2 = pmLSt_animals2.get(1); // Downcast Больше не требуется т.к. при создании List использовали <String>
        System.out.println("pmSt_animal2 = " + pmSt_animal2);
    }
}
