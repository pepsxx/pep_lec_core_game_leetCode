package Pp_T02.Pp_L01;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=iaAvvhlDJqA
    //Ответы на вопросы 1: Аннотация Override.
    public static void main(String[] args) {
        Pc_Animal po_animal1 = new Pc_Animal();
        Pc_Dog po_dog1 = new Pc_Dog();
        po_animal1.pf_eat();
        po_dog1.pf_eat();
        po_animal1.pf_sleep();
        po_dog1.pf_sleep();
        po_dog1.pf_bark();
    }
}
