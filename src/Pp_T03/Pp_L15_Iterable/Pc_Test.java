package Pp_T03.Pp_L15_Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Интерфейс Iterable.
    public static void main(String[] args) {
        List<Integer> poLi_list = new ArrayList<>();
        poLi_list.add(1);
        poLi_list.add(2);
        poLi_list.add(3);

        //до Java 5.
        Iterator<Integer> po_iterator = poLi_list.iterator();
        int pmi_idx = 0;
        while (po_iterator.hasNext()) {
            System.out.println("po_iterator.next() = " + po_iterator.next());
            if (pmi_idx == 1) po_iterator.remove(); // Можно удалять.
            pmi_idx++;
        }
        System.out.println("--------------------------------------------------");

        // с Java 5.
        for (int pmi_x : poLi_list) {
            // poLi_list.remove(1); // будет ошибка т.к. нельзя менять poLi_list во время for ich
            System.out.println("pmi_x = " + pmi_x);
        }
        System.out.println("--------------------------------------------------");

        // Iterable - То по чему можно проходиться.
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Iterable.html
    }
}
