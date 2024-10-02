package chapter1;

public class Instance {
    int x=20;
    public static void main(String[] args) {
        Instance t =new Instance();
        Instance s =new Instance();
        Instance v =new Instance();
        s.x=t.x+5;
        System.out.println(s.x);

        

    }
    
}
