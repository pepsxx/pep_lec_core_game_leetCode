package Pp_T01.Pp_L24_Object_ToString;

public class Pc_Lesson24 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=KEQ043yT3F4
    //Java для начинающих. Урок 24: Класс Object и метод toString().
    public static void main(String[] args) {
        String pmSt_string = "Hello";
        System.out.println(pmSt_string);

        Pc_Humen po_h1 = new Pc_Humen("Bob", 40);
        // На самом деле в print всегда выполняется метод toString() - Унаследован от предка Objects.
        System.out.println(po_h1);
        System.out.println(po_h1.toString());
    }
}

class Pc_Humen {
    private String pgSt_name;
    private int pgi_age;


    public Pc_Humen(String pgSt_name, int pgi_age) {
        this.pgSt_name = pgSt_name;
        this.pgi_age = pgi_age;
    }

    // Таким образом можно переопределить унаследованный метод.
    public String toString() {
        return pgSt_name + " " + pgi_age;
    }
}


