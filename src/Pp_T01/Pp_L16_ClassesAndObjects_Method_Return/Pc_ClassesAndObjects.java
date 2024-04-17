package Pp_T01.Pp_L16_ClassesAndObjects_Method_Return;

public class Pc_ClassesAndObjects {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=wEewTdZEWPY
    //Java для начинающих. Урок 16: Тип возвращаемого значения метода.
    public static void main(String[] args) {
        Pc_Person po_Person1 = new Pc_Person();
        po_Person1.pgSt_name = "Роман";
        po_Person1.pgi_age = 50;
        po_Person1.pf_calculateYearsToRetiremen();
        int pmi_year1 = po_Person1.pfi_calculateYearsToRetiremen();
        System.out.println("Первому человеку " + pmi_year1 + " лет до пенсии.");

        Pc_Person po_Person2 = new Pc_Person();
        po_Person2.pgSt_name = "Вова";
        po_Person2.pgi_age = 20;
        po_Person2.pf_calculateYearsToRetiremen();
        int pmi_year2 = po_Person2.pfi_calculateYearsToRetiremen();
        System.out.println("Второму человеку " + pmi_year2 + " лет до пенсии.");
    }
}

class Pc_Person {
    String pgSt_name;
    int pgi_age;

    //void - не что (пустота)
    void pf_calculateYearsToRetiremen() {
        int pmi_years = 65 - pgi_age;
        System.out.println("Количество лет до пенсии: " + pmi_years + ".");
    }

    int pfi_calculateYearsToRetiremen() {
        int pmi_years = 65 - pgi_age;
        // После "return" сразу происходит выход из метода.
        return pmi_years;
    }

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