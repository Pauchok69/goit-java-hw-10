package goit.hw_10_1;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class NamesCustomList implements NamesCustomListInterface {
    @Override
    public String getCustomListFrom(List<String> namesList) {
        AtomicInteger counter = new AtomicInteger(0);

        List<String> resultList = namesList
                .stream()
                .map(n -> counter.incrementAndGet() + ". " + n)
                .filter(n -> counter.get() % 2 == 1)
                .collect(Collectors.toList());

        return String.join(", ", resultList);
    }
}
