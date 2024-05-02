package Pp_T03_AliAdv.Pp_L18_Synchronized_1;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Ключевое слово synchronized I часть.
    private int pgi_counter;

    public static void main(String[] args) throws InterruptedException {
        Pc_Test po_test = new Pc_Test();
        po_test.pf_doWork();

    }

    public synchronized void pf_increment(){ // synchronized - синхронизированный метод, его может выполнять только один поток, другие ждут пока метод освободиться.
                                             // Данная синхронизация происходит на объекте.
        pgi_counter++; // Операция не атомарная. Три такта: Считывание, Увеличение на 1, Сохранение.
    }

    public void pf_doWork() throws InterruptedException {
        Thread poTh_thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    //pgi_counter++; // Операция не атомарная. Три такта: Считывание, Увеличение на 1, Сохранение.
                    pf_increment();
                }
            }
        });
        Thread poTh_thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    //++; // Операция не атомарная. Три такта: Считывание, Увеличение на 1, Сохранение.
                    pf_increment();
                }
            }
        });

        poTh_thread1.start();
        poTh_thread2.start();
        poTh_thread1.join(); // Подождать окончание потока 1.
        poTh_thread2.join(); // Подождать окончание потока 2.

        System.out.println("pgi_counter = " + pgi_counter);
    }
}
