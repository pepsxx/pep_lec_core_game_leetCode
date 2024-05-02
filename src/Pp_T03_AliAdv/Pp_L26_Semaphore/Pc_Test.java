package Pp_T03_AliAdv.Pp_L26_Semaphore;

import java.util.Random;
import java.util.concurrent.*;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Семафор Semaphore.
    public static void main(String[] args) throws InterruptedException {
        Semaphore po_semaphore = new Semaphore(3); // 3 - Разрешения.
        System.out.println("po_semaphore.availablePermits() = " + po_semaphore.availablePermits());

        try {
            po_semaphore.acquire(); // Забираем поток.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("po_semaphore.availablePermits() = " + po_semaphore.availablePermits());

        po_semaphore.release(); // Отдаёт разрешение.
        System.out.println("po_semaphore.availablePermits() = " + po_semaphore.availablePermits());
        System.out.println("--------------------------------------------------");

        try {
            po_semaphore.acquire(); // Забираем поток.
            po_semaphore.acquire(); // Забираем поток.
            po_semaphore.acquire(); // Забираем поток.
            System.out.println("All permits have been acquired");
            po_semaphore.release(); // Отдаёт разрешение. // Если заранее не отдать, код дальше не пойдет.
            po_semaphore.acquire(); // Забираем поток.

            System.out.println("Can't reach here...");
            po_semaphore.release(); // Отдаёт разрешение.
            po_semaphore.release(); // Отдаёт разрешение.
            po_semaphore.release(); // Отдаёт разрешение.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("po_semaphore.availablePermits() = " + po_semaphore.availablePermits());
        System.out.println("--------------------------------------------------");

        ExecutorService po_executorService = Executors.newFixedThreadPool(2000); // Создали 200 потоков, задача ограничить одномоментное использование.

        Pc_Connection po_connection = Pc_Connection.getPo_connection();
        for (int i = 0; i < 2000; i++) {
            po_executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        po_connection.pf_work();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
        po_executorService.shutdown();
        po_executorService.awaitTermination(1, TimeUnit.DAYS);
    }
}

class Pc_Connection {

    private static Pc_Connection po_connection = new Pc_Connection();
    private int pgi_connectionsCount;
    private Semaphore po_semaphore = new Semaphore(50);

    private Pc_Connection() { // Приватный конструктор сообщает что будет только один объект данного класса.
    }

    public static Pc_Connection getPo_connection() {
        return po_connection;
    }

    private void pf_doWork() throws InterruptedException {
        Random poRa_random1 = new Random();
        Thread.sleep(poRa_random1.nextInt(100));
        synchronized (this) {
            pgi_connectionsCount++;
            System.out.println("pgi_connectionsCount + " + pgi_connectionsCount);
        }
        Random poRa_random2 = new Random();
        Thread.sleep(poRa_random2.nextInt(1000));
        synchronized (this) {
            pgi_connectionsCount--;
            System.out.println("pgi_connectionsCount - " + pgi_connectionsCount);
        }
    }

    public void pf_work() throws InterruptedException {
        po_semaphore.acquire();
        try {
            pf_doWork();
        } finally {
            po_semaphore.release();
        }
    }
}
