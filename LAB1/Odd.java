import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number of elememts to be entered:");
       int n=sc.nextInt();
       int[] arr=new int[n];
       
       System.out.println("Enter the elements:");
       for(int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
    	   
       }
       System.out.println("entered elements:");
       for(int i=0;i<n;i++) {
    	  System.out.print(arr[i]+" ");
    	   
       }
       System.out.println(" \nreplacing all ODD elements by 1 and all EVEN elelments by 0 :");
       for(int i=0;i<n;i++) {
    	   if(arr[i]%2==0) {
    		   arr[i]=0;
    	   }
    	   else
    		   arr[i]=1;
    	   
       }
       System.out.println("After replacing elements became:");
       for(int i=0;i<n;i++) {
    	   System.out.print(arr[i]+" ");
    	   
       }
       
       
	}

}