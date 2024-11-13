package lab_2;
import lab_1.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<String> list = new DoubleLinkedList<>();
        list.addToTail("A");
        list.addToTail("B");
        list.addToTail("C");

        // Использование итератора
        for (String item : list) {
            System.out.println(item);
        }

        // Использование индексатора
        System.out.println(list.get(1)); // Вывод: B
        list.set(1, "X");
        System.out.println(list.get(1)); // Вывод: X
    }
}