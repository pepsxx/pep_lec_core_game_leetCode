package Pp_T03_AliAdv.Pp_L43_Reflection_2;

@Pa_Author(pgSt_name = "Neil", pgi_dateOfCreation = 2019)
public class Pc_Person {
    private int pgi_id;
    private String pgSt_name;

    public Pc_Person(){
        this.pgi_id = -1;
        this.pgSt_name = "No name";
    }

    public void pf_sayHello () {
        System.out.println("Person with id: " + pgi_id + " and name: " + pgSt_name + " say hello!");
    }

    public int getPgi_id() {
        return pgi_id;
    }

    public void setPgi_id(int pgi_id) {
        this.pgi_id = pgi_id;
    }

    public String getPgSt_name() {
        return pgSt_name;
    }

    public void setPgSt_name(String pgSt_name) {
        this.pgSt_name = pgSt_name;
    }

    @Override
    public String toString() {
        return "Pc_Person{" +
                "pgi_id=" + pgi_id +
                ", pgSt_name='" + pgSt_name + '\'' +
                '}';
    }
}
