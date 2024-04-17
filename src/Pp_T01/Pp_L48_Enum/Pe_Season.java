package Pp_T01.Pp_L48_Enum;

public enum Pe_Season {
    SUMMER(35), WINTER(-30), AUTUMN(10), SPRING(20); // По конвенции писать заглавными т.к. это константы.
    private int pgi_temperature;
    Pe_Season(int pgi_temperature){
        this.pgi_temperature = pgi_temperature;
    }

    public int getPgi_temperature() {
        return pgi_temperature;
    }
}
