package Pp_T01_AliBeg.Pp_L47_Serializable_3;

import java.io.Serial;
import java.io.Serializable;

public class Pc_Person implements Serializable {
    // File -> Settings
    // Editor -> Inspections
    // JVM Languages -> Test frameworks
    // Serializable class without 'serialVersionUID'
    @Serial
    private static final long serialVersionUID = 6354531790465963925L; // readObject() не сработает если serialVersionUID будут разные.
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=nr4_JRKCGBU
    //Java для начинающих. Урок 47: Сериализация (часть 3). Transient, serialVersionUID.
    private int pgi_id;
    private transient String pgSt_name; // pgSt_name не попадет в Serializable

    public Pc_Person(int pgi_id, String pgSt_name) {
        this.pgi_id = pgi_id;
        this.pgSt_name = pgSt_name;
    }

    public int getPgi_id() {
        return pgi_id;
    }

    public String getPgSt_name() {
        return pgSt_name;
    }

    @Override
    public String toString() {
        return pgi_id + " " + pgSt_name;
    }
}
