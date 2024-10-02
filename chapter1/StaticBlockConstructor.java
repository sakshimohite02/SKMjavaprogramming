package chapter1;

public class StaticBlockConstructor  {
    static {
        System.out.println("Static constructor (static block) called");
    }

    public static void main(String[] args) {
        System.out.println("Main method called");
    }
}