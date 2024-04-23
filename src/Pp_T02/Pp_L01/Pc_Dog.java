package Pp_T02.Pp_L01;

public class Pc_Dog extends Pc_Animal {
    public void pf_eat() {
        System.out.println("Dog is eating...");
    }

    @Override // Аннотация - Если мы ошибемся в названии метода pf_sleep например pf_slip, то мы увидим ошибку.
    public void pf_sleep() {

        System.out.println("Dog is sleeping");
    }

    public void pf_bark() {
        System.out.println("Dog is barking...");
    }
}
