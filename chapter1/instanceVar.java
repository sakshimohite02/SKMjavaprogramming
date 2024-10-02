package chapter1;

public class instanceVar {
	   int x=20;
	    public static void main(String[]args){
	       
	        instanceVar t=new instanceVar();
	        instanceVar s=new instanceVar();
	    t.x=t.x+20;
	    System.out.println(s.x);
	}
	    
	}
