import java.util.Scanner;
import java.util.Arrays;
public class Dupli{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		char[] c=str.toCharArray();
		Arrays.sort(c);
		/**for(char s:c){
			System.out.println(s);
		}**/
		int count;
		/**for(int i=0;i<c.length-1;i++){
			count=1;
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					count++;
					i=j;
				}
			}
			if(count>1){
				System.out.println(c[i]+" repeated : "+count+"times");
			}
		}**/
		count=1;
		for(int i=0;i<c.length-1;i++){
			
			if(c[i]==c[i+1]){
			count++;}
			if(c[i]!=c[i+1]){
			if(count>1){
				System.out.println(c[i]+" repeated : "+count+"times");
			}
			count=1;
			}
		}


	}
}