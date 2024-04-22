package Pp_T02.Pp_L14_Stack;

import java.util.List;
import java.util.Stack;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Стек Stack.
    public static void main(String[] args) {
        Stack<Integer> poSt_stack = new Stack<>();
        // Queue - Последний зашел, первый вышел.

        poSt_stack.push(5);
        poSt_stack.push(3);
        poSt_stack.push(1);

        for (Integer pmi_i : poSt_stack)
            System.out.println("pmi_i = " + pmi_i);
        System.out.println("--------------------------------------------------");

        System.out.println("poSt_stack.pop() = " + poSt_stack.pop());

        for (Integer pmi_i : poSt_stack)
            System.out.println("pmi_i = " + pmi_i);
        System.out.println("--------------------------------------------------");

        System.out.println("poSt_stack.peek() = " + poSt_stack.peek());

        for (Integer pmi_i : poSt_stack)
            System.out.println("pmi_i = " + pmi_i);
        System.out.println("--------------------------------------------------");

        while (!poSt_stack.empty()) // empty - boolean - Пустой или нет.
            System.out.println("poSt_stack.pop() = " + poSt_stack.pop());
        System.out.println("--------------------------------------------------");

        // Действие при ошибке.
        // Выбрасывает исключение.
        // push                   - Добавляет элемент в очередь.
        // pop                    - Удаляет элемент из очереди.
        // peek                   - Показывает элемент в очереди.
    }
}
