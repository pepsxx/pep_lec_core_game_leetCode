package Pp_T01_AliBeg.Pp_L34_Generics_Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=Er_cj823ZTM
    //Java для начинающих. Урок 34: Wildcards (Generics).
    public static void main(String[] args) {
        List<Pc_Animal> poLi_ListOfAnimal = new ArrayList<>();
        poLi_ListOfAnimal.add(new Pc_Animal(1));
        poLi_ListOfAnimal.add(new Pc_Animal(2));

        List<Pc_Dog> poLi_ListOfDog = new ArrayList<>();
        poLi_ListOfDog.add(new Pc_Dog());
        poLi_ListOfDog.add(new Pc_Dog());

        pf_test(poLi_ListOfAnimal);

        System.out.println("--------------------------------------------------");

        pf_test2(poLi_ListOfAnimal);
        pf_test2(poLi_ListOfDog);
    }

    public static void pf_test(List<Pc_Animal> poLi_list) { // Можно использовать объекты только класса Pc_Animal.
        for (Pc_Animal po_Animal : poLi_list) {
            System.out.println("po_Animal = " + po_Animal);
        }
    }

    // Wildcards List<? extends Pc_Animal>
    public static void pf_test2(List<? extends Pc_Animal> poLi_list) {// Можно использовать объекты класса Pc_Animal и его extends - дочерних. Если надо родительские, то - super.
        for (Pc_Animal po_Animal : poLi_list) {
            System.out.println("extends po_Animal = " + po_Animal);
            po_Animal.pf_eat();
        }
    }
}
