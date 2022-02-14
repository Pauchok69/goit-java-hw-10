package goit.hw_10_3;

public class NumericArraySorterTests {
    static String[] numericStrings = {"1, 2, 0", "4, 5"};

    public static void main(String[] args) {
        NumericArraySorter listSorter = new NumericArraySorter();
        System.out.println("listSorter.getSortedListFrom(numericStrings) = " + listSorter.getSortedListFrom(numericStrings));
    }
}
