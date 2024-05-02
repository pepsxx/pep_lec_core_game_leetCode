package Pp_T03_AliAdv.Pp_L20_Thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Пул потоков Thread pool.
    public static void main(String[] args) throws InterruptedException {
        ExecutorService poEx_executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 50; i++)
            poEx_executorService.submit(new Pc_Work(i)); // Подготовка потоков.
        poEx_executorService.shutdown(); // ? Запуск потоков.
        System.out.println("All tasks submitted");

        poEx_executorService.awaitTermination(10, TimeUnit.SECONDS); // Продолжить программу если прошило 10 секунд, а потоки не выполнялись.

        System.out.println("Next code");
    }
}

class Pc_Work implements Runnable {

    public int pgi_id;

    public Pc_Work(int pgi_id) {
        this.pgi_id = pgi_id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work id " + pgi_id + " was completed");
    }
}