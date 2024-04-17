package Pp_T02.Pp_L03_Thread;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=0Cdsk2BeNA8
    //Продвинутая Java: Введение в многопоточность в Java.
    public static void main(String[] args) throws InterruptedException {
        System.out.println("I am going sleep");
        Thread.sleep(300);
        System.out.println("I am awake!");
        Pc_MayThread poTh_MayThread = new Pc_MayThread();
        poTh_MayThread.start(); // Не run, а start.
        Pc_MayThread poTh_MayThread2 = new Pc_MayThread();
        poTh_MayThread2.start(); // Не run, а start.
        Thread poTh_hread = new Thread(new Pc_Runner());
        poTh_hread.start();
    }
}

class Pc_MayThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from Pc_MayThread " + i);
        }
    }
}

class Pc_Runner implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from Pc_Runner " + i);
        }
    }
}


