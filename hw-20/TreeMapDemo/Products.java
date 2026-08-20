import java.util.TreeMap;
import java.util.Map;

public class Products {
    public static void main(String[] args) {
        Map<String, Integer> prices = new TreeMap<>();
        prices.put("Milk", 5);
        prices.put("Flour", 1);
        prices.put("Water", 2);
        prices.put("Bread", 3);
        prices.put("Cola", 7);
        prices.put("Meat", 15);

        int percent = 10;

        for (String price : prices.keySet()) {
            int value = prices.get(price);
            int newValue = (int) (value * (1 + percent / 100.0));
            prices.put(price, newValue);
        }
        System.out.println("updated prices: " + prices);
    }
}
