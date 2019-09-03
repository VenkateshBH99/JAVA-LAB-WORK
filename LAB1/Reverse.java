import java.util.Scanner;
class Reverse{
  public static void main(String[]args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of characters to be entered");
     
     int n=sc.nextInt();
     
     int ch[]=new int[n];
     
     int b[]=new int[n];
     
     
     
     for(int i=0;i<n;i++)
     {
         System.out.println("enter the integer");
         
        ch[i]= sc.nextInt();
     }
        
        System.out.println("reversed:");
        
        int i,j;
   
        for(i=0,j=ch.length-1;i<ch.length && j>=0;i++,j--)
        {
              b[i]=ch[j];
         }
    for(int s:b)
    {
       System.out.print(s+" ");
       }
    
   }
}