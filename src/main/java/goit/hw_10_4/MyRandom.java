package goit.hw_10_4;

public class MyRandom {
    private final long a;
    private final long c;
    private final long m;

    public MyRandom(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    public Long next(long seed) {
        return (a * seed + c) % m;
    }
}
