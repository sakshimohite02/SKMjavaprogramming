package chapter1;

public class AllVariable {
    static int z=30;
    int x=30;
    public void m1(){
        int a=50;
    }
    public static void main(String[] args) {
        AllVariable t= new AllVariable();
        AllVariable t2= new AllVariable();
        //System.out.println(x);
        //System.out.println(t.x);
        //System.out.println(AllVariable.z);
        //System.out.println(y);
        System.out.println(t.a);
    }
    
}
