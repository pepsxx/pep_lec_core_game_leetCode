package Pp_T02.Pp_L03_LinkedList_1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Связный список LinkedList - Введение
    public static void main(String[] args) {
        List<Integer> poLIn_linkedList = new LinkedList<>();
        poLIn_linkedList.add(83);
        System.out.println("poLIn_linkedList.get(0) = " + poLIn_linkedList.get(0));
        poLIn_linkedList.size();
        poLIn_linkedList.remove(0);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("ArrayList удобен, когда нужен быстрый доступ по индексу, а LinkedList - когда важны операции вставки и удаления.");
        System.out.println("-----------------------------------------------------------------------------------------");

        List<Integer> poLIn_arrayList = new ArrayList<>();

        pf_measureTime(poLIn_linkedList, "LinkedList: ");
        System.out.println();
        pf_measureTime(poLIn_arrayList, "ArrayList:  ");
    }

    private static void pf_measureTime(List<Integer> pmLIn_List, String pmSt_name) {
        System.out.print(pmSt_name);

        long pml_time = System.currentTimeMillis(); // System.currentTimeMillis() - Текущее время в миллисекундах.
        System.out.print("pmLIn_List.add(i) ");
        for (int i = 0; i < 100_000; i++) pmLIn_List.add(i);
        System.out.printf("%5d   ", System.currentTimeMillis() - pml_time);

        pml_time = System.currentTimeMillis();
        System.out.print("pmLIn_List.get(i) ");
        for (int i = 0; i < 100_000; i++) pmLIn_List.get(i);
        System.out.printf("%5d   ", System.currentTimeMillis() - pml_time);

        pml_time = System.currentTimeMillis();
        System.out.print("pmLIn_List.add(0, i) ");
        for (int i = 0; i < 100_000; i++) pmLIn_List.add(0, i);
        System.out.printf("%5d   ", System.currentTimeMillis() - pml_time);
    }
}
