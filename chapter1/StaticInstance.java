package chapter1;

public class StaticInstance {
    static int t=20;
    int p=45;
    public static void main(String[] args) {
        StaticInstance t =new StaticInstance();   
     System.out.println(t.p);
     System.out.println(new StaticInstance().p);
    }
    
}
