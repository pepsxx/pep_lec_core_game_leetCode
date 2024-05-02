package Pp_T01_AliBeg.Pp_L34_Generics_Wildcards;

public class Pc_Animal {
    private int pgi_id;
    // Если создается собственные конструктор, то конструктор по умолчанию исчезает.
    public Pc_Animal (int pgi_id){
        this.pgi_id = pgi_id;
    }
    public Pc_Animal (){};
    public String toString (){
        return String.valueOf(pgi_id); // Так как методу надо вернуть String, а pgi_id - int
    }
    public void pf_eat() {
        System.out.println("I am eating...");
    }
}


