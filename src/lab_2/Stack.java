import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        DoubleLinkedList<Minions> list = new DoubleLinkedList<>();
//        list.addToTail(new Minions("Филипп", 19));
//        list.addToTail(new Minions("Артём", 19));
//        list.addToTail(new Minions("Даня", 20));
//        list.print();
//        System.out.println("\n");
//        list.addToHead(new Minions("Моcкич", 15));
//        list.print();
//        list.removeHead();
//        System.out.println("\n");
//        list.remove(new Minions("Филипп", 19));
//        list.print();
//        System.out.println("\n");
//        list.edit(new Minions("Артём", 19), new Minions("Паша", 23));
//        list.print();

//        Comparator<Minions> mcomp = new MinionsComparator().thenComparing(new MinionsAgeComparator());
//        TreeSet<Minions> minions = new TreeSet<>(mcomp);
//        minions.add(new Minions("Филипп", 19));
//        minions.add(new Minions("Артём", 19));
//        minions.add(new Minions("Даня", 20));
//        minions.add(new Minions("Моcкич", 15));
//        minions.add(new Minions("Моcкич", 3));
//
//        for(Minions  o : minions){
//
//            System.out.println(o.getName() + " " + o.getAge());
//        }
        Stack stack = new Stack<>(10);
        stack.fullstack(stack);
        System.out.println(stack.getElement(7)); // выведет цифру 2
        System.out.println(stack.getElement(9)); // выведет цифру 0
        System.out.println();
        stack.printStack();



    }
}
