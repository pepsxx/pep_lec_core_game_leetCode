package Pp_T03_AliAdv.Pp_L24_CountDownLatch.Pp_V1;

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
            po_executorService.submit(new Pc_Processor(po_countDownLatch));
        po_executorService.shutdown(); // Сообщили что все задания созданы.
        po_countDownLatch.await();
        System.out.println("Latch has been opened, main thread is proceeding!");
    }
}

class Pc_Processor implements Runnable{
    private CountDownLatch po_countDownLatch;

    public Pc_Processor(CountDownLatch po_countDownLatch){
        this.po_countDownLatch = po_countDownLatch;
    }
    @Override
    public void run() {
        try {
            System.out.println("1 po_countDownLatch.getCount() = " + po_countDownLatch.getCount());
            Thread.sleep(3_000);
            System.out.println("2 po_countDownLatch.getCount() = " + po_countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        po_countDownLatch.countDown();
        System.out.println("3 po_countDownLatch.getCount() = " + po_countDownLatch.getCount());
    }
}
