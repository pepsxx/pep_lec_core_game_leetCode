package Pp_T01.Pp_L19_Keyword_This;

public class Pc_Lesson19 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=sPPaDe_5fcQ
    //Java для начинающих. Урок 19: Ключевое слово this.
    public static void main(String[] args) {
        Pc_Humen po_human1 = new Pc_Humen();
        po_human1.set_pgSt_name("Tom");
        po_human1.set_pgi_age(18);
        po_human1.get_Info();

        Pc_Humen po_human2 = new Pc_Humen();
        po_human2.set_pgSt_name("Bob");
        po_human2.set_pgi_age(25);
        po_human2.get_Info();
    }
}

class Pc_Humen {
    String pgSt_name;
    int pgi_age;

    public void set_pgSt_name(String pgSt_name) {
        this.pgSt_name = pgSt_name;
    }

    public void set_pgi_age(int pgi_age) {
        this.pgi_age = pgi_age;
    }

    public String get_pgSt_name() {
        return pgSt_name;
    }

    public int get_pgi_age() {
        return pgi_age;
    }

    public void get_Info() {
        System.out.println(pgSt_name + ", " + pgi_age);
    }
}


