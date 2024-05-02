package Pp_T01_AliBeg.Pp_L06_Statement_If;

public class Pc_If {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=ryR033ld_N0
    //Java для начинающих. Урок 6: Условный оператор if.
    public static void main(String[] args) {
        if (5 == 5) {
            System.out.println("a) Да, верно.");
        }

        System.out.println();

        if (5 < 5) {
            System.out.println("b) Да, верно.");
        } else {
            System.out.println("b) Нет, не верно.");
        }

        System.out.println();

        int pmi_myInt = 5;
        if (pmi_myInt < 10) {
            System.out.println("c) Да, верно.");
        } else if (pmi_myInt < 20) {
            System.out.println("c) Да, верно.");
        } else {
            System.out.println("c) Нет, не верно.");
        }
    }
}
