public class Minions {
    private final String name;

    public Minions(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Minions{" + "name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minions minions = (Minions) o;
        return name.equals(minions.name);
    }
}