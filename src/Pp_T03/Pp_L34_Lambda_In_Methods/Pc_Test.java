package Pp_T03.Pp_L34_Lambda_In_Methods;

import java.util.*;
import java.util.stream.Collectors;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Лямбда - выражения часть II.
    public static void main(String[] args) {
        int[] pmMi_arr1 = new int[10];
        List<Integer> poLi_list1 = new ArrayList<>();

        pf_fillArr(pmMi_arr1);
        pf_fillList(poLi_list1);

        System.out.println("poLi_list1 =                 " + poLi_list1);
        System.out.println("Arrays.toString(pmMi_arr1) = " + Arrays.toString(pmMi_arr1));
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            pmMi_arr1[i] *= 2;
            poLi_list1.set(i, (poLi_list1.get(i) * 2));
        }

        System.out.println("poLi_list1 =                 " + poLi_list1);
        System.out.println("Arrays.toString(pmMi_arr1) = " + Arrays.toString(pmMi_arr1));
        System.out.println("--------------------------------------------------");

        // map method
        pmMi_arr1 = Arrays.stream(pmMi_arr1).map(a -> a * 2).toArray();
        poLi_list1 = poLi_list1.stream().map(l -> l * 2).collect(Collectors.toList());
        //poLi_list1 = poLi_list1.stream().map(l -> l *2).toList();

        System.out.println("poLi_list1 =                 " + poLi_list1);
        System.out.println("Arrays.toString(pmMi_arr1) = " + Arrays.toString(pmMi_arr1));
        System.out.println("--------------------------------------------------");

        pmMi_arr1 = Arrays.stream(pmMi_arr1).map(a -> 3).toArray();
        System.out.println("Arrays.toString(pmMi_arr1) = " + Arrays.toString(pmMi_arr1));
        pmMi_arr1 = Arrays.stream(pmMi_arr1).map(a -> a + 1).toArray();
        System.out.println("Arrays.toString(pmMi_arr1) = " + Arrays.toString(pmMi_arr1));
        System.out.println("--------------------------------------------------");

        // filter method
        int[] pmMi_arr2 = new int[10];
        List<Integer> poLi_list2 = new ArrayList<>();

        pf_fillArr(pmMi_arr2);
        pf_fillList(poLi_list2);

        System.out.println("poLi_list2 =                 " + poLi_list2);
        System.out.println("Arrays.toString(pmMi_arr2) = " + Arrays.toString(pmMi_arr2));
        System.out.println("--------------------------------------------------");

        pmMi_arr2 = Arrays.stream(pmMi_arr2).filter(a -> a % 2 == 0).toArray();
        poLi_list2 = poLi_list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println("poLi_list2 =                 " + poLi_list2);
        System.out.println("Arrays.toString(pmMi_arr2) = " + Arrays.toString(pmMi_arr2));
        System.out.println("--------------------------------------------------");

        // forEach method
        int[] pmMi_arr3 = new int[10];
        List<Integer> poLi_list3 = new ArrayList<>();

        pf_fillArr(pmMi_arr3);
        pf_fillList(poLi_list3);

        System.out.println("poLi_list3 =                 " + poLi_list3);
        System.out.println("Arrays.toString(pmMi_arr3) = " + Arrays.toString(pmMi_arr3));
        System.out.println("--------------------------------------------------");

        Arrays.stream(pmMi_arr3).forEach(System.out::print);
        System.out.println();
        poLi_list3.forEach(System.out::print);
        System.out.println();

        System.out.println("poLi_list3 =                 " + poLi_list3);
        System.out.println("Arrays.toString(pmMi_arr3) = " + Arrays.toString(pmMi_arr3));
        System.out.println("--------------------------------------------------");

        // reduce method
        int[] pmMi_arr4 = new int[10];
        List<Integer> poLi_list4 = new ArrayList<>();

        pf_fillArr(pmMi_arr4);
        pf_fillList(poLi_list4);

        System.out.println("poLi_list4 =                 " + poLi_list4);
        System.out.println("Arrays.toString(pmMi_arr4) = " + Arrays.toString(pmMi_arr4));
        System.out.println("--------------------------------------------------");

        int pmi_sum1 = Arrays.stream(pmMi_arr4).reduce((acc, b) -> acc + b).getAsInt();  // Начальное значение аккумулятора acc не задано. Значит acc = первому элементу, а начало идет со 2 итерации.
        int pmi_sum2 = Arrays.stream(pmMi_arr4).reduce(100, (acc, b) -> acc + b); // 100 - Начальное значение аккумулятора acc.
        int pmi_sum3 = poLi_list4.stream().reduce((acc, b) -> acc * b).get();

        System.out.println("pmi_sum1 = " + pmi_sum1);
        System.out.println("pmi_sum2 = " + pmi_sum2);
        System.out.println("pmi_sum3 = " + pmi_sum3);
        System.out.println("--------------------------------------------------");

        // map method
        int[] pmMi_arr5 = new int[10];
        pf_fillArr(pmMi_arr5);

        System.out.println("Arrays.toString(pmMi_arr5) = " + Arrays.toString(pmMi_arr5));
        pmMi_arr5 = Arrays.stream(pmMi_arr5).filter(a -> a % 2 != 0).map(a -> a * 2).toArray(); // Последовательный вызов.
        System.out.println("Arrays.toString(pmMi_arr5) = " + Arrays.toString(pmMi_arr5));
        System.out.println("--------------------------------------------------");

        Set<Integer> poSe_set = new HashSet<>();
        poSe_set.add(1);
        poSe_set.add(2);
        poSe_set.add(5);
        poSe_set = poSe_set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println("poSe_set = " + poSe_set);
        System.out.println("--------------------------------------------------");
    }

    private static void pf_fillList(List<Integer> poLi_list) {
        for (int i = 0; i < 10; i++) {
            poLi_list.add(i + 1);
        }
    }

    private static void pf_fillArr(int[] pmMi_arr) {
        for (int i = 0; i < 10; i++) {
            pmMi_arr[i] = i + 1;
        }
    }
}



