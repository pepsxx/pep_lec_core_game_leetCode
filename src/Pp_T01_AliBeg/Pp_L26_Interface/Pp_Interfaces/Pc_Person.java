// Пакеты нужны для решения коллизий в названиях классов.
// Пакеты нужны для логической группировки классов.
package Pp_T01_AliBeg.Pp_L26_Interface.Pp_Interfaces;

//implements Pi_Interfaces - Означает что клас  обязан и меть все методы из интерфейса Pi_Interfaces
public class Pc_Person implements Pi_Info {
    public String pgSt_name;

    public Pc_Person(String pgSt_name) {
        this.pgSt_name = pgSt_name;
    }

    public void pf_sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void pf_showInfo() {
        System.out.println("Name is "+ this.pgSt_name);
    }
}
