package Pp_T03_AliAdv.Pp_L24_CountDownLatch.Pp_V2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Класс CountDownLatch.
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch po_countDownLatch = new CountDownLatch(3); // Count Down Latch - Защелка обратного отсчета

        ExecutorService po_executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 3; i++)
            po_executorService.submit(new Pc_Processor(i, po_countDownLatch));
        po_executorService.shutdown(); // Сообщили что все задания созданы.

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1_000);

            System.out.println("1 po_countDownLatch.getCount() = " + po_countDownLatch.getCount());
            po_countDownLatch.countDown();
            System.out.println("2 po_countDownLatch.getCount() = " + po_countDownLatch.getCount());
        }

    }
}

class Pc_Processor implements Runnable {
    private CountDownLatch po_countDownLatch;
    private int pgi_id;

    public Pc_Processor(int pgi_id, CountDownLatch po_countDownLatch) {
        this.pgi_id = pgi_id;
        this.po_countDownLatch = po_countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            po_countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread with id " + pgi_id + " proceeded.");
    }
}
