package Pp_T01.Pp_L35_Class_Anonymous_Inner.Pck1;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=ndnubpPzkNE
    //Java для начинающих. Урок 35: Анонимные классы.
    public static void main(String[] args) {
        Pc_Animal po_animal = new Pc_Animal();
        po_animal.pf_eat();

        Pc_OtherAnimal po_otherAnimal = new Pc_OtherAnimal();
        po_otherAnimal.pf_eat();

        System.out.println("--------------------------------------------------");

        Pc_Animal po_animal2 = new Pc_Animal() {
            public void pf_eat() {
                System.out.println("Other Anonim Animal is eating...");
            }
        };

        po_animal2.pf_eat();
    }
}

class Pc_Animal {
    public void pf_eat() {
        System.out.println("I am eating...");
    }
}

class Pc_OtherAnimal extends Pc_Animal {
    public void pf_eat() {
        System.out.println("Other Animal is eating...");
    }
}