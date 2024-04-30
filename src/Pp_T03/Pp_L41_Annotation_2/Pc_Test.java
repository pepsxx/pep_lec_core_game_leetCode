package Pp_T03.Pp_L41_Annotation_2;

//@Pa_MethodInfo_2(pgSt_cursor = "Print Hello World") // Здесь аннотацию нельзя использовать т. к. она "@Target(ElementType.METHOD)" - для методов.
public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Аннотации. Создание своих аннотаций.
    public static void main(String[] args) {
        Pc_Test po_test = new Pc_Test();
        po_test.pf_printHelloWorld_1();
        po_test.pf_printHelloWorld_2();
    }

    @Pa_MethodInfo_1(pmSt_author = "Pep_$xx", pgi_dateOfCreation = 2019, pgSt_cursor = "MethodInfo_1")
    public void pf_printHelloWorld_1() {
        System.out.println("Hello World MethodInfo_1");
    }

    @Pa_MethodInfo_2(pgSt_cursor = "MethodInfo_2")
    public void pf_printHelloWorld_2() {
        System.out.println("Hello World MethodInfo_2");
    }
}



