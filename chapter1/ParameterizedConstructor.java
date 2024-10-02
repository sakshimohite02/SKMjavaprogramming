package chapter1;

public class ParameterizedConstructor {
    int value;

    public ParameterizedConstructor(int val) {
        value = val;
    }

    public void display() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj = new ParameterizedConstructor(10);
        obj.display();
    }
}
