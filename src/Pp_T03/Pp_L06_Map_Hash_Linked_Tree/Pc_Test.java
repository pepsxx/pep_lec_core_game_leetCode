package Pp_T03.Pp_L06_Map_Hash_Linked_Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: LinkedHashMap и TreeMap.
    public static void main(String[] args) {

        // HashMap
        Map<String, String> poMa_translation = new HashMap<>(); // Не забывать скобки в конце <>.
        poMa_translation.put("Кошка", "Cat");
        poMa_translation.put("Собака", "Dog");
        poMa_translation.put("Слон", "Elephant");

        for (Map.Entry<String, String> poEn_entry : poMa_translation.entrySet()){
            System.out.println(poEn_entry.getKey()+": " + poEn_entry.getValue());
        }
        System.out.println("--------------------------------------------------");

        Map<Integer, String> poMa_hashMap = new HashMap<>();             // Внутри не гарантируется ни какого порядка.
        Map<Integer, String> poMa_linkedHashMap = new LinkedHashMap<>(); // Внутри гарантируется порядок на основе порядка добавления.
        Map<Integer, String> poMa_treeMap = new TreeMap<>();             // Внутри гарантируется порядок на основе сортировке по ключу. (Естественный порядок).


        System.out.println("--------------------------------------------------");
        pf_testMap(poMa_hashMap);
        System.out.println("--------------------------------------------------");
        pf_testMap(poMa_linkedHashMap);
        System.out.println("--------------------------------------------------");
        pf_testMap(poMa_treeMap);
        System.out.println("--------------------------------------------------");

    }
    public static void pf_testMap(Map<Integer, String> poMa_map){
        poMa_map.put(39, "Bob");
        poMa_map.put(12, "Mike");
        poMa_map.put(79, "Tom");
        poMa_map.put(0, "Tim");
        poMa_map.put(1500, "Lewis");
        poMa_map.put(7, "Bob");

        for(Map.Entry<Integer, String> poEn_entry : poMa_map.entrySet()){
            System.out.println(poEn_entry.getKey() + ": " + poEn_entry.getValue());
        }
    }
}
