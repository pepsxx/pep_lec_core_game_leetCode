package Pp_T01.Pp_L28_Access_Modifiers;
// (public, protected, default, private)
//// "public"    - Доступ в пределах проекта.
//// "protected" - Доступ в пределах пакета и для наследуемых классов.
//// "default"   - Доступ в пределах пакета.
//// "private"   - Доступ только в методах для переменной класса, в классе для методов).
//
//// "public"    - Переменную можно будет задавать на прямую, следовательно, можно задать не корректное число (неправильно небезопасно).
//// "protected" - Доступ к переменной в пределах пакета (папки) и из классов родителей.
//// "default"   - Доступ к переменной в пределах пакета (папки).
//// "private"   - Переменную можно будет поменять только через метод (правильно безопасно).
//
// Класс "public" может быть только один в java файле, и его имя должно совпадать с именем файла, остальные "default".
// Класс (?не может быть?) "private" или "protected" (?используется редко?).
//
// Переменную желательно всегда делать "private".
// Переменная final наоборот "public" так как не изменяемая.
//
// Методы, Конструкторы бывают разные.


import Pp_T01.Pp_L28_Access_Modifiers.Pp_Packet1.Pc_Person;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=e14xUIUc6y0
    //Java для начинающих. Урок 28: Модификаторы доступа public, private, protected и default.
    public int pgi_id_public;
    private int pgi_id_private;

    public static void main(String[] args) {
        Pc_Person po_person1 = new Pc_Person();
        po_person1.pgSt_name_public = "Bob";
        //po_person1.pgSt_name_default = "Bob"; // default - нет доступа до поля класса т.к. класс в другом пакете.
        //po_person1.pgSt_name_private = "Bob"; // private - нет доступа до поля класса т.к. доступна только в своём классе
    }

    public void pf_usersMethod() {
    }

    private void pf_technicalMethod() {
    }
}

class Pc_Test2 {
}