package Pp_T03_AliAdv.Pp_L30_Matches;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Регулярные выражения часть I.
    //https://www.regexlib.com/CheatSheet.aspx
    /*
                \\d - 1 цифра.
                \\w - 1 буква.
                  . - 1 символ.

                  + - 1 или более того что перед "+".
                  * - 0 или более того что перед "*".
                  ? - символ который написан перед "?" может быть, а может не быть.
            (x|y|z) - x или у или z.
           [a-zA-Z] - Все английские буквы.
        [a-zA-Z0-9] - Все английские буквы и цифры.
             [^a-z] - Все символы кроме маленьких английских букв.
                {2} - Точное количество. 2а          того что перед {}.
               {2,} - Точное количество. от 2х       того что перед {}.
             {2, 4} - Точное количество. от 2х до 4х того что перед {}.
     */
    public static void main(String[] args) {
        String pmSt_a = "1234";
        String pmSt_b = "Hello";
        String pmSt_c = "-1234";
        String pmSt_d = "+1234";
        String pmSt_e = "E1234";
        String pmSt_f = "f1234";
        String pmSt_g = "jhTYDf1234";
        String pmSt_h = "http://www.google.com";
        System.out.println("pmSt_a = " + pmSt_a);
        System.out.println("pmSt_b = " + pmSt_b);
        System.out.println("--------------------------------------------------");
        System.out.println("pmSt_a = " + pmSt_a);
        System.out.println("pmSt_a.matches(\"1234\") = " + pmSt_a.matches("1234"));
        System.out.println("pmSt_a.matches(\"12\")   = " + pmSt_a.matches("12"));
        System.out.println("pmSt_a.matches(\"1235\") = " + pmSt_a.matches("1235"));
        System.out.println("--------------------------------------------------");
        System.out.println("pmSt_a = " + pmSt_a);
        System.out.println("pmSt_b = " + pmSt_b);
        System.out.println("pmSt_a.matches(\"12\\\\d\") = " + pmSt_a.matches("12\\d"));
        System.out.println("pmSt_a.matches(\"12\\\\d\\\\d\") = " + pmSt_a.matches("12\\d\\d"));
        System.out.println("pmSt_b.matches(\"Hell\\\\d\") = " + pmSt_b.matches("Hell\\d"));
        System.out.println("--------------------------------------------------");
        System.out.println("pmSt_a = " + pmSt_a);
        System.out.println("pmSt_a.matches(\"1234\\\\d+\") = " + pmSt_a.matches("1234\\d+"));
        System.out.println("pmSt_a.matches(\"1234\\\\d*\") = " + pmSt_a.matches("1234\\d*"));
        System.out.println("pmSt_a.matches(\"123\\\\d+\") = " + pmSt_a.matches("123\\d+"));
        System.out.println("pmSt_a.matches(\"123\\\\d*\") = " + pmSt_a.matches("123\\d*"));
        System.out.println("--------------------------------------------------");
        System.out.println("pmSt_a = " + pmSt_a);
        System.out.println("pmSt_с = " + pmSt_c);
        System.out.println("pmSt_d = " + pmSt_d);
        System.out.println("pmSt_a.matches(\"\\\\d*\") = " + pmSt_a.matches("\\d*"));
        System.out.println("pmSt_c.matches(\"\\\\d*\") = " + pmSt_c.matches("\\d*"));
        System.out.println("pmSt_d.matches(\"\\\\d*\") = " + pmSt_d.matches("\\d*"));
        System.out.println("pmSt_a.matches(\"-?\\\\d*\") = " + pmSt_a.matches("-?\\d*"));
        System.out.println("pmSt_c.matches(\"-?\\\\d*\") = " + pmSt_c.matches("-?\\d*"));
        System.out.println("pmSt_d.matches(\"-?\\\\d*\") = " + pmSt_d.matches("-?\\d*"));
        System.out.println("pmSt_a.matches(\"(-|\\\\+)?\\\\d*\") = " + pmSt_a.matches("(-|\\+)?\\d*")); // Плюс надо экранировать.
        System.out.println("pmSt_c.matches(\"(-|\\\\+)?\\\\d*\") = " + pmSt_c.matches("(-|\\+)?\\d*")); // Плюс надо экранировать.
        System.out.println("pmSt_d.matches(\"(-|\\\\+)?\\\\d*\") = " + pmSt_d.matches("(-|\\+)?\\d*")); // Плюс надо экранировать.
        System.out.println("--------------------------------------------------");
        System.out.println("pmSt_a = " + pmSt_a);
        System.out.println("pmSt_e = " + pmSt_e);
        System.out.println("pmSt_f = " + pmSt_f);
        System.out.println("pmSt_g = " + pmSt_g);
        System.out.println("-----");
        System.out.println("pmSt_a.matches(\"[a-z]\\\\d*\") = " + pmSt_a.matches("[a-z]\\d*"));
        System.out.println("pmSt_d.matches(\"[a-z]\\\\d*\") = " + pmSt_d.matches("[a-z]\\d*"));
        System.out.println("pmSt_f.matches(\"[a-z]\\\\d*\") = " + pmSt_f.matches("[a-z]\\d*"));
        System.out.println("pmSt_g.matches(\"[a-z]\\\\d*\") = " + pmSt_g.matches("[a-z]\\d*"));
        System.out.println("-----");
        System.out.println("pmSt_a.matches(\"[a-zA-Z]\\\\d*\") = " + pmSt_a.matches("[a-zA-Z]\\d*"));
        System.out.println("pmSt_e.matches(\"[a-zA-Z]\\\\d*\") = " + pmSt_e.matches("[a-zA-Z]\\d*"));
        System.out.println("pmSt_f.matches(\"[a-zA-Z]\\\\d*\") = " + pmSt_f.matches("[a-zA-Z]\\d*"));
        System.out.println("pmSt_g.matches(\"[a-zA-Z]\\\\d*\") = " + pmSt_g.matches("[a-zA-Z]\\d*"));
        System.out.println("-----");
        System.out.println("pmSt_a.matches(\"[a-zA-Z]+\\\\d*\") = " + pmSt_a.matches("[a-zA-Z]+\\d*"));
        System.out.println("pmSt_e.matches(\"[a-zA-Z]+\\\\d*\") = " + pmSt_e.matches("[a-zA-Z]+\\d*"));
        System.out.println("pmSt_f.matches(\"[a-zA-Z]+\\\\d*\") = " + pmSt_f.matches("[a-zA-Z]+\\d*"));
        System.out.println("pmSt_g.matches(\"[a-zA-Z]+\\\\d*\") = " + pmSt_g.matches("[a-zA-Z]+\\d*"));
        System.out.println("-----");
        System.out.println("pmSt_a.matches(\"[a-zA-Z]*\\\\d*\") = " + pmSt_a.matches("[a-zA-Z]*\\d*"));
        System.out.println("pmSt_e.matches(\"[a-zA-Z]*\\\\d*\") = " + pmSt_e.matches("[a-zA-Z]*\\d*"));
        System.out.println("pmSt_f.matches(\"[a-zA-Z]*\\\\d*\") = " + pmSt_f.matches("[a-zA-Z]*\\d*"));
        System.out.println("pmSt_g.matches(\"[a-zA-Z]*\\\\d*\") = " + pmSt_g.matches("[a-zA-Z]*\\d*"));
        System.out.println("--------------------------------------------------");
        System.out.println("pmSt_a = " + pmSt_a);
        System.out.println("pmSt_e = " + pmSt_e);
        System.out.println("pmSt_f = " + pmSt_f);
        System.out.println("pmSt_a.matches(\"[^a-z]*\") = " + pmSt_a.matches("[^a-z]*"));
        System.out.println("pmSt_e.matches(\"[^a-z]*\") = " + pmSt_e.matches("[^a-z]*"));
        System.out.println("pmSt_f.matches(\"[^a-z]*\") = " + pmSt_f.matches("[^a-z]*"));
        System.out.println("--------------------------------------------------");
        System.out.println("pmSt_a = " + pmSt_a);
        System.out.println("pmSt_b = " + pmSt_b);
        System.out.println("pmSt_a.matches(\".*\") = " + pmSt_a.matches(".*"));
        System.out.println("pmSt_b.matches(\".*\") = " + pmSt_b.matches(".*"));
        System.out.println("pmSt_a.matches(\"....\") = " + pmSt_a.matches("...."));
        System.out.println("pmSt_b.matches(\"....\") = " + pmSt_b.matches("...."));
        System.out.println("pmSt_a.matches(\".....\") = " + pmSt_a.matches("....."));
        System.out.println("pmSt_b.matches(\".....\") = " + pmSt_b.matches("....."));
        System.out.println("--------------------------------------------------");
        System.out.println("pmSt_a = " + pmSt_a);
        System.out.println("pmSt_g = " + pmSt_g);
        System.out.println("pmSt_h = " + pmSt_h);
        System.out.println("-----");
        System.out.println("pmSt_a.matches(\".{4}\") = " + pmSt_a.matches(".{4}"));
        System.out.println("pmSt_g.matches(\".{4}\") = " + pmSt_h.matches(".{4}"));
        System.out.println("pmSt_h.matches(\".{4}\") = " + pmSt_g.matches(".{4}"));
        System.out.println("-----");
        System.out.println("pmSt_a.matches(\".{5,}\") = " + pmSt_a.matches(".{5,}"));
        System.out.println("pmSt_g.matches(\".{5,}\") = " + pmSt_g.matches(".{5,}"));
        System.out.println("pmSt_h.matches(\".{5,}\") = " + pmSt_h.matches(".{5,}"));
        System.out.println("-----");
        System.out.println("pmSt_a.matches(\".{5,11}\") = " + pmSt_a.matches(".{5,11}"));
        System.out.println("pmSt_g.matches(\".{5,11}\") = " + pmSt_g.matches(".{5,11}"));
        System.out.println("pmSt_h.matches(\".{5,11}\") = " + pmSt_h.matches(".{5,11}"));
        System.out.println("--------------------------------------------------");
    }
}



