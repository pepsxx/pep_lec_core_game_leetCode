package Pp_T02.Pp_L03;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=5f6fsLMaSvI
    //Ответы на вопросы 3: Замер времени исполнения программы.
    public static void main(String[] args) {

        long pml_before = System.currentTimeMillis();

        for (int i = 0; i < 1_000_000; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        long pml_after = System.currentTimeMillis();

        System.out.println("Время вымол нения программы: " + (pml_after - pml_before));
    }
}
