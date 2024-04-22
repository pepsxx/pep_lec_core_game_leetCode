package Pp_T02.Pp_L10_Map_HashMap_2;

import java.util.HashMap;
import java.util.Map;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: HashMap - Как устроен.
    public static void main(String[] args) {
        Map<String, Integer> poMa_map = new HashMap<>();

        poMa_map.put("Bobi", 25);
        poMa_map.put("Katy", 15);
        poMa_map.put("Bill", 40);

        System.out.println("poMa_map.get(\"Bobi\") = " + poMa_map.get("Bobi"));
        System.out.println("poMa_map.get(\"Katy\") = " + poMa_map.get("Katy"));
        System.out.println("poMa_map.get(\"Bill\") = " + poMa_map.get("Bill"));

    }
}
