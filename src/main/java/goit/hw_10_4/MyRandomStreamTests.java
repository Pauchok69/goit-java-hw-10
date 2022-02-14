package goit.hw_10_4;

import java.util.stream.Collectors;

public class MyRandomStreamTests {
    public static void main(String[] args) {
        System.out.println("MyRandomStream.getStreamOfRandomNumbers(10, 20, 30, 0)\n                .limit(20)\n                .collect(Collectors.toList()) = "
                + new MyRandomStream(25214903917L, 11, 2^48, 0)
                .getStreamOfRandomNumbers()
                .limit(200)
                .collect(Collectors.toList()));
    }
}
