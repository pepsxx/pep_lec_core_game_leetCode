package Pp_T02.Pp_L08_Hashcode_Equals_1.Test1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pc_Test {

    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Методы hashcode и equals
    public static void main(String[] args) {
        Map<Integer, String> poMa_map = new HashMap<>();
        Set<Integer> poSe_set = new HashSet<>();
        poMa_map.put(1, "Один");
        poMa_map.put(1, "Другое значение");

        poSe_set.add(1);
        poSe_set.add(1);

        System.out.println("poMa_map = " + poMa_map);
        System.out.println("poSe_set = " + poSe_set);
        System.out.println("1--------------------------------------------------");

        Pc_Person po_person1 = new Pc_Person(1, "Mike");
        Pc_Person po_person2 = new Pc_Person(2, "Katy");
        Pc_Person po_person3 = new Pc_Person(1, "Mike");


        Map<Pc_Person, String> poMa_map2 = new HashMap<>();
        Set<Pc_Person> poSe_set2 = new HashSet<>();

        poMa_map2.put(po_person1, "123");
        poMa_map2.put(po_person2, "123");
        poMa_map2.put(po_person3, "123");

        poSe_set2.add(po_person1);
        poSe_set2.add(po_person2);
        poSe_set2.add(po_person3);

        System.out.println("poMa_map2 = " + poMa_map2);
        System.out.println("poSe_set2 = " + poSe_set2);
        System.out.println("2--------------------------------------------------");


        Map<Pc_Person, String> poMa_map3 = new HashMap<>();
        Set<String> poSe_set3 = new HashSet<>();

        poSe_set3.add("Hello");
        poSe_set3.add("Hello");

        System.out.println("poMa_map3 = " + poMa_map3);
        System.out.println("poSe_set3 = " + poSe_set3);
        System.out.println("3--------------------------------------------------");

        StringBuilder pmSb_x = new StringBuilder("Hello");
        StringBuilder pmSb_y = new StringBuilder("Hello");
        System.out.println("pmSt_x.equals(pmSt_y) = " + pmSb_x.equals(pmSb_y));   // Сравнивает ссылки на объект.
        System.out.println("pmSt_x.hashCode() = " + pmSb_x.hashCode());
        System.out.println("pmSt_y.hashCode() = " + pmSb_y.hashCode());
        System.out.println("4--------------------------------------------------");


    }
}

class Pc_Person {
    private int pgi_id;
    private String pgSt_name;

    public Pc_Person(int pgi_id, String pgSt_name) {
        this.pgi_id = pgi_id;
        this.pgSt_name = pgSt_name;
    }

    @Override
    public String toString() {
        return "Pc_Prerson{" +
                "pgi_id=" + pgi_id +
                ", pgSt_name='" + pgSt_name + '\'' +
                '}';
    }

}
