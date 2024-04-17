package Pp_T01.Pp_L32_Upcasting_Downcasting;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=88P-SGqIeeE
    //Java для начинающих. Урок 32: Восходящее и нисходящее преобразование.
    public static void main(String[] args) {
        // Upcasting - Восходящее преобразование. Не явное. Сокращенный вариант.
        Pc_Animal po_animal1 = new Pc_Dog();

        // Upcasting - Восходящее преобразование.  Не явное. Подробный вариант.
        Pc_Dog po_dog2 = new Pc_Dog();
        Pc_Animal po_animal2 = po_dog2;

        // Downcasting - Восходящее преобразование. Явное. Возможны ошибки.
        Pc_Dog po_dog3 = (Pc_Dog) po_animal2;
        po_dog3.pf_eat();
        po_dog3.pf_bark();

        Pc_Animal po_animal4 = new Pc_Animal();
        Pc_Dog po_dog4 = (Pc_Dog) po_animal4; // Будет Ошибка: class Pc_Animal cannot be cast to class Pc_Dog
    }
}
