package chapter1;

public class PrivateConstructor {
    private PrivateConstructor() {
        System.out.println("Private constructor called");
    }

    public static void createInstance() {
        PrivateConstructor obj = new PrivateConstructor();
    }

    public static void main(String[] args) {
        createInstance();
    }
}
