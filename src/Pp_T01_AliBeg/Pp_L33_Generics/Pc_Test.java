package Pp_T01_AliBeg.Pp_L33_Generics;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=iQIR2Zgb93k
    //Java для начинающих. Урок 33: Введение в параметризацию. (Generics).
    public static void main(String[] args) {
        // Как было до появления Generics. До Java 5.
        List poLi_list = new ArrayList(); // List хранит в себе любые объекты.
        poLi_list.add("");

        List poLi_animals = new ArrayList();
        poLi_animals.add("cat");  // Мы добавляем String.
        poLi_animals.add("dog");  // Мы добавляем String.
        poLi_animals.add("frog"); // Мы добавляем String.
        poLi_animals.add(1);      // Мы добавляем число.

        String pmSt_animal = (String) poLi_animals.get(1); // Делаем Downcast в String т.к. знаем то добавляли String.
        System.out.println("pmSt_animal = " + pmSt_animal);

        // Как стало с появлением Generics. В Java 5. Далее написано по синтаксису Java 7+.
        List<String> poLi_animals2 = new ArrayList<>(); // List хранит в себе только объекты String.
        poLi_animals2.add("cat");  // Мы добавляем String.
        poLi_animals2.add("dog");  // Мы добавляем String.
        poLi_animals2.add("frog"); // Мы добавляем String.
        //poLi_animals2.add(1);      // Мы не можем добавлять число.
        String pmSt_animal2 = poLi_animals2.get(1); // Downcast Больше не требуется т.к. при создании List использовали <String>
        System.out.println("pmSt_animal2 = " + pmSt_animal2);
    }
}
