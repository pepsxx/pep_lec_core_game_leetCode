package Pp_T03_AliAdv.Pp_L17_Volatile;

import java.util.Scanner;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //https://www.youtube.com/watch?v=CI_rOvL-OTE
    //Продвинутая Java: Ключевое слово volatile.
    public static void main(String[] args) {
        Pc_MyThread poTh_MyThread = new Pc_MyThread();
        poTh_MyThread.start();

        Scanner poSc_scanner = new Scanner(System.in);
        poSc_scanner.nextLine();

        poTh_MyThread.pf_shutdown();
    }
}

class Pc_MyThread extends Thread {
    private volatile boolean pfb_running = true; // volatile гарантирует когерентность кеша. Следует использовать если разные потоки работают с одной переменной.

    public void run() {
        while (pfb_running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void pf_shutdown() {
        pfb_running = false;
    }
}
