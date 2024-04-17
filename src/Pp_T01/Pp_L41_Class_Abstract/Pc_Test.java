package Pp_T01.Pp_L41_Class_Abstract;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=kY07wfP2JiA
    //Java для начинающих. Урок 41: Абстрактные классы.
    public static void main(String[] args) {
        Pc_Cat po_cat = new Pc_Cat();
        Pc_Dog po_dog = new Pc_Dog();
        //Pc_Animal po_animal = new Pc_Animal(); // Объект класса запрещено создавать т.к. этот клас абстрактный.
        po_dog.pf_makeSound();
        po_cat.pf_makeSound();
        po_dog.pf_eat();
        po_cat.pf_eat();

    }
}
