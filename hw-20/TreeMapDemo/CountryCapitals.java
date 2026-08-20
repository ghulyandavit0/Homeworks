import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class CountryCapitals {
    public static void main(String[] args) {
        Map<String, String> capitals = new TreeMap<>();

        capitals.put("Armenia", "Yerevan");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Egypt", "Cairo");
        capitals.put("Canada", "Ottawa");
        capitals.put("Brazil", "Brasilia");

        for (String country : capitals.keySet()) {
            System.out.println(country + " -> " + capitals.get(country));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a country name: ");
        String input = sc.nextLine();

        if (capitals.containsKey(input)) {
            System.out.println("capital: " + capitals.get(input));
        } else {
            System.out.println("country not found");
        }
    }
}