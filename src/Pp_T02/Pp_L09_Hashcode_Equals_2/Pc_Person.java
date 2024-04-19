package Pp_T02.Pp_L09_Hashcode_Equals_2;

import java.util.Objects;

public class Pc_Person {
    private int pgi_id;
    private String pgSt_name;

    public Pc_Person(int pgi_id, String pgSt_name) {
        this.pgi_id = pgi_id;
        this.pgSt_name = pgSt_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pc_Person pcPerson = (Pc_Person) o;

        if (pgi_id != pcPerson.pgi_id) return false;
        return Objects.equals(pgSt_name, pcPerson.pgSt_name);
    }

    @Override
    public int hashCode() {
        int result = pgi_id;
        result = 31 * result + (pgSt_name != null ? pgSt_name.hashCode() : 0);
        return result;
    }
}