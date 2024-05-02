package Pp_T03_AliAdv.Pp_L27_Deadlock.Pp_v3;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Взаимная блокировка Deadlock.
    public static void main(String[] args) throws InterruptedException {
        Pc_Runner po_runner = new Pc_Runner();
        Thread poTh_thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                po_runner.pf_firstThread();
            }
        });
        Thread poTh_thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                po_runner.pf_secondThread();
            }
        });
        poTh_thread1.start();
        poTh_thread2.start();
        poTh_thread1.join();
        poTh_thread2.join();

        po_runner.pf_finished();
    }
}

class Pc_Runner {
    private Pc_Account po_account1 = new Pc_Account();
    private Pc_Account po_account2 = new Pc_Account();

    private Lock po_lock1 = new ReentrantLock();
    private Lock po_lock2 = new ReentrantLock();


    public void pf_takeLocks(Lock po_lock1, Lock po_lock2) {
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while (true) {
            try {
                firstLockTaken = po_lock1.tryLock();
                secondLockTaken = po_lock2.tryLock();
            } finally {
                if (firstLockTaken && secondLockTaken)
                    return;
                if (firstLockTaken)
                    po_lock1.unlock();
                if (secondLockTaken)
                    po_lock2.unlock();
            }
            try {
                System.out.println("Not Lock");
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void pf_firstThread() {
        Random poRa_random = new Random();
        for (int i = 0; i < 10_000; i++) {
            pf_takeLocks(po_lock2, po_lock1);
            try {
                Pc_Account.pf_transfer(po_account1, po_account2, poRa_random.nextInt(100));
            } finally {
                po_lock1.unlock();
                po_lock2.unlock();
            }
        }
    }

    public void pf_secondThread() {
        Random poRa_random = new Random();
        for (int i = 0; i < 10_000; i++) {
            pf_takeLocks(po_lock1, po_lock2);
            try {
                Pc_Account.pf_transfer(po_account2, po_account1, poRa_random.nextInt(100));
            } finally {
                po_lock1.unlock();
                po_lock2.unlock();
            }
        }
    }

    public void pf_finished() {
        System.out.println("po_account1.getBalance() = " + po_account1.getBalance());
        System.out.println("po_account2.getBalance() = " + po_account2.getBalance());
        System.out.println("Total Balance = " + (po_account1.getBalance() + po_account2.getBalance()));
    }
}

class Pc_Account {
    private int pmi_balance = 1_0000;

    public void pf_deposit(int pmi_amount) {
        pmi_balance += pmi_amount;
    }

    public void pf_withdraw(int pmi_amount) {
        pmi_balance -= pmi_amount;
    }

    public int getBalance() {
        return pmi_balance;
    }

    public static void pf_transfer(Pc_Account acc1, Pc_Account acc2, int amount) {
        acc1.pf_withdraw(amount);
        acc2.pf_deposit(amount);
    }
}