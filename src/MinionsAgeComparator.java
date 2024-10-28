import java.util.Comparator;

public class MinionsAgeComparator implements Comparator<Minions> {

    @Override
    public int compare(Minions o1, Minions o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else return 0;
    }
}
