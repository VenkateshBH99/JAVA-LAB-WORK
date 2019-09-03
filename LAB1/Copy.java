import java.util.Scanner;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String:");
     String str=sc.next();
     String str1="";
    for(int i=0;i<str.length();i++) {
    	str1=str1+str.charAt(i);
    }
     System.out.println(str1);
	}

}
