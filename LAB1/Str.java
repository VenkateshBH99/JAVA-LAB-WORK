import java.util.Scanner;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Str ob=new Str();
		System.out.println("Enter the number of words to be entered");
		int n=sc.nextInt();
		String[] str=new String[n];
		System.out.println("Enter the String");
		for(int i=0;i<n;i++){
		str[i]=sc.next();
		}
		for(int i=0;i<n;i++){
		s=Str.len(str[i]);
		System.out.println("Length of : "+str[i]+" is "+s);
   		
      }
	}
	    public int len(String str){
	    int i=0;
	    try{
	      while(true){
	      str.charAt(i);
	      i++;}
	      }catch(Exception e){
	      return i;
	      }

}
