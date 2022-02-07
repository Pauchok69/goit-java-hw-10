package goit.hw_10_2;

import java.util.Arrays;
import java.util.List;

public class SortedListTests {
    static String text = "Lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Ut enim ad minim veniam quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur Excepteur sint occaecat cupidatat non proident sunt in culpa qui officia deserunt mollit anim id est laborum";
    static List<String> stringList = Arrays.asList(text.split(" "));

    public static void main(String[] args) {
        System.out.println("stringList = " + stringList);

        ListSorter listSorter = new ListSorter();
        System.out.println("listSorter.getSortedListFrom(stringList) = " + listSorter.getSortedListFrom(stringList));
    }
}
