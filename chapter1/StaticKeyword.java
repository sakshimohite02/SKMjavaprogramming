package chapter1;

public class StaticKeyword {
    static int i=10;
    static int count=0;
    void Demo(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args) {
        StaticKeyword a=new StaticKeyword();
        System.out.println("value"+a.i); 
    }
    
}
