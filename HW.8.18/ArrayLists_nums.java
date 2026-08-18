import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ArrayLists_nums {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 5, 58, 0, 58, 75));
        ArrayList<Integer> numbers_copy = new ArrayList<>(numbers);

        Collections.reverse(numbers);
        System.out.println(numbers);

        try {
            Collections.swap(numbers, 1, 3);
            System.out.println("after swap " + numbers);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("error, index out of bounds");
        }

        for (int num : numbers) {
            System.out.println(num);
        }

        numbers.sort(null);
        System.out.println("sorted list " + numbers);

        LinkedHashSet<Integer> noDuplicates = new LinkedHashSet<>(numbers);
        numbers.clear();
        numbers.addAll(noDuplicates);
        System.out.println("after removing duplicates: " + numbers);

        ArrayList<Integer> common = new ArrayList<>(numbers);
        common.retainAll(numbers_copy);
        System.out.println("common numbers: " + common);

        System.out.println("largest num: " + Collections.max(numbers));

        ArrayList<Integer> combined = new ArrayList<>(numbers);
        combined.addAll(numbers_copy);
        combined.sort(null);
        System.out.println("combined: " + combined);

        int secondLargest = numbers.get(numbers.size() - 2);
        System.out.println("second largest num: " + secondLargest);
    }
}