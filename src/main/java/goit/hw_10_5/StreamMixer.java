package goit.hw_10_5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMixer {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());
        int minSize = Math.min(firstList.size(), secondList.size());

        Stream.Builder<T> streamBuilder = Stream.builder();

        for (int i = 0; i < minSize; i++) {
            streamBuilder
                    .add(firstList.get(i))
                    .add(secondList.get(i));
        }

        return streamBuilder.build();
    }
}
