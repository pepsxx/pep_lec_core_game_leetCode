package Pp_T03.Pp_L22_Wait_Notify;

import java.util.Scanner;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Методы wait и notify.
    public static void main(String[] args) throws InterruptedException {
        Pc_WaitAndNotify po_wn = new Pc_WaitAndNotify();
        Thread poTh_thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    po_wn.pf_producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread poTh_thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    po_wn.pf_consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        poTh_thread1.start();
        poTh_thread2.start();

        poTh_thread1.join();
        poTh_thread2.join();
    }
}

class Pc_WaitAndNotify {
    public void pf_producer() throws InterruptedException {
        synchronized (this) {
            System.out.println("producer код начался");
            System.out.println("producer код идет на ожидание 1");
            this.wait(); // wait - Может вызываться только в пределах синхронизированного блока. (wait() эквивалентно this.wait()).
                    // 1 - отдаёт intrinsic clock, 2 - Ждет, вызова  notify().
            System.out.println("producer вернулся с ожидания 1");

            System.out.println("producer код идет на ожидание 2");
            this.wait(3_000); // Ждет вызова  notify(), но не более 3 сек.
            System.out.println("producer вернулся с ожидания 2");
        }
    }

    public void pf_consumer() throws InterruptedException {
        Thread.sleep(2_000);
        Scanner poSc_scanner = new Scanner(System.in);
        synchronized (this) {
            System.out.println("consumer код начался");
            System.out.println("Waiting for return key pressed");
            poSc_scanner.nextLine();
            this.notify(); // intrinsic clock - не освобождается.

            System.out.println("consumer код завершается");
            Thread.sleep(3_000);
            System.out.println("consumer код завершился");
        }
    }
}
