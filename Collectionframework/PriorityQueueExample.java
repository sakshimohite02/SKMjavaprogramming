package Collectionframework;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Mango");

        System.out.println("PriorityQueue: " + priorityQueue);
    }
}