package Pp_T03_AliAdv.Pp_L43_Reflection_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Рефлексия (Java Reflection API). Часть II.
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
//        Scanner poSc_scanner = new Scanner(System.in); // v1
        Scanner poSc_scanner = new Scanner("Pp_T03.Pp_L43_Reflection_2.Pc_Person java.lang.String setPgSt_name"); // v2
//        Scanner poSc_scanner = new Scanner("java.lang.Thread java.lang.String setName"); // v3
        // Название_класса1 Название_класса2 Название метода
        Class po_classObject1 = Class.forName(poSc_scanner.next());
        Class po_classObject2 = Class.forName(poSc_scanner.next());
        String pmSt_methodName = poSc_scanner.next();

        Method po_m = po_classObject1.getMethod(pmSt_methodName, po_classObject2);
        Object po_o1 = po_classObject1.newInstance();
        Object po_o2 = po_classObject2.getConstructor(String.class).newInstance("String value Test Text");

        po_m.invoke(po_o1, po_o2);

        System.out.println(po_o1);
    }
}



