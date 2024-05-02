package Pp_T01_AliBeg.Pp_L04_Loop_While;

public class Pc_WhileLoops {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=15PjODTSTaw
    //Java для начинающих. Урок 4: Цикл while.
    public static void main(String[] args) {
        boolean pmb_t = 5 > 7;
        System.out.println(pmb_t);

        int pmi_value = 0;
        while (pmi_value < 5) {
            System.out.println("Hello " + pmi_value);
            pmi_value = pmi_value + 1;
        }
    }
}
