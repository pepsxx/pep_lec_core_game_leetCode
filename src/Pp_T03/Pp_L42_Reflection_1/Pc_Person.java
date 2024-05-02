package Pp_T03.Pp_L42_Reflection_1;
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
}
