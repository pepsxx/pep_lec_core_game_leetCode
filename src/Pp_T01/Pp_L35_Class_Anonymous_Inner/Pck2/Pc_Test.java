package Pp_T01.Pp_L35_Class_Anonymous_Inner.Pck2;

interface Pi_AbleToEat {
    public void pf_eat();
}

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=ndnubpPzkNE
    //Java для начинающих. Урок 35: Анонимные классы.
    public static void main(String[] args) {
        Pi_AbleToEat po_ableToEat = new Pc_Animal();
        po_ableToEat.pf_eat();

    }
}

class Pc_Animal implements Pi_AbleToEat {
    @Override
    public void pf_eat() {
        System.out.println("Pck2");
    }
}

