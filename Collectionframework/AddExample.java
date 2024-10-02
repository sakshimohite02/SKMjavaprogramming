package Collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class AddExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Apple");
        System.out.println("Collection after adding: " + collection);
    }
}