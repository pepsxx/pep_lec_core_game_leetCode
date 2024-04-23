package Pp_T03.Pp_L19_Synchronized_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Ключевое слово synchronized II часть.
    public static void main(String[] args) throws InterruptedException {
        new Pc_Worker().main();
    }


}

class Pc_Worker {
    Random poRa_random = new Random();

    Object lock1 = new Object(); // Объекты для блокировки метода. Технически могут быль любыми, но принято создавать lock класса Object.
    Object lock2 = new Object(); // Объекты для блокировки метода. Технически могут быль любыми, но принято создавать lock класса Object.

    private List<Integer> poLi_list1 = new ArrayList<>();
    private List<Integer> poLi_list2 = new ArrayList<>();

    public void pf_addToList1() {
        synchronized (lock1) { // Синхронизированный блок по lock1, при этом метод pf_addToList2 не заблокирован для увольнения.
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            poLi_list1.add(poRa_random.nextInt(100));
        }

    }

    public void pf_addToList2() {
        synchronized (lock2) { // Синхронизированный блок по lock2, при этом метод pf_addToList1 не заблокирован для увольнения.
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            poLi_list2.add(poRa_random.nextInt(100));
        }

    }

    public void pf_work() {
        for (int i = 0; i < 1_000; i++) {
            pf_addToList1();
            pf_addToList2();
        }
    }

    public void main() {
        long pml_before = System.currentTimeMillis();

        Thread poTh_thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                pf_work();
            }
        });

        Thread poTh_thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                pf_work();
            }
        });

        poTh_thread1.start();
        poTh_thread2.start();

        try {
            poTh_thread1.join();
            poTh_thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        long pml_after = System.currentTimeMillis();
        System.out.println("Program took " + (pml_after - pml_before) + " ms to run");

        System.out.println("poLi_list1.size() = " + poLi_list1.size());
        System.out.println("poLi_list2.size() = " + poLi_list2.size());
    }
}
