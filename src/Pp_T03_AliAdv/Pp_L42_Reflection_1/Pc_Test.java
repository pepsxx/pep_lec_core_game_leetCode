package Pp_T03_AliAdv.Pp_L42_Reflection_1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Рефлексия (Java Reflection API). Часть I.
    public static void main(String[] args) throws ClassNotFoundException {
        Pc_Person po_person = new Pc_Person();

        Class po_pc_personClass = Pc_Person.class;                                    //v1
        Class po_pc_personClass2 = po_person.getClass();                              //v2
        Class po_pc_personClass3 = Class.forName("Pp_T03_AliAdv.Pp_L42_Reflection_1.Pc_Person"); //v3

        Method[] po_methods = po_pc_personClass.getMethods();
        for (Method poMethod : po_methods) {
            System.out.println(poMethod.getName()+", " + poMethod.getReturnType()+", " + Arrays.toString(poMethod.getParameterTypes()));
        }
        System.out.println("--------------------------------------------------");

        Field[] po_fields = po_pc_personClass.getFields();
        for (Field poField : po_fields) {
            System.out.println(poField.getName()+", " + poField.getType());
        }
        System.out.println("--------------------------------------------------");

        po_fields = po_pc_personClass.getDeclaredFields();
        for (Field poField : po_fields) {
            System.out.println(poField.getName()+", " + poField.getType());
        }
        System.out.println("--------------------------------------------------");

        Annotation[] po_annotation = po_pc_personClass.getAnnotations();
        for (Annotation annotation : po_annotation) {
            if (annotation instanceof Pa_Author)
                System.out.println("Yes");
        }
    }
}



