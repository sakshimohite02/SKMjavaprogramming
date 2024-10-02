package Collectionframework;

import java.util.ArrayList;
import java.util.Collection;

public class AddAllExample {
    public static void main(String[] args) {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Apple");
        collection1.add("Banana");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Mango");
        collection2.add("Grapes");

        collection1.addAll(collection2);
        System.out.println("Collection after adding all: " + collection1);
    }
}

