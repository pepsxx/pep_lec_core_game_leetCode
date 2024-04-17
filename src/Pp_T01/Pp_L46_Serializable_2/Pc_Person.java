package Pp_T01.Pp_L46_Serializable_2;

import java.io.Serializable;

public class Pc_Person implements Serializable {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=7QZ6oZ51o0U
    //Java для начинающих. Урок 46: Сериализация (часть 2). Сериализация массивов.
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
