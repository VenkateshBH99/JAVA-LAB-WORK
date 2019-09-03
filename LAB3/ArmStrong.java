import java.util.Scanner;

public class ArmStrong {
     
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
     System.out.println("Enter the min range:");
     int a=sc.nextInt();
     System.out.println("Enter the max range:");
     int b=sc.nextInt();
     for(int i=a+1;i<b;i++) {
    	 int j=0;
    	 int result=0;
    	 int number=i;
    	 
    	 while(number!=0) {
    		 number=number/10;
    		 j++;
    	 }
    	 number=i;
    	 while(number!=0) {
    		 int t=number%10;
    		 result=(int) (result+Math.pow(t, j));
    		 number=number/10;
    		 
    	 }
    	 if(result==i) {
    		 System.out.print(i+" ");
    	 }
     }
     
	}

}
