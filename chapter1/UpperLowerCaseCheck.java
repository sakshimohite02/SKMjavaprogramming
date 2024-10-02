package chapter1;

public class UpperLowerCaseCheck {
    public static void main(String[] args) {
        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else {
            System.out.println(ch + " is a lowercase letter.");
        }
    }
}