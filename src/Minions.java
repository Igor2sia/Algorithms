import static java.lang.String.format;

public class Minions {
    private final String name;
    private final int age;

    public Minions(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return format("Name %s, age %d", name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minions minions = (Minions) o;
        return name.equals(minions.name);
    }
}