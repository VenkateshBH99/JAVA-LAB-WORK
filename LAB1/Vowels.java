import java.util.Scanner;
public class Vowels{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an alphabet");
		char c=sc.next().charAt(0);
		boolean i=false;;
		int b=c;
		if((b>64&&b<91)||(b>96&&b<123)){

		switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': i=true;
              break;
            default : System.out.println("entered char is a CONSONANT");
            break;
        }
        if(i)
        System.out.println("entered char is a Vowel");

	}
	else
		System.out.println("enter only alphabet");
}}
