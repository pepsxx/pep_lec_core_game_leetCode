package Pp_T01.Pp_L23_2_Output_Format;

public class Pc_Lesson23 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=WABydTyTlFs
    //Java для начинающих. Урок 23(продолжение): Форматирование строк в Java.
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Hello again");
        System.out.println("--------------------------------------------------");
        System.out.print("Hello");
        System.out.println("Hello again");
        System.out.println("--------------------------------------------------");
        System.out.printf("This is a string, %d", 10);
        System.out.println();
        System.out.printf("%f This is %s a string, %d", 10.4, "HIHI", 1000);
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.printf("String %10d\n", 10);
        System.out.printf("String %10d\n", 5);
        System.out.printf("String %10d\n", 100000);
        System.out.printf("String %10d\n", 1000000000);
        System.out.println("--------------------------------------------------");
        System.out.printf("String %-10d\n", 10);
        System.out.printf("String %-10d\n", 5);
        System.out.printf("String %-10d\n", 100000);
        System.out.printf("String %-10d\n", 1000000000);
        System.out.println("--------------------------------------------------");
        System.out.printf("String %.2f\n", 45.32265);
        System.out.printf("String %.2f\n", 45.32);
        System.out.printf("String %.2f\n", 45.33754);
        System.out.printf("String %.2f\n", 45.322652636);
        System.out.printf("String %.2f\n", 45.337);
        System.out.println("--------------------------------------------------");
        // %-[10][.42]
    }
}

