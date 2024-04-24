package Pp_T03.Pp_L25_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Класс ReentrantLock.
    public static void main(String[] args) throws InterruptedException {
        Pc_Task po_task = new Pc_Task();
        Thread poTh_thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                po_task.pf_firstThread();
            }
        });
        Thread poTh_thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                po_task.pf_secondThread();
            }
        });
        poTh_thread1.start();
        poTh_thread2.start();
        poTh_thread1.join();
        poTh_thread2.join();

        po_task.pf_showCounter();
    }
}

class Pc_Task {
    private int pgi_counter;
    private Lock po_lock = new ReentrantLock();

    private void pf_increment() {
        for (int i = 0; i < 1_000_000; i++)
            pgi_counter++;
    }

    public void pf_firstThread() {
        po_lock.lock();
        pf_increment();
        po_lock.unlock();
    }

    public void pf_secondThread() {
        po_lock.lock();
        pf_increment();
        po_lock.unlock();
    }
    public void pf_showCounter (){
        System.out.println("pgi_counter = " + pgi_counter);
    }
}
