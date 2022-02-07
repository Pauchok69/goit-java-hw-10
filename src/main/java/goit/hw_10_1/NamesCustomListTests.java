package goit.hw_10_1;

import java.util.List;
import java.util.stream.Collectors;

public class NamesCustomListTests {
    public static void main(String[] args) {
        List<String> namesList = TestNamesList
                .getNamesList()
                .stream()
                .limit(100)
                .collect(Collectors.toList());

        System.out.println("new NamesCustomList().getCustomListFrom(namesList) = " + new NamesCustomList().getCustomListFrom(namesList));
    }
}
