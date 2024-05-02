package Pp_T02_AliDop.Pp_L02;


import java.util.Random;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=LVRvDVBiwUs
    //Ответы на вопросы 2: Генерация случайных чисел. Класс Random.
    public static void main(String[] args) {
        Random poRa_random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(Math.round(Math.random()*10) + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(poRa_random.nextBoolean()+ " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(poRa_random.nextInt(7)+ " "); // До семи не включительно.
        }
        System.out.println();
    }
}
