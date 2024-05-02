package Pp_T01_AliBeg.Pp_L18_ClassesAndObjects_Method_Set_Get;

public class Pc_ClassesAndObjects {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=zf3lDojNxlA
    //Java для начинающих. Урок 18: Инкапсуляция. Сеттеры и геттеры.
    public static void main(String[] args) {
        Pc_Person po_Person1 = new Pc_Person();
        po_Person1.set_pgSt_name("");
        po_Person1.set_pgi_age(-3);
        System.out.println();
        System.out.println("Выводим значение в main методе: " + po_Person1.get_pgSt_name());
        System.out.println("Выводим значение в main методе: " + po_Person1.get_pgi_age());
    }
}

class Pc_Person {
    private String pgSt_name;
    private int pgi_age;

    void pf_seyHello() {
        System.out.println("Привет!");
    }

    void set_pgSt_name(String pmSt_userName) {
        if (pmSt_userName.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            pgSt_name = pmSt_userName;
        }
    }

    String get_pgSt_name() {
        return pgSt_name;
    }

    void set_pgi_age(int pmi_userAge) {
        if (pmi_userAge < 0) {
            System.out.println("Возраст должен быть положительным.");
        } else {
            pgi_age = pmi_userAge;
        }
    }

    int get_pgi_age() {
        return pgi_age;
    }
}