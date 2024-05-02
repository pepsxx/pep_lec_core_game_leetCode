package Pp_T01_AliBeg.Pp_L25_Extends;

public class Pc_Lesson25 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=28NP_V2yc60
    //Java для начинающих. Урок 25: Наследование.
    public static void main(String[] args) {
        Pc_Animal po_animal = new Pc_Animal();
        po_animal.pf_eat();
        po_animal.pf_sleep();

        Pc_Dog po_dog = new Pc_Dog();
        po_dog.pf_eat();
        po_dog.pf_sleep();
        po_dog.pf_bark();
        po_dog.pf_showName();
    }
}