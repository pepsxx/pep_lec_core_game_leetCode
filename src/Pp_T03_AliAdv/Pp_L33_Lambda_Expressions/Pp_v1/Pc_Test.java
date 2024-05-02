package Pp_T03_AliAdv.Pp_L33_Lambda_Expressions.Pp_v1;

class Pc_ExecutableImplementation implements Pi_Executable {   // v1
    @Override                                                  // v1
    public void pf_executable() {                              // v1
        System.out.println("Hello");                           // v1
    }                                                          // v1
}                                                              // v1

interface Pi_Executable {                                      // v1 v2 v3*
    void pf_executable();                                      // v1 v2 v3*
}                                                              // v1 v2 v3*


class Pc_Runner {                                              // v1 v2 v3
    public void run(Pi_Executable e) {                         // v1 v2 v3
        e.pf_executable();                                     // v1 v2 v3
    }                                                          // v1 v2 v3
}                                                              // v1 v2 v3

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Лямбда - выражения часть I.
    public static void main(String[] args) {
        //  Код в обычном формате - Начало.
        Thread poTh_thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        });
        //  Код в обычном формате - Конец.

        // Начиная с Java 8.
        // Лямбда-выражение можно использовать если анонимный класс имплементируют интерфейс, который имеет только 1 метод.
        //  Код через лямбда-выражение - Начало.
        Thread poTh_thread2 = new Thread(() -> System.out.println("Hello"));
        //  Код через лямбда-выражение - Конец.

        System.out.println("--------------------------------------------------");

        Pc_Runner po_runner = new Pc_Runner();
        // v1
        po_runner.run(new Pc_ExecutableImplementation());
        // v2
        po_runner.run(new Pi_Executable() {
            @Override
            public void pf_executable() {
                System.out.println("Hello");
            }
        });
        // v3
        po_runner.run(() -> System.out.println("Hello"));
        System.out.println("--------------------------------------------------");

        po_runner.run(() -> {
            System.out.println("Hello");
            System.out.println("Goodbye");
        });
        System.out.println("--------------------------------------------------");

        Pc_Runner2 po_runner2 = new Pc_Runner2();

        po_runner2.run(() -> {
            System.out.println("Hello");
            System.out.println("Goodbye");
            return 5;
        });

        po_runner2.run(() -> 10);
        System.out.println("--------------------------------------------------");

        Pc_Runner3 po_runner3 = new Pc_Runner3();

        po_runner3.run((int pmi_x) -> {
            System.out.println("Hello");
            System.out.println("Goodbye");
            return pmi_x + 5;
        });

        po_runner3.run((int pmi_x) -> pmi_x + 10);
        po_runner3.run((pmi_x) -> pmi_x + 15);
        po_runner3.run(pmi_x -> pmi_x + 20);
        System.out.println("--------------------------------------------------");

        Pc_Runner4 po_runner4 = new Pc_Runner4();

        po_runner4.run((int pmi_x, int pmi_y) -> {
            System.out.println("Hello");
            System.out.println("Goodbye");
            return pmi_x + pmi_y + 5;
        });

        po_runner4.run((pmi_x, pmi_y) -> pmi_x + pmi_y + 20);
        System.out.println("--------------------------------------------------");

        final int PMI_A = 300;
        po_runner4.run((pmi_x, pmi_y) -> pmi_x + pmi_y + 20 + PMI_A); // В лямбда-выражение можно использовать внешние переменные, но только константы.
        System.out.println("--------------------------------------------------");

    }
}

interface Pi_Executable2 {
    int pf_executable();
}

class Pc_Runner2 {
    public void run(Pi_Executable2 e) {
        int pmi_i = e.pf_executable();
        System.out.println("pmi_i = " + pmi_i);
    }
}


interface Pi_Executable3 {
    int pf_executable(int pmi_x);
}

class Pc_Runner3 {
    public void run(Pi_Executable3 e) {
        int pmi_i = e.pf_executable(100);
        System.out.println("pmi_i = " + pmi_i);
    }
}


interface Pi_Executable4 {
    int pf_executable(int pmi_x, int pmi_y);
}

class Pc_Runner4 {
    public void run(Pi_Executable4 e) {
        int pmi_i = e.pf_executable(100, 200);
        System.out.println("pmi_i = " + pmi_i);
    }
}



