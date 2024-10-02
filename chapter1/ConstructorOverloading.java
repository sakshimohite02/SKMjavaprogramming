package chapter1;

public class ConstructorOverloading {
    int num;
    ConstructorOverloading(){
        num=10;
    }
    ConstructorOverloading(int x){
        x=num;

    }
    void Display(){
        System.out.println("value"+num);
    }
}
    class Demo{
        public static void main(String[] args) {
            ConstructorOverloading obj=new ConstructorOverloading();
            ConstructorOverloading obj2=new ConstructorOverloading(52);
            obj.Display();
            obj2.Display();

        }

    }
    
    

    

