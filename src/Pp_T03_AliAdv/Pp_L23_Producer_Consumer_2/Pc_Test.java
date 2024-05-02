package Pp_T03_AliAdv.Pp_L23_Producer_Consumer_2;

import java.util.LinkedList;
import java.util.Queue;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Паттерн producer - consumer II часть.

    public static void main(String[] args) throws InterruptedException {
        Pc_ProducerConsumer po_pc = new Pc_ProducerConsumer();
        Thread poTh_thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    po_pc.pf_producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread poTh_thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    po_pc.pf_consumer();
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

class Pc_ProducerConsumer {
    private Queue<Integer> poQu_queue = new LinkedList<>();
    private final int PGI_LIMIT = 10;
    private final Object lock = new Object();

    public void pf_producer() throws InterruptedException {
        int pmi_value = 0;
        while (true) {
            for (int i = 50; i < 2_000; i += 50) {

                synchronized (lock) {
                    while (poQu_queue.size() == PGI_LIMIT)
                        lock.wait();
                    poQu_queue.offer(pmi_value++);
                    lock.notify();
                }

                Thread.sleep(i);

            }
        }
    }

    public void pf_consumer() throws InterruptedException {

        while (true) {
            synchronized (lock) {
                while (poQu_queue.size() == 0)
                    lock.wait();
                int pmi_value = poQu_queue.poll();
                System.out.println("pmi_value = " + pmi_value);
                System.out.println("Очередь = " + poQu_queue.size());
                lock.notify();
            }
            Thread.sleep(1_000);
        }
    }
}
