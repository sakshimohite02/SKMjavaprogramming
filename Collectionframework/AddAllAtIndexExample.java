package Collectionframework;

import java.util.ArrayList;
import java.util.List;

public class AddAllAtIndexExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        List<String> newItems = new ArrayList<>();
        newItems.add("Mango");
        newItems.add("Grapes");

        // Insert all elements of newItems at index 1
        list.addAll(1, newItems);
        System.out.println("List after adding all at index 1: " + list);
    }
}
