package chapter1;

public class ThisKeyword {
    int x;
    ThisKeyword(int x){
        this.x=x;
    }
    public static void main(String[] args) {
        ThisKeyword a=new ThisKeyword(5);
        System.out.println("value"+a.x);
    }

    
}
