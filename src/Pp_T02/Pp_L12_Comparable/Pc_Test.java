package Pp_T02.Pp_L12_Comparable;

import java.util.*;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Интерфейс Comparable.
    public static void main(String[] args) {
        List<Pc_Person> poLi_peopleList = new ArrayList<>();
        Set<Pc_Person> poSe_peopleSet = new TreeSet<>();
        pf_addElements(poLi_peopleList);
        pf_addElements(poSe_peopleSet);

        System.out.println("poLi_peopleList = " + poLi_peopleList);
        System.out.println("poSe_peopleSet = " + poSe_peopleSet);
        System.out.println("--------------------------------------------------");

        Collections.sort(poLi_peopleList);

        System.out.println("poLi_peopleList = " + poLi_peopleList);
        System.out.println("poSe_peopleSet = " + poSe_peopleSet);
        System.out.println("--------------------------------------------------");
    }

    private static void pf_addElements(Collection po_collection) {
        po_collection.add(new Pc_Person(3, "Katy"));
        po_collection.add(new Pc_Person(4, "George"));
        po_collection.add(new Pc_Person(2, "To"));
        po_collection.add(new Pc_Person(1, "Bob"));
    }
}

class Pc_Person implements Comparable<Pc_Person> {
    private int pgi_id;
    private String pgSt_name;

    public Pc_Person(int pgi_id, String pgSt_name) {
        this.pgi_id = pgi_id;
        this.pgSt_name = pgSt_name;
    }

    public String toString() {
        return "Pc_Prerson{" +
                "pgi_id=" + pgi_id +
                ", pgSt_name='" + pgSt_name + '\'' +
                '}';
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

    public int getPgi_id() {
        return pgi_id;
    }

    public String getPgSt_name() {
        return pgSt_name;
    }

    @Override
    public int compareTo(Pc_Person o) {
        if (this.getPgSt_name().length() > o.getPgSt_name().length()) return 1;
        else if (this.getPgSt_name().length() < o.getPgSt_name().length()) return -1;
        else return 0;
    }
}
