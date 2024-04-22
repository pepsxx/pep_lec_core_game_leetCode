package Pp_T02.Pp_L11_Comparator;

import java.util.*;

public class Pc_Test {
    //https://www.youtube.com/@alishevN
    //Продвинутая Java: Интерфейс Comparator.
    public static void main(String[] args) {
        List<String> poLi_animals = new ArrayList<>();
        poLi_animals.add("dog");
        poLi_animals.add("elephant");
        poLi_animals.add("cat");
        poLi_animals.add("frog");
        poLi_animals.add("bird");
        poLi_animals.add("Dog");
        poLi_animals.add("Elephant");
        poLi_animals.add("Cat");
        poLi_animals.add("Frog");
        poLi_animals.add("Bird");

        Collections.sort(poLi_animals); // Сортирует, по естественному порядку (по алфавиту).
        System.out.println("poLi_animals = " + poLi_animals);
        Collections.sort(poLi_animals, new Pc_StringLengthComparator());
        System.out.println("poLi_animals = " + poLi_animals);
        System.out.println("--------------------------------------------------");


        List<Integer> poLi_numbers = new ArrayList<>();
        poLi_numbers.add(5);
        poLi_numbers.add(0);
        poLi_numbers.add(500);
        poLi_numbers.add(100);

        Collections.sort(poLi_numbers); // Сортирует, по естественному порядку (по возрастанию).
        System.out.println("poLi_numbers = " + poLi_numbers);
        Collections.sort(poLi_numbers, new Comparator<Integer>() { // Пример использования анонимного класса.
            @Override                                              //
            public int compare(Integer o1, Integer o2) {           //
                if (o1 > o2) return -1;                            //
                else if (o1 < o2) return 1;                        //
                else return 0;                                     //
            }                                                      //
        });                                                        //

        System.out.println("poLi_numbers = " + poLi_numbers);
        System.out.println("--------------------------------------------------");

        List<Pc_Person> poLi_people = new ArrayList<>();
        poLi_people.add(new Pc_Person(3, "Bob"));
        poLi_people.add(new Pc_Person(2, "Katy"));
        poLi_people.add(new Pc_Person(1, "Mike"));

        Collections.sort(poLi_people, new Comparator<Pc_Person>() {
            @Override
            public int compare(Pc_Person o1, Pc_Person o2) {
                if (o1.getPgi_id() > o2.getPgi_id()) {
                    return 1;
                } else if (o1.getPgi_id() < o2.getPgi_id()) {
                    return -1;
                } else return 0;
            }
        });
        System.out.println("poLi_people.toString() = " + poLi_people.toString());
        System.out.println("--------------------------------------------------");
    }
}

class Pc_StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) { // Конвенция по возвращенному числу появляется понимание o1 > или < 02
        // o1 >  o2 => 1;
        // o2 <  o2 => -1;
        // 01 == o2 => 0;

        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

//class Pc_BackwardsIntegerComparator implements Comparator<Integer> { // Код заменен анонимным классом.
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        if (o1 > o2) return -1;
//        else if (o1 < o2) return 1;
//        else return 0;
//    }
//}

class Pc_Person {
    private int pgi_id;
    private String pgSt_name;

    public Pc_Person(int pgi_id, String pgSt_name) {
        this.pgi_id = pgi_id;
        this.pgSt_name = pgSt_name;
    }

    public String toString() {
        return "Pc_Prerson{" +
                "pgi_id=" + pgi_id +
                ", pgSt_name='" + pgSt_name + '\'' +
                '}';
    }

    public int getPgi_id() {
        return pgi_id;
    }
}
