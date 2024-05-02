package Pp_T01_AliBeg.Pp_L42_Equals_String_Pool;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=m7vFGL-N9eY
    //Java для начинающих. Урок 42: Метод equals() и String Pool.
    public static void main(String[] args) {
        int pmi_x = 1;
        int pmi_y = 1;
        System.out.print("pmi_x == pmi_y:                    ");
        System.out.println(pmi_x == pmi_y);
        System.out.println("--------------------------------------------------");

        Pc_Animal po_animal1 = new Pc_Animal(1);
        Pc_Animal po_animal2 = new Pc_Animal(1);
        System.out.print("po_animal1 == po_animal2:          ");
        System.out.println(po_animal1 == po_animal2); // Сравнение не объектов, а ссылок на них.
        System.out.print("po_animal1.equals(po_animal2): ");
        System.out.println(po_animal1.equals(po_animal2));
        System.out.println("--------------------------------------------------");

        Pc_Animal po_animal11 = new Pc_Animal(0);
        Pc_Animal po_animal12 = po_animal11;
        System.out.print("po_animal11 == po_animal12:        ");
        System.out.println(po_animal11 == po_animal12); // Сравнение не объектов, а ссылок на них.
        System.out.println("--------------------------------------------------");

        String pmSt_string1 = "Hello"; // String Pool - Пул всех строк. Для экономии памяти одинаковые строки не создаются.
        String pmSt_string2 = "Hello"; // При таком типе создания pmSt_string2 получит ссылку на объект, как и pmSt_string1 т.к. обе "Hello"

        System.out.println("String pmSt_string1 = \"Hello\";");
        System.out.println("String pmSt_string2 = \"Hello\";");
        System.out.print("pmSt_string1 == pmSt_string2:      ");
        System.out.println(pmSt_string1 == pmSt_string2);
        System.out.print("pmSt_string1.equals(pmSt_string2): ");
        System.out.println(pmSt_string1.equals(pmSt_string2));
        System.out.println("--------------------------------------------------");

        String pmSt_string3 = new String("Hello");
        String pmSt_string4 = new String("Hello"); // при таком типе создания pmSt_string2 свою ссылку.

        System.out.println("String pmSt_string3 = new String(\"Hello\");");
        System.out.println("String pmSt_string4 = new String(\"Hello\");");
        System.out.print("pmSt_string3 == pmSt_string4:      ");
        System.out.println(pmSt_string3 == pmSt_string4);
        System.out.print("pmSt_string3.equals(pmSt_string4): ");
        System.out.println(pmSt_string3.equals(pmSt_string4));
        System.out.println("--------------------------------------------------");


    }
}

class Pc_Animal {
    private int pgi_id;

    public Pc_Animal(int pgi_id) {
        this.pgi_id = pgi_id;
    }

    public boolean equals(Object obj) { // Если требуется сравнивать объекты, то принято переопределять метод equals.
        Pc_Animal po_otherAnimal = (Pc_Animal) obj;
        return this.pgi_id == po_otherAnimal.pgi_id;
    }
}
