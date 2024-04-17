package Pp_T01.Pp_L14_ClassesAndObjects;

//Класс "public" может быть только один, и его имя должно совпадать с именем файла
public class Pc_ClassesAndObjects {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=uPK2FVz6qUs
    //Java для начинающих. Урок 14: Классы и объекты.
    //Программа стартует с метода "main"

    public static void main(String[] args) {
        Pc_Person po_Person1 = new Pc_Person();
        po_Person1.pgSt_name = "Роман";
        po_Person1.pgi_age = 50;
        System.out.println("Меня зовут " + po_Person1.pgSt_name + ", мне " + po_Person1.pgi_age + " лет.");

        Pc_Person po_Person2 = new Pc_Person();
        po_Person2.pgSt_name = "Вова";
        po_Person2.pgi_age = 20;
        System.out.println("Меня зовут " + po_Person2.pgSt_name + ", мне " + po_Person2.pgi_age + " лет.");
    }
}

class Pc_Person {
    String pgSt_name;
    int pgi_age;
}

class Pc_Test2 {
}
