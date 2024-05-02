package Pp_T01_AliBeg.Pp_L28_Access_Modifiers.Pp_Packet1;

public class Pc_Test {
    public static void main(String[] args) {

        Pc_Person po_person1 = new Pc_Person();
        po_person1.pgSt_name_public = "Bob";
        po_person1.pgSt_name_default = "Bob"; // default - есть доступ до поля класса т.к. класс в этом же пакете.
        //po_person1.pgSt_name_private = "Bob"; // private - нет доступа до поля класса т.к. доступна только в своём классе

    }
}
