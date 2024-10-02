package chapter1;

public class StaticMethod {
    static int cube(int x){
        return x*x*x;
    }
    public static void main(String[] args) {
        int r;
        r=StaticMethod.cube(5);
        System.out.println("cube"+r);
    }
    
}