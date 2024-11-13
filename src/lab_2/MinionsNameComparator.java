package lab_2;

import lab_1.Minions;

import java.util.Comparator;

public class MinionsNameComparator implements Comparator<Minions> {

    @Override
    public int compare(Minions o1, Minions o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
