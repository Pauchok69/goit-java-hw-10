package goit.hw_10_5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMixerTests {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("Foo", "Bar", "Buzz", "FooBar", "BarBuzz", "FooBarBuzz");
        Stream<String> streamB = Stream.of("1", "2", "3", "4", "5");

        System.out.println("StreamMixer.zip(streamA, streamB) = " + StreamMixer.zip(streamA, streamB).collect(Collectors.toList()));
    }
}
