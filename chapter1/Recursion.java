package chapter1;

public class Recursion {
    int fib(int n){
     if(n==0){                
        return 0;
    }
     else if(n==1){
        return 1;
     }
     else {
        return fib(n-1)+ fib (n-2);
     }
    }
    public static void main(String[] args) {
       int  i;
        int n=Integer.parseInt(args[0]);
        Recursion obj =new Recursion();
        for(i=0;i<n;i++){
            System.out.println(obj.fib(i));
        }

    }
    
}
