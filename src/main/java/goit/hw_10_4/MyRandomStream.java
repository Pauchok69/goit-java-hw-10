package goit.hw_10_4;

import java.util.stream.Stream;

public class MyRandomStream implements MyRandomStreamInterface {
    long a;
    long c;
    long m;
    long seed;

    public MyRandomStream(long a, long c, long m, long seed) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.seed = seed;
    }

    @Override
    public Stream<Long> getStreamOfRandomNumbers() {
        MyRandom myRandom = new MyRandom(a, c, m);

        return Stream.iterate(seed, myRandom::next);
    }
}
