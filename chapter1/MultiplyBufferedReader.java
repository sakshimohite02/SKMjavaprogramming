package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyBufferedReader {
        public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(reader.readLine());
        
        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(reader.readLine());
        
        int product = num1 * num2;
        System.out.println("Product: " + product);
    }
}
