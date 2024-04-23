package Pp_T03.Pp_L03_List_LinkedList_1;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Связный список LinkedList - Введение
    public static void main(String[] args) {
        List<Integer> poLi_linkedList = new LinkedList<>();
        poLi_linkedList.add(83);
        System.out.println("poLi_linkedList.get(0) = " + poLi_linkedList.get(0));
        poLi_linkedList.size();
        poLi_linkedList.remove(0);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("ArrayList удобен, когда нужен быстрый доступ по индексу, а LinkedList - когда важны операции вставки и удаления.");
        System.out.println("-----------------------------------------------------------------------------------------");

        List<Integer> poLi_arrayList = new ArrayList<>();

        pf_measureTime(poLi_linkedList, "LinkedList: ");
        System.out.println();
        pf_measureTime(poLi_arrayList, "ArrayList:  ");
    }

    private static void pf_measureTime(List<Integer> poLi_List, String pmSt_name) {
        System.out.print(pmSt_name);

        long poLi_time = System.currentTimeMillis(); // System.currentTimeMillis() - Текущее время в миллисекундах.
        System.out.print("poLi_List.add(i) ");
        for (int i = 0; i < 100_000; i++) poLi_List.add(i);
        System.out.printf("%5d   ", System.currentTimeMillis() - poLi_time);

        poLi_time = System.currentTimeMillis();
        System.out.print("poLi_List.get(i) ");
        for (int i = 0; i < 100_000; i++) poLi_List.get(i);
        System.out.printf("%5d   ", System.currentTimeMillis() - poLi_time);

        poLi_time = System.currentTimeMillis();
        System.out.print("poLi_List.add(0, i) ");
        for (int i = 0; i < 100_000; i++) poLi_List.add(0, i);
        System.out.printf("%5d   ", System.currentTimeMillis() - poLi_time);
    }
}
