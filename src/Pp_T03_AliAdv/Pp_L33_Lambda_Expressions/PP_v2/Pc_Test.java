package Pp_T03_AliAdv.Pp_L33_Lambda_Expressions.PP_v2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Лямбда - выражения часть I.
    public static void main(String[] args) {
        List<String> poLi_list = new ArrayList<>();
        poLi_list.add("Hello");
        poLi_list.add("Goodbye");
        poLi_list.add("a");
        poLi_list.add("ab");
        System.out.println("poLi_list.toString() = " + poLi_list.toString());

        poLi_list.sort((s1, s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        });
        System.out.println("poLi_list.toString() = " + poLi_list.toString());

        Comparator<String> po_comparator = (s1, s2) -> {
            if (s1.length() > s2.length()) return -1;
            else if (s1.length() < s2.length()) return 1;
            else return 0;
        };

        poLi_list.sort(po_comparator);
        System.out.println("poLi_list.toString() = " + poLi_list.toString());
    }
}