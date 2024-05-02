package Pp_T01_AliBeg.Pp_L29_Polymorphism;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=c8eGIPF-o3Q
    //Java для начинающих. Урок 29: Полиморфизм.
    // Полиморфизм - это способность метода обрабатывать разные данные.
    public static void main(String[] args) {
        Pc_Animal po_animal1 = new Pc_Animal();
        Pc_Dog po_dog1 = new Pc_Dog();
        po_animal1.pf_eat();
        po_dog1.pf_eat();
        System.out.println("--------------------------------------------------");
        System.out.println();


        Pc_Animal po_animal2 = new Pc_Dog(); // Позене связывание. Объект "Родительского" создан с записью "new" "Дочернего" класса.
        //po_animal2.pf_bark(); Нет доступа к методу "Дочернего" класса т.к., объект "Родительского" класса.
        po_animal2.pf_eat(); // Если у "Дочернего" класса будет такой же метод как и у "Родительского" класса,
                             // то запустится метод из "Дочернего" класса, несмотря на то что объект "Родительского" класса.
        System.out.println();

        Pc_Dog po_dog2 = new Pc_Dog();
        po_dog2.pf_eat();
        po_dog2.pf_bark();
        System.out.println("--------------------------------------------------");
        System.out.println();


        Pc_Animal po_animal = new Pc_Animal();
        Pc_Dog po_dog = new Pc_Dog();
        Pc_Cat po_cat = new Pc_Cat();

        pf_test(po_animal);
        pf_test(po_dog);
        pf_test(po_cat);
        System.out.println("--------------------------------------------------");
        System.out.println();


        Pc_Animal po_animal_1 = new Pc_Animal();
        Pc_Animal po_animal_2 = new Pc_Dog();
        Pc_Animal po_animal_3 = new Pc_Cat();

        pf_test(po_animal_1);
        pf_test(po_animal_2);
        pf_test(po_animal_3);
    }
    public static void pf_test(Pc_Animal pm_animal){
        pm_animal.pf_eat();
    }
}
