package Pp_T01_AliBeg.Pp_L48_Enum;

public class Pc_Test_New {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=GOzNp1YAm5w
    //Java для начинающих. Урок 48: Enum (Перечисления).
    //Enum - Enumeration - Перечисление.
    //Как стало теперь.

    public static void main(String[] args) {
        Pe_Animals poEn_animals = Pe_Animals.CAT;

        switch (poEn_animals) {
            case DOG -> System.out.println("It,s a dog");
            case CAT -> System.out.println("It,s a cat");
            case FROG -> System.out.println("It,s a Frog");
        }

        System.out.println("--------------------------------------------------");
        Pe_Season poEn_season = Pe_Season.SUMMER;
        Pe_Season poEn_season2 = Pe_Season.WINTER;

        // Object -> Enum -> Season

        System.out.println("Является ли poEn_season подклассом Pe_Season      : " + (poEn_season instanceof Pe_Season));
        System.out.println("Является ли poEn_season подклассом Enum           : " + (poEn_season instanceof Enum));
        System.out.println("Является ли poEn_season подклассом Pe_ObjectSeason: " + (poEn_season instanceof Object));
        System.out.println("poEn_season - объект класса: " + poEn_season.getClass());

        System.out.println("--------------------------------------------------");
        switch (poEn_season) {
            case SUMMER -> System.out.println("It,s warm outside");
            case WINTER -> System.out.println("It,s cold outside!");
            case AUTUMN -> System.out.println("It,s a AUTUMN");
            case SPRING -> System.out.println("It,s a SPRING");
        }

        System.out.println("--------------------------------------------------");
        System.out.println(poEn_animals.getPgSt_translations());

        System.out.println("--------------------------------------------------");
        System.out.println("Средняя температура " + poEn_season + " равна " + poEn_season.getPgi_temperature());

        System.out.println("--------------------------------------------------");
        System.out.println("poEn_animals =        " + poEn_animals);
        System.out.println("poEn_animals.name() = " + poEn_animals.name());

        System.out.println("--------------------------------------------------");
        Pe_Animals poEn_frog = Pe_Animals.valueOf("FROG"); // valueOf позволяет из строки получить объект.
        System.out.println("poEn_frog = " + poEn_frog);

        System.out.println("--------------------------------------------------");
        System.out.println(poEn_season.ordinal()); // ordinal() возвращает индекс.
        System.out.println(poEn_season2.ordinal()); // ordinal() возвращает индекс.
    }
}
