import java.util.Scanner;
import java.util.InputMismatchException;
public class Calcu{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter two numbers:");
	  try{

	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  int c=0;
	  System.out.println("1.Addition '+'\n2.Substraction '-'\n3.Multiplication '*'\n4.Division");
	  System.out.print("enter ur choice:");
             int ch=sc.nextInt();
            
            switch(ch){
            	case 1: c=a+b;
            	        System.out.println(a+"+"+b+"="+c);
            	        break;
            	case 2: c=a-b;
            	          System.out.println(a+"-"+b+"="+c);
            	          break;
            	case 3: c=a*b;
            	        System.out.println(a+"*"+b+"="+c);
            	        break;
            	case 4: c=a/b;
            	        System.out.println(a+"/"+b+"="+c);
            	        break;
            	default: System.out.println("Invalid choice!!");
            }
	  }catch(InputMismatchException e){
	  	e.printStackTrace();
	  }catch(ArithmeticException e){
	  	e.printStackTrace();
	  	//System.out.println(e);
	  	
	  }
	}
}