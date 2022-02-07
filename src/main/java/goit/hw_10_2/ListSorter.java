package goit.hw_10_2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorter implements ListSorterInterface {

    @Override
    public List<String> getSortedListFrom(List<String> stringsList) {
        return stringsList
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
