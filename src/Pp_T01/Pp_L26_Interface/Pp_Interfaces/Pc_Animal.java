// Пакеты нужны для решения коллизий в названиях классов.
// Пакеты нужны для логической группировки классов.
package Pp_T01.Pp_L26_Interface.Pp_Interfaces;

public class Pc_Animal implements Pi_Info {
    public int pg_id;

    public Pc_Animal(int pg_id) {
        this.pg_id = pg_id;
    }

    public void pf_sleep() {
        System.out.println("I am sleeping");
    }

    @Override
    public void pf_showInfo() {
        System.out.println("Id is "+ this.pg_id);
    }
}
