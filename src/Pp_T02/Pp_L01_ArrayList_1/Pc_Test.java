package Pp_T02.Pp_L01_ArrayList_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=QCjLMw988kQ
    //Продвинутая Java: Динамический массив (ArrayList) - Введение.
    public static void main(String[] args) {
//        int[] pgi_x = int[3];
//        for (int i = 0; i < 4; i++) { // Ошибка т.к. вышли за пределы.
//            pgi_x[i] = 1;
//        }
        ArrayList<Integer> pmLIn_arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) pmLIn_arrayList.add(i);
        System.out.println("pmLIn_arrayList = " + pmLIn_arrayList);
        System.out.println("pmLIn_arrayList.get(0) = " + pmLIn_arrayList.get(0));
        System.out.println("pmLIn_arrayList.get(99) = " + pmLIn_arrayList.get(99));

        System.out.println("pmLIn_arrayList.size() = " + pmLIn_arrayList.size());
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < pmLIn_arrayList.size(); i++)
            System.out.println("pmLIn_arrayList.get(i) = " + pmLIn_arrayList.get(i));

        for (Integer i : pmLIn_arrayList) System.out.println("i = " + i);
        System.out.println("-----------------------------------------------------------------------------------------");

        pmLIn_arrayList.clear();
        for (int i = 0; i < 10; i++) pmLIn_arrayList.add(i);
        System.out.println("pmLIn_arrayList = " + pmLIn_arrayList);
        pmLIn_arrayList.remove(5);
        System.out.println("pmLIn_arrayList = " + pmLIn_arrayList);
        System.out.println("-----------------------------------------------------------------------------------------");

        List<Integer> pmLIn_List = new ArrayList<>(); // По конвенции писать List, а не ArrayList.
        for (int i = 0; i < 10; i++) pmLIn_List.add(i);
        System.out.println("pmLIn_List = " + pmLIn_List);
        pmLIn_List = new LinkedList<>(pmLIn_List); // Преобразование ArrayList в LinkedList, можно сделать т.к. List<Integer>, а не только ArrayList<Integer>.
        //ArrayList удобен, когда нужен быстрый доступ по индексу, а LinkedList - когда важны операции вставки и удаления.
        System.out.println("pmLIn_List = " + pmLIn_List);
    }
}
