package Pp_T01.Pp_L48_Enum;

public enum Pe_Animals { // Ключевое слово Enum
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка"); // По конвенции писать заглавными т.к. это константы.
    private String pgSt_translations;
    Pe_Animals (String pgSt_translations){
        this.pgSt_translations = pgSt_translations;
    }

    public String getPgSt_translations() {
        return pgSt_translations;
    }
    public String toString (){
        return pgSt_translations;
    }
}
