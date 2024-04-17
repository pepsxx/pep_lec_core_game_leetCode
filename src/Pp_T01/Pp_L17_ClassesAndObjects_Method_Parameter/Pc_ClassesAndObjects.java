package Pp_T01.Pp_L17_ClassesAndObjects_Method_Parameter;

public class Pc_ClassesAndObjects {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=J8ZLRvOO6vk
    //Java для начинающих. Урок 17: Параметры метода.
    public static void main(String[] args) {
        Pc_Person po_Person1 = new Pc_Person();
        po_Person1.pf_setNameAndAge("Роман", 50);
        int pmi_year1 = po_Person1.pfi_calculateYearsToRetiremen();

        Pc_Person po_Person2 = new Pc_Person();
        String pmSt_s1 = "Вова";
        int pmi_i1 = 20;
        po_Person2.pf_setNameAndAge(pmSt_s1, pmi_i1);
        int pmi_year2 = po_Person2.pfi_calculateYearsToRetiremen();

        po_Person1.pf_speak();
        po_Person2.pf_speak();
    }
}

class Pc_Person {
    String pgSt_name;
    int pgi_age;

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

    void pf_setNameAndAge(String pmSt_username, int pmi_userage) {
        pgSt_name = pmSt_username;
        pgi_age = pmi_userage;
    }
}