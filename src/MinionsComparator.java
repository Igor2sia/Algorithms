import java.util.Comparator;

public class MinionsComparator implements Comparator<Minions> {

    @Override
    public int compare(Minions o1, Minions o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
