package Pp_T01.Pp_L15_ClassesAndObjects_Method_Void;

public class Pc_ClassesAndObjects {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=ayUbY2sB-IU
    //Java для начинающих. Урок 15: Методы в Java.
    public static void main(String[] args) {
        Pc_Person po_Person1 = new Pc_Person();
        po_Person1.pgSt_name = "Роман";
        po_Person1.pgi_age = 50;
        po_Person1.pf_seyHello();
        po_Person1.pf_speak();

        Pc_Person po_Person2 = new Pc_Person();
        po_Person2.pgSt_name = "Вова";
        po_Person2.pgi_age = 20;
        po_Person2.pf_speak();
    }
}

class Pc_Person {
    String pgSt_name;
    int pgi_age;

    void pf_speak() {
        for (int pmi_i = 0; pmi_i < 3; pmi_i++) {
            System.out.println("Меня зовут " + pgSt_name + ", мне " + pgi_age + " лет.");
        }
        System.out.println();
    }

    void pf_seyHello() {
        System.out.println("Привет!");
    }
}

