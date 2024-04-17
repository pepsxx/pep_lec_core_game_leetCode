package Pp_T01.Pp_L21_Keyword_Static;

public class Pc_Lesson21 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=GZzVfeY7yEM
    //Java для начинающих. Урок 21: Ключевое слово static.
    public static void main(String[] args) {
        Pc_Humen.get_psSt_discription();


        Pc_Humen po_h1 = new Pc_Humen("Bob", 40);
        System.out.println("1----------");
        po_h1.pf_printNumberOfPeople();

        Pc_Humen po_h2 = new Pc_Humen("Tom", 30);
        System.out.println("2----------");
        po_h1.pf_printNumberOfPeople();
        po_h2.pf_printNumberOfPeople();

        Pc_Humen po_h3 = new Pc_Humen("Rob", 50);
        System.out.println("3----------");
        po_h1.pf_printNumberOfPeople();
        po_h2.pf_printNumberOfPeople();
        po_h3.pf_printNumberOfPeople();

        System.out.println("4----------");
        Pc_Humen.psSt_discription = "Nice";
        po_h1.get_AllField();
        po_h2.get_AllField();

        System.out.println("5----------");
        Pc_Humen.psSt_discription = "Bad";
        po_h1.get_AllField();
        po_h2.get_AllField();

        System.out.println("6----------");
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.PI);
    }
}

class Pc_Humen {
    String pgSt_name;
    int pgi_age;
    private static int psi_countPiople;
    public static String psSt_discription;


    public Pc_Humen() {
        this("Человек", 0);

    }

    public Pc_Humen(String pgSt_name, int pgi_age) {
        this.pgSt_name = pgSt_name;
        this.pgi_age = pgi_age;
        psi_countPiople++;
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

    public static void get_psSt_discription() {
        System.out.println(psSt_discription);
    }

    public void get_AllField() {
        System.out.println(pgSt_name + " " + pgi_age + " " + psSt_discription);
    }

    public void pf_printNumberOfPeople() {
        System.out.println("Number Of People is "+ psi_countPiople);
    }
}

