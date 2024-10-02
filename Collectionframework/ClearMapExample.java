package Collectionframework;

import java.util.HashMap;
import java.util.Map;

public class ClearMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        
        System.out.println("Map before clear: " + map);
        map.clear();  // Removes all entries
        System.out.println("Map after clear: " + map);
    }
}
