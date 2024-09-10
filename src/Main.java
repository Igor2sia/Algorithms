public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Minions> list = new DoubleLinkedList<>();
        list.add(new Minions("Филип"));
        list.add(new Minions("Артём"));
        list.add(new Minions("Даня"));
        list.print();
        System.out.println("\n");
        list.remove(new Minions("Даня"));
        list.print();
        System.out.println("\n");
        list.edit(new Minions("Филип"), new Minions("Паша"));
        list.print();
    }
}