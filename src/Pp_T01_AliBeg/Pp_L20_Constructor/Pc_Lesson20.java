package Pp_T01_AliBeg.Pp_L20_Constructor;

public class Pc_Lesson20 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=Muytoo-x-KM
    //Java для начинающих. Урок 20: Конструкторы.
    public static void main(String[] args) {
        Pc_Humen po_human0 = new Pc_Humen();
        po_human0.get_Info();

        Pc_Humen po_human1 = new Pc_Humen();
        po_human1.set_pgSt_name("Bob");
        po_human1.set_pgi_age(11);
        po_human1.get_Info();

        Pc_Humen po_human2 = new Pc_Humen("Tom");
        po_human2.set_pgi_age(22);
        po_human2.get_Info();

        Pc_Humen po_human3 = new Pc_Humen("Kot", 33);
        po_human3.get_Info();
    }
}

class Pc_Humen {
    String pgSt_name;
    int pgi_age;

    // Конструктор без значения (без void, int,...)
    // Имя конструктора совпадает с именем класса.
    public Pc_Humen() {
        System.out.println("Привет из первого конструктора");
        this.pgSt_name = "Имя по умолчанию";
        this.pgi_age = 99;
    }

    public Pc_Humen(String pgSt_name) {
        System.out.println("Привет из второго конструктора");
        this.pgSt_name = pgSt_name;
    }

    public Pc_Humen(String pgSt_name, int pgi_age) {
        System.out.println("Привет из Третьего конструктора");
        this.pgSt_name = pgSt_name;
        this.pgi_age = pgi_age;
    }


    public void set_pgSt_name(String pgSt_name) {
        this.pgSt_name = pgSt_name;
    }

    public void set_pgi_age(int pgi_age) {
        this.pgi_age = pgi_age;
    }

    public void get_Info() {
        System.out.println(pgSt_name + ", " + pgi_age);
    }
}

