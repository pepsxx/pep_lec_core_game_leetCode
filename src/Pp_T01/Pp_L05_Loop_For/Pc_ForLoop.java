package Pp_T01.Pp_L05_Loop_For;

public class Pc_ForLoop {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=UYbdAmgcNVc
    //Java для начинающих. Урок 5: Цикл for.
    public static void main(String[] args) {
        for (int pmi_i = 0; pmi_i <= 10; pmi_i++) {
            System.out.println("Hello a: " + pmi_i);
        }

        System.out.println();

        for (int pmi_i = 10; pmi_i >= 0; pmi_i = pmi_i - 5) {
            System.out.println("Hello b: " + pmi_i);
        }
    }
}
