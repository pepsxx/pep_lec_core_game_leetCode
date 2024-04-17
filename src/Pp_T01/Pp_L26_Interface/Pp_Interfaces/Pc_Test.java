// Пакеты нужны для решения коллизий в названиях классов.
// Пакеты нужны для логической группировки классов.
package Pp_T01.Pp_L26_Interface.Pp_Interfaces;

public class Pc_Test {
    public static void main(String[] args) {
        Pc_Animal po_animal1 = new Pc_Animal(1);
        Pc_Person po_person1 = new Pc_Person("Bob");

        po_animal1.pf_sleep();
        po_person1.pf_sayHello();

        po_animal1.pf_showInfo();
        po_person1.pf_showInfo();

        Pi_Info po_info1 = new Pc_Animal(2);
        Pi_Info po_info2 = new Pc_Person("Tom");

        // У объектов интерфейса есть только методы задекламированные в интерфейсе.
        po_info1.pf_showInfo();
        po_info2.pf_showInfo();

        pf_outputInfo(po_info1);
        pf_outputInfo(po_info2);

        Pc_Animal po_animal2 = new Pc_Animal(3);
        Pc_Person po_person2 = new Pc_Person("Mac");

        pf_outputInfo(po_animal2);
        pf_outputInfo(po_person2);
    }

    public static void pf_outputInfo(Pi_Info po_Info) {
        po_Info.pf_showInfo();
    }
}
