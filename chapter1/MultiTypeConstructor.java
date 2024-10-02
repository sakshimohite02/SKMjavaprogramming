package chapter1;

public class MultiTypeConstructor {
    int num;
    String name;

    public MultiTypeConstructor(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public void display() {
        System.out.println("Number: " + num + ", Name: " + name);
    }

    public static void main(String[] args) {
        MultiTypeConstructor obj = new MultiTypeConstructor(101, "Sakshi");
        obj.display();
    }
}
