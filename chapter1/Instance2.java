package chapter1;

public class Instance2 {
    int x=20;
    public static void main(String[] args) {
        Instance t =new Instance();
        Instance s =new Instance();
        Instance v =new Instance();
        s.x=t.x+5;
        t.x=s.x+5;
        x=x+5;
        System.out.println(s.x);
        System.out.println(t.x);

        

    }
    
}
