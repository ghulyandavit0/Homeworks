import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedLists_str {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Davit", "Arsen", "Levon"));
        Collections.reverse(list);
        System.out.println("reversed list: " + list);

        String middleValue = list.get(list.size() / 2);
        System.out.println("middle node of the list: " + middleValue);

        LinkedList<String> reversed = new LinkedList<>(list);
        Collections.reverse(reversed);
        boolean isPalindrome = list.equals(reversed);
        System.out.println(isPalindrome);

        LinkedHashSet<String> noDuplicates = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(noDuplicates);
    }
}
