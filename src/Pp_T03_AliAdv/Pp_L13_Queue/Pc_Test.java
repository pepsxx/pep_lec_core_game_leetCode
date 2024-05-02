package Pp_T03_AliAdv.Pp_L13_Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Очередь Queue.
    public static void main(String[] args) {
        Pc_Person po_people1 = new Pc_Person(1);
        Pc_Person po_people2 = new Pc_Person(2);
        Pc_Person po_people3 = new Pc_Person(3);
        Pc_Person po_people4 = new Pc_Person(4);

        // Queue - Первый зашел, первый вышел.
        //Queue<Pc_Person> poQu_people = new LinkedList<>(); // Очередь без ограничения.
        Queue<Pc_Person> poQu_people = new ArrayBlockingQueue<>(3); // Очередь с ограничением.

        System.out.println("poQu_people.add(po_people3) = " + poQu_people.add(po_people3)); // Добавляет элемент в очередь.
        System.out.println("poQu_people.add(po_people2) = " + poQu_people.add(po_people2)); // Добавляет элемент в очередь.
        System.out.println("poQu_people.add(po_people4) = " + poQu_people.add(po_people4)); // Добавляет элемент в очередь.
        System.out.println("poQu_people.offer(po_people1) = " + poQu_people.offer(po_people1)); // Добавляет элемент в очередь. offer Возвращает специальное значение.
        System.out.println("--------------------------------------------------");

        for (Pc_Person po_Person : poQu_people)
            System.out.println("po_Person = " + po_Person);
        System.out.println("--------------------------------------------------");

        System.out.println("poQu_people.remove() = " + poQu_people.remove()); // Удаляет элемент из очереди.
        for (Pc_Person po_Person : poQu_people)
            System.out.println("po_Person = " + po_Person);
        System.out.println("--------------------------------------------------");

        System.out.println("poQu_people.peek() = " + poQu_people.peek());    // Показывает элемент в очереди.
        for (Pc_Person po_Person : poQu_people)
            System.out.println("po_Person = " + po_Person);
        System.out.println("--------------------------------------------------");

        //              Действие при ошибке
        // Выбрасывает исключение | Возвращает специальное значение
        // add                    |offer                            - Добавляет элемент в очередь.
        // remove                 |poll                             - Удаляет элемент из очереди.
        // element                |peek                             - Показывает элемент в очереди.
    }
}

class Pc_Person {
    private int pgi_id;

    public Pc_Person(int pgi_id) {
        this.pgi_id = pgi_id;
    }

    public String toString() {
        return "Pc_Prerson{" +
                "pgi_id=" + pgi_id +
                '}';
    }
}