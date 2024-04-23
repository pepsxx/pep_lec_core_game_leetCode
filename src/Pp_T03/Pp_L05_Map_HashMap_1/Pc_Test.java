package Pp_T03.Pp_L05_Map_HashMap_1;

import java.util.HashMap;
import java.util.Map;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: HashMap - Введение.
    public static void main(String[] args) {
        // Map - Отображение. (Словарь).
        // HashMap - Нет порядка для пар (Entry).
        // 1 -> [.. .. ..].
        // 2 -> [.. .. ..].
        Map<Integer, String> poMa_map = new HashMap<>(); // Не забывать скобки в конце <>.
        poMa_map.put(1, "Один");
        poMa_map.put(3, "Три");
        poMa_map.put(2, "Два");

        System.out.println("poMa_map = " + poMa_map); // Порядок вывода не гарантируется.

        poMa_map.put(3, "Другое значение ключа три");

        System.out.println("poMa_map = " + poMa_map);

        System.out.println("poMa_map.get(1) = " + poMa_map.get(1));
        System.out.println("poMa_map.get(9) = " + poMa_map.get(9));

        for (Map.Entry<Integer, String> poEn_entry : poMa_map.entrySet()) {
            System.out.println(poEn_entry.getKey() + ": " + poEn_entry.getValue());
        }
    }
}
