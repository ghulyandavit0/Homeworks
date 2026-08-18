import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {
    public static ArrayList<Integer> copyValues(HashMap<String, Integer> map) {
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Davit", 20);
        ages.put("Arsen", 6);
        ages.put("Arman", 87);

        ArrayList<Integer> values = copyValues(ages);
        System.out.println(values);
    }
}
