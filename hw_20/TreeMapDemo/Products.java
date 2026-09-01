package hw_20.TreeMapDemo;

import java.util.TreeMap;
import java.util.Map;

public class Products {
    public static void main(String[] args) {
        Map<String, Double> prices = new TreeMap<>();
        prices.put("Milk", 5.0);
        prices.put("Flour", 1.0);
        prices.put("Water", 2.0);
        prices.put("Bread", 3.0);
        prices.put("Cola", 7.0);
        prices.put("Meat", 15.0);

        int percent = 10;

        for (String price : prices.keySet()) {
            double value = prices.get(price);
            double newValue = value * (1 + percent / 100.0);
            prices.put(price, newValue);
        }
        System.out.println("updated prices: " + prices);
    }
}
