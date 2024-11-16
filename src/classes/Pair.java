package classes;

public class Pair<E, G> {
    private E first;
    private G second;

    public Pair(E first, G second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public G getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair<" + first + ", " + second + ">";
    }
}
