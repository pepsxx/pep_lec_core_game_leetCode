package Pp_T03_AliAdv.Pp_L01_List_ArrayList_1;

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
        ArrayList<Integer> poLi_arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) poLi_arrayList.add(i);
        System.out.println("poLi_arrayList = " + poLi_arrayList);
        System.out.println("poLi_arrayList.get(0) = " + poLi_arrayList.get(0));
        System.out.println("poLi_arrayList.get(99) = " + poLi_arrayList.get(99));

        System.out.println("poLi_arrayList.size() = " + poLi_arrayList.size());
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < poLi_arrayList.size(); i++)
            System.out.println("poLi_arrayList.get(i) = " + poLi_arrayList.get(i));

        for (Integer i : poLi_arrayList) System.out.println("i = " + i);
        System.out.println("-----------------------------------------------------------------------------------------");

        poLi_arrayList.clear();
        for (int i = 0; i < 10; i++) poLi_arrayList.add(i);
        System.out.println("poLi_arrayList = " + poLi_arrayList);
        poLi_arrayList.remove(5);
        System.out.println("poLi_arrayList = " + poLi_arrayList);
        System.out.println("-----------------------------------------------------------------------------------------");

        List<Integer> poLi_List = new ArrayList<>(); // По конвенции писать List, а не ArrayList.
        for (int i = 0; i < 10; i++) poLi_List.add(i);
        System.out.println("poLi_List = " + poLi_List);
        poLi_List = new LinkedList<>(poLi_List); // Преобразование ArrayList в LinkedList, можно сделать т.к. List<Integer>, а не только ArrayList<Integer>.
        System.out.println("poLi_List = " + poLi_List);
    }
}
