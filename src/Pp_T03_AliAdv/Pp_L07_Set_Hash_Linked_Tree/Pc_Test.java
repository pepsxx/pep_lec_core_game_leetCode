package Pp_T03_AliAdv.Pp_L07_Set_Hash_Linked_Tree;

import java.util.*;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Множества Set.
    public static void main(String[] args) {
        // Set - Только уникальные объекты.
        Set<String> poSe_hashSet = new HashSet<>();            // Внутри не гарантируется ни какого порядка.
        Set<String> poSe_inkedHashSet = new LinkedHashSet<>(); // Внутри гарантируется порядок на основе порядка добавления.
        Set<String> poSe_treeSet = new TreeSet<>();            // Внутри гарантируется порядок на основе сортировки. (Естественный порядок).

        System.out.println("--------------------------------------------------");
        pf_testSet(poSe_hashSet);
        System.out.println("--------------------------------------------------");
        pf_testSet(poSe_inkedHashSet);
        System.out.println("--------------------------------------------------");
        pf_testSet(poSe_treeSet);
        System.out.println("--------------------------------------------------");

        System.out.println("poSe_hashSet.contains(\"Tom\") = " + poSe_hashSet.contains("Tom"));   // contains - Проверка существования.
        System.out.println("poSe_hashSet.contains(\"Alex\") = " + poSe_hashSet.contains("Alex")); // contains - Проверка существования.
        System.out.println("--------------------------------------------------");

        System.out.println("poSe_hashSet.isEmpty() = " + poSe_hashSet.isEmpty()); // isEmpty - Проверка на пустоту.
        System.out.println("--------------------------------------------------");

        Set<Integer> poSe_set1 = new HashSet<>();
        poSe_set1.add(0);
        poSe_set1.add(1);
        poSe_set1.add(2);
        poSe_set1.add(3);
        poSe_set1.add(4);
        poSe_set1.add(5);

        Set<Integer> poSe_set2 = new HashSet<>();
        poSe_set2.add(2);
        poSe_set2.add(3);
        poSe_set2.add(4);
        poSe_set2.add(5);
        poSe_set2.add(6);
        poSe_set2.add(7);

        System.out.println("poSe_set1 = " + poSe_set1);
        System.out.println("poSe_set2 = " + poSe_set2);
        System.out.println("--------------------------------------------------");

        //union - объединение множеств.
        System.out.println("union - объединение множеств.");
        Set<Integer> poSe_union = new HashSet<>(poSe_set1);
        poSe_union.addAll(poSe_set2);
        System.out.println("poSe_union = " + poSe_union);
        System.out.println("--------------------------------------------------");

        //intersection - Пересечение множеств.
        System.out.println("intersection - Пересечение множеств.");
        Set<Integer> poSe_intersection = new HashSet<>(poSe_set1);
        poSe_intersection.retainAll(poSe_set2);
        System.out.println("poSe_intersection = " + poSe_intersection);
        System.out.println("--------------------------------------------------");

        //difference - Пересечение множеств.
        System.out.println("difference - Пересечение множеств.");
        Set<Integer> poSe_difference = new HashSet<>(poSe_set1);
        poSe_difference.removeAll(poSe_set2);
        System.out.println("poSe_difference = " + poSe_difference);
        System.out.println("--------------------------------------------------");

    }






    public static void pf_testSet(Set<String> poSe_map) {
        poSe_map.add("Mike");
        poSe_map.add("Katy");
        poSe_map.add("Tom");
        poSe_map.add("George");
        poSe_map.add("Donald");
        poSe_map.add("Tom"); // Дубликат просто не добавляется.
        poSe_map.add("Tom"); // Дубликат просто не добавляется.

        for (String pmSt_name : poSe_map) {
            System.out.println("poSe_map = " + pmSt_name);
        }

    }
}
