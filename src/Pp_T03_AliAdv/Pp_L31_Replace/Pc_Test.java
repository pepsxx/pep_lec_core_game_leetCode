package Pp_T03_AliAdv.Pp_L31_Replace;

import java.util.Arrays;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Регулярные выражения часть II.
    public static void main(String[] args) {
        String pmSt_a = "Hello there hey";
        System.out.println("pmSt_a = " + pmSt_a);
        String[] pmMSt_words = pmSt_a.split(" ");
        System.out.println("split(\" \")");
        System.out.println("Arrays.toString(pmMSt_words) = " + Arrays.toString(pmMSt_words));
        System.out.println("--------------------------------------------------");

        pmSt_a = "Hello.there.hey";
        System.out.println("pmSt_a = " + pmSt_a);
        pmMSt_words = pmSt_a.split("\\.");
        System.out.println("split(\"\\\\.\")");
        System.out.println("Arrays.toString(pmMSt_words) = " + Arrays.toString(pmMSt_words));
        System.out.println("--------------------------------------------------");

        pmSt_a = "Hello123there456789hey";
        System.out.println("pmSt_a = " + pmSt_a);
        pmMSt_words = pmSt_a.split("\\d+");
        System.out.println("split(\"\\\\d+\")");
        System.out.println("Arrays.toString(pmMSt_words) = " + Arrays.toString(pmMSt_words));
        System.out.println("--------------------------------------------------");

        pmSt_a = "Hello there hey";
        System.out.println("pmSt_a = " + pmSt_a);
        String pmSt_b = pmSt_a.replace(" ", ".");
        System.out.println("replace(\" \", \".\")");
        System.out.println("pmSt_b = " + pmSt_b);
        System.out.println("--------------------------------------------------");

        pmSt_a = "Hello123there456789hey";
        System.out.println("pmSt_a = " + pmSt_a);
        pmSt_b = pmSt_a.replaceAll("\\d+", "."); // replaceAll принимает регулярные вырождения.
        System.out.println("replaceAll(\"\\\\d+\", \".\")");
        System.out.println("pmSt_b = " + pmSt_b);
        System.out.println("--------------------------------------------------");

        pmSt_a = "Hello there hey";
        System.out.println("pmSt_a = " + pmSt_a);
        pmSt_b = pmSt_a.replaceFirst(" ", "."); // replaceFirst обрабатывает только первое появление.
        System.out.println("replaceFirst(\" \", \".\")");
        System.out.println("pmSt_b = " + pmSt_b);
        System.out.println("--------------------------------------------------");
    }
}



