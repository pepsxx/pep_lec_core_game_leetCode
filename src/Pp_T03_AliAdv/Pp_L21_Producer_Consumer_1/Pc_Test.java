package Pp_T03_AliAdv.Pp_L21_Producer_Consumer_1;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Паттерн producer - consumer I часть.
    //producer - Производитель.
    //consumer - Потребитель.
    private static BlockingQueue<Integer> po_queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread poTh_thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pf_producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread poTh_thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pf_consumer();
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

    private static void pf_producer() throws InterruptedException {
        Random poRa_random = new Random();
        while (true) {
            for (int i = 50; i < 2_000; i += 50) {
                Thread.sleep(i);
                po_queue.put(poRa_random.nextInt(100)); // put - потокобезопасный метод.
                //System.out.println("i  = " + i);
                if (po_queue.size()==10)
                    System.out.println("Очередь заполнена.");
            }
        }
    }

    private static void pf_consumer() throws InterruptedException {

        Random poRa_random = new Random();
        while (true) {
            Thread.sleep(100);

            if (poRa_random.nextInt(10) == 5) {
                System.out.println("po_queue.take() Выпало число    = " + po_queue.take()); // take умеет ждать появление объектов  в очереди, если она пустая.
                System.out.println("po_queue.size() В очереди стоят = " + po_queue.size());

                if (po_queue.size()==0)
                    System.out.println("Очередь пустая.");
            }
        }
    }
}
