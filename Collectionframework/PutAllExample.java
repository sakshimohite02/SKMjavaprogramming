package Collectionframework;

import java.util.HashMap;
import java.util.Map;

public class PutAllExample {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 1);
        map1.put("Banana", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Mango", 3);

        // Add all entries from map2 to map1
        map1.putAll(map2);
        System.out.println("Map after putAll: " + map1);
    }
}