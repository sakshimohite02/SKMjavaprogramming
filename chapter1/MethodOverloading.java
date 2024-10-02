package chapter1;

public class MethodOverloading {
    public void add(int a,int b){
        int ans=a+b;
        System.out.println("result is"+ans);
    }
    public void add(int a, int b, int c){
        int ans=a+b+c;
        System.out.println("result is"+ans);
    }
}
    class Overload{
        public static void main(String[] args) {
            MethodOverloading m1=new MethodOverloading();
            m1.add(10,20);
            m1.add(10,20,30); 
        }


    }
