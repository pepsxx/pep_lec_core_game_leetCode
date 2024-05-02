package Pp_T01_AliBeg.Pp_L39_Exception_3;

public class Pc_Exception3 {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=P7dByA1rz5c
    //Java для начинающих. Урок 39: Исключения (часть 3). Checked и Unchecked исключения.
    public static void main(String[] args) {
        // Checked Exception   (Compile time exception). Проверяемые. Эти ошибки надо обрабатывать.
        // Checked Exception    https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html - все кроме RuntimeException
        // Unchecked Exception (Runtime exception). int i = 1 / 0;    Эти ошибки не должны существовать в программе.
        // Unchecked Exception  https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html

        //int pmi_i = 1 / 0;               // ArithmeticException

        //String pmSt_name = null;
        //pmSt_name.length();              // NullPointerException

        int[] pmMi_arr = new int[2];
        System.out.println(pmMi_arr[2]); // ArrayIndexOutOfBoundsException
    }
}
