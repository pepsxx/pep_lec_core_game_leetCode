package Pp_T01.Pp_L41_Class_Abstract;

public abstract class Pc_Animal { // abstract - Запрещает создание объектов класса Pc_Animal (Pc_Animal - не класс а концепция).
    public void pf_eat() {
        System.out.println("I am eating...");
    }
    public abstract void pf_makeSound(); // Абстрактный метод (может быть только в абстрактном классе).
}
