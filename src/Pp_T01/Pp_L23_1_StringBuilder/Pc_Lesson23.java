package Pp_T01.Pp_L23_1_StringBuilder;

public class Pc_Lesson23 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=Vw2GPl3APD4
    //Java для начинающих. Урок 23: StringBuilder.
    public static void main(String[] args) {
        String pmSt_x = "Hello";
        System.out.println(pmSt_x);

        pmSt_x.toUpperCase();
        System.out.println(pmSt_x);

        pmSt_x = pmSt_x.toUpperCase();
        System.out.println(pmSt_x);

        System.out.println("1----------");

        String pmSt_string1 = "Hello";
        String pmSt_string2 = " my";
        String pmSt_string3 = " friend";
        String pmSt_stringAll = pmSt_string1 + pmSt_string2 + pmSt_string3;
        System.out.println(pmSt_stringAll);

        System.out.println("2----------");

        StringBuilder poSb_sb = new StringBuilder("Hello");
        System.out.println(poSb_sb.toString());
        poSb_sb.append(" my");
        poSb_sb.append(" friend");
        System.out.println(poSb_sb.toString());

        System.out.println("3----------");

        StringBuilder poSb_sb2 = new StringBuilder("Hello2");
        //Если метод возвращает тот же объект на котором был выполнен, то можно запустить следующий метод
        poSb_sb2.append(" my2").append(" friend2");
        System.out.println(poSb_sb2.toString());


    }
}

