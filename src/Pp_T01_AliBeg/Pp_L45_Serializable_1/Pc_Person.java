package Pp_T01_AliBeg.Pp_L45_Serializable_1;

import java.io.Serializable;

public class Pc_Person implements Serializable {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=dBcqizwOWLg
    //Java для начинающих. Урок 45: Сериализация (часть 1).
    private int pgi_id;
    private String pgSt_name;

    public Pc_Person(int pgi_id, String pgSt_name) {
        this.pgi_id = pgi_id;
        this.pgSt_name = pgSt_name;
    }

    public String getPgSt_name() {
        return pgSt_name;
    }

    public void setPgSt_name(String pgSt_name) {
        this.pgSt_name = pgSt_name;
    }

    @Override
    public String toString() {
        return pgi_id + " " + pgSt_name;
    }
}
