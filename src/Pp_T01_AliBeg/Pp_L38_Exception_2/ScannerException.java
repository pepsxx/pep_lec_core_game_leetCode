package Pp_T01_AliBeg.Pp_L38_Exception_2;

public class ScannerException extends Exception { //Сделали класс подклассом Exception
    public ScannerException(String pmSt_description) {
        super(pmSt_description); // Подключен конструктор родителя (super).
    }
}
