package Pp_T01.Pp_L25_Extends;

// Pp_T01.Pp_L25.Pc_T01L25_Dog extends Pp_T01.Pp_L25.Pc_T01L25_Animal - Значит что Pp_T01.Pp_L25.Pc_T01L25_Dog является подклассом Pp_T01.Pp_L25.Pc_T01L25_Animal
public class Pc_Dog extends Pc_Animal {
    public void pf_bark() {
        System.out.println("I am barking");
    }
    // Переопределение родительского метода.
    public void pf_eat() {
        System.out.println("Dog is eating");
    }
    public void pf_showName(){
        System.out.println(pg_name);
    }
}
