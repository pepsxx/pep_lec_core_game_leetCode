package Pp_T01.Pp_L48_Enum;

public class Pc_Test_Old {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=GOzNp1YAm5w
    //Java для начинающих. Урок 48: Enum (Перечисления).
    //Enum - Enumeration - Перечисление.
    //Как было раньше.
    private static final int PGI_DOG = 0;
    private static final int PGI_CAT = 1;
    private static final int PGI_FROG = 2;

    public static void main(String[] args) {
        int pmi_animal = PGI_DOG; // По ошибке можно присвоить неправильный int, например 5.

        switch (pmi_animal) {
            case PGI_DOG -> System.out.println("It,s a dog");
            case PGI_CAT -> System.out.println("It,s a cat");
            case PGI_FROG -> System.out.println("It,s a Frog");
            default -> System.out.println("It's not is animal");

        }
    }
}
