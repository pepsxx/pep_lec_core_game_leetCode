package Pp_T01_AliBeg.Pp_L43_Class_Nested;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=Rh6n-3TQJD4
    //Java для начинающих. Урок 43: Вложенные классы.
    public static void main(String[] args) {
        Pc_Electrocar po_electrocar = new Pc_Electrocar(1);
        po_electrocar.pf_start();
        Pc_Electrocar.Pc_Battery po_battery = new Pc_Electrocar.Pc_Battery();
        po_battery.pf_charge();
    }
}
