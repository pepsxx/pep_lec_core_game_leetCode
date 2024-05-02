package Pp_T01_AliBeg.Pp_L22_Keyword_Final;

public class Pc_Lesson22 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=ulewh5JQKa0
    //Java для начинающих. Урок 22: Ключевое слово final.
    public static void main(String[] args) {
        final int PMFI_X = 10;
        System.out.println(PMFI_X);

        System.out.println(Pc_Test.PSFI_CONSTANT);
    }
}

class Pc_Test {
    // Так как переменная "final" не меняется обычно она, является "static", т.к. нет смысла хранить её отдельно для каждого объекта.
    public static final int PSFI_CONSTANT = 0;
}