package Pp_T03_AliAdv.Pp_L32_Pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Классы Pattern и Matcher.
    public static void main(String[] args) {
        String pmSt_text = """
             Если у вас хорошо заметная форма с подписью \\"email\\" и пользователь где-то в этой форме ввёл символ ‘@’
             , то будет безопасно предположить, что ответ на первый вопрос положительный. Это легко.
             За отдельную плату можно создать именной домен, civildo@aviavtomatika.ru.
             Ими обычно пользуются крупные компании.
             .bad@bad.bad
             bad.@bad.bad
             bad@badbad
             bad@.bad.bad
             bad@bad.b
             bad@badbad
             bad@ba@d.bad
             bad@bad.b-d
             При регистрации емэйла на Яндексе вы получаете основной домен yandex.ru.
             А бонусом даются еще несколько – sdf@ya.ru, esf@yandex.com, gerg@yandex.by, wef@yandex.ua, wfsd@yandex.kz.
                """;
        System.out.println("pmSt_text = " + pmSt_text);
        System.out.println("--------------------------------------------------");

        Pattern po_email = Pattern.compile("\\w+@(yandex|aviavtomatika)\\.(com|ru)");
        Matcher po_matcher = po_email.matcher(pmSt_text);
        while (po_matcher.find()){
            System.out.println("po_matcher.group() = " + po_matcher.group());
        }
        System.out.println("--------------------------------------------------");

        po_email = Pattern.compile("(\\w+)@(yandex|aviavtomatika)\\.(com|ru)");
        po_matcher = po_email.matcher(pmSt_text);
        while (po_matcher.find()){
            System.out.println("po_matcher.group(1) = " + po_matcher.group(1));
        }
        System.out.println("--------------------------------------------------");

        po_email = Pattern.compile("(\\w+)@(yandex|aviavtomatika)\\.(com|ru)");
        po_matcher = po_email.matcher(pmSt_text);
        while (po_matcher.find()){
            System.out.println("po_matcher.group(2) = " + po_matcher.group(2));
        }
        System.out.println("--------------------------------------------------");

        po_email = Pattern.compile("(\\w+)@(yandex|aviavtomatika)\\.(com|ru)");
        po_matcher = po_email.matcher(pmSt_text);
        while (po_matcher.find()){
            System.out.println("po_matcher.group(3) = " + po_matcher.group(3));
        }
        System.out.println("--------------------------------------------------");


        po_email = Pattern.compile("( ((([a-zA-Z])+)|(([a-zA-Z])([a-zA-Z0-9_\\-.]+)([a-zA-Z0-9])))@((([a-zA-Z])+)|(([a-zA-Z])([a-zA-Z0-9_\\-.]+)([a-zA-Z0-9])))\\.([a-zA-Z0-9]){2,})");
        po_matcher = po_email.matcher(pmSt_text);
        while (po_matcher.find()){
            System.out.println("po_matcher.group() = " + po_matcher.group());
        }
        System.out.println("--------------------------------------------------");

    }
}



