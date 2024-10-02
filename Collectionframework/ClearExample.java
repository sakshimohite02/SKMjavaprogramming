package Collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class ClearExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        collection.add("Banana");

        collection.clear();
        System.out.println("Collection after clearing: " + collection);
    }
}