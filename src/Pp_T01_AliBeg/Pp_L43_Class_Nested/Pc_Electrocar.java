package Pp_T01_AliBeg.Pp_L43_Class_Nested;

public class Pc_Electrocar {
    private int pgi_id;

    // Вложенный не статический класс.
    private class Pc_Motor {
        public void pf_startMotor() {
            System.out.println("Motor " + pgi_id + " is starting");
        }
    }
    // Вложенный статический класс.
    public static class Pc_Battery{
        public void pf_charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Pc_Electrocar(int pgi_id) {
        this.pgi_id = pgi_id;
    }

    public void pf_start() {
        Pc_Motor po_motor = new Pc_Motor();
        po_motor.pf_startMotor();
        final int PMI_X =1;

        class Pc_SomeClass{
            public void pf_someMethod(){
                System.out.println("pmi_x = " + PMI_X);
                System.out.println("pgi_id = " + pgi_id);
            }
        }

        Pc_SomeClass po_someObject = new Pc_SomeClass();
        po_someObject.pf_someMethod();

        System.out.println("Electrocar " + pgi_id + " is starting...");
    }

}
