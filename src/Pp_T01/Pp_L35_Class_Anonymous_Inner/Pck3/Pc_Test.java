package Pp_T01.Pp_L35_Class_Anonymous_Inner.Pck3;

interface Pi_AbleToEat {
    public void pf_eat();
}

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=ndnubpPzkNE
    //Java для начинающих. Урок 35: Анонимные классы.
    public static void main(String[] args) {
        Pi_AbleToEat po_ableToEat = new Pi_AbleToEat() {
            @Override
            public void pf_eat() {
                System.out.println("Someone is eating...");
            }
        };

        po_ableToEat.pf_eat();

    }
}


