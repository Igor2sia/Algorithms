package lab_1;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Minions> list = new DoubleLinkedList<>();
        list.addToTail(new Minions("Филипп", 19));
        list.addToTail(new Minions("Артём", 19));
        list.addToTail(new Minions("Даня", 20));
        list.print();
        System.out.println("\n");
        list.addToHead(new Minions("Моcкич", 15));
        list.print();
        list.removeHead();
        System.out.println("\n");
        list.remove(new Minions("Филипп", 19));
        list.print();
        System.out.println("\n");
        list.edit(new Minions("Артём", 19), new Minions("Паша", 23));
        list.print();
    }
}