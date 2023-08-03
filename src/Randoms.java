import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    Random random = new Random();
    private int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true; // т.к. цикл бесконечный
            }

            @Override
            public Integer next() {
                return random.nextInt(max - min + 1) + min;
            }
        };
    }
}
