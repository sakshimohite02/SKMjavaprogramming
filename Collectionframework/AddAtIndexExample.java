package Collectionframework;

import java.util.ArrayList;
import java.util.List;

public class AddAtIndexExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        // Insert "Mango" at index 1
        list.add(1, "Mango");
        System.out.println("List after adding at index 1: " + list);
    }
}
