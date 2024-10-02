package chapter1;

class OuterEx{
    int x=10;
    class InnerEx{
        int y=10;
        void Display(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    void Show(){
        InnerEx a=new InnerEx();
        System.out.println("outer Show");
        a.Display();
    }
}
    public class NestedClassEx{
        public static void main(String[] args) {
            OuterEx b=new OuterEx();
            b.Show();
        }
    }
