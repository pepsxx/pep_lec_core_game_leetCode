package Pp_T03.Pp_L28_Interrupt;

import java.util.Random;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Прерывание потоков.
    public static void main(String[] args) throws InterruptedException {
        Thread poTh_thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random poRa_random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    if (Thread.currentThread().isInterrupted()) { // Получили команду на остановку.
                        System.out.println("Thread was interrupted");
                        break;
                    }
                    Math.sin(poRa_random.nextDouble());
                    System.out.println("i = " + i);
                }
            }
        });

        System.out.println("Starting thread");
        poTh_thread.start();

        Thread.sleep(1_000);
        poTh_thread.interrupt(); // Сообщаем потоку, что хотим его остановить.

        poTh_thread.join();
        System.out.println("Starting finished");
    }
}
