package Pp_T03.Pp_L29_Callable_Future;

import java.util.Random;
import java.util.concurrent.*;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Callable и Future.

    private static int pgi_result;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService po_executorService1 = Executors.newFixedThreadPool(1);
        po_executorService1.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Starting");
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Finishing");
                pgi_result++;
            }
        });

        po_executorService1.shutdown();
        po_executorService1.awaitTermination(1, TimeUnit.DAYS); // Ожидание выполнения.
        System.out.println("pgi_result = " + pgi_result);
        System.out.println("----------------------------------------");

        ExecutorService po_executorService2 = Executors.newFixedThreadPool(1);
        Future<Integer> po_future = po_executorService2.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception{
                System.out.println("Starting");
                try {
                    Thread.sleep(1_000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                Random poRa_random = new Random();
                int pmi_randomValue = poRa_random.nextInt(100);
                System.out.println("pmi_randomValue = " + pmi_randomValue);

                if (pmi_randomValue<50)
                    throw new Exception("-=-=-=-=-=-=-= Число меньше 50 =-=-=-=-=-=-=-");

                System.out.println("Finishing");
                return pmi_randomValue;
            }
        });

        po_executorService2.shutdown();
        //po_executorService2.awaitTermination(1, TimeUnit.DAYS); // Ожидание выполнения.
        try {
            System.out.println("po_future.get() = " + po_future.get()); // get ожидает выполнение потока.
        } catch (ExecutionException e) {
            Throwable po_ex = e.getCause();
            System.out.println("po_ex.getMessage() = " + po_ex.getMessage());
            //throw new RuntimeException(e);
        }
        System.out.println("----------------------------------------");

    }

    public static int pf_calculate() {
        return 5 + 4;
    }
}



