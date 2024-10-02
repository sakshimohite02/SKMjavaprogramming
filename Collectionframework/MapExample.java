package Collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 30);
        ages.put("Alice", 25);
        ages.put("Bob", 35);

        System.out.println("Ages Map: " + ages);
    }
}
