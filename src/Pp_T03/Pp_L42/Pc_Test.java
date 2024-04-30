package Pp_T03.Pp_L42;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Рефлексия (Java Reflection API). Часть I.
    public static void main(String[] args) {
        System.out.println("1502");

        Map<String, Integer> map = new HashMap<>() {
            {
                put("ddd", 1);
            }

            @Override
            public Integer put(String key, Integer value) {
                System.out.println(key + "fhfhfh " + value);
                return super.put(key, value);
            }
        };
        Integer  aaa = map.put("sded",3);
        System.out.println(map);

        Integer put = map.put("ddd", 2);

    }
}



