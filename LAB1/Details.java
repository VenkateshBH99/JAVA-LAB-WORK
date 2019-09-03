import java.util.Scanner;
public class Details{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String[] name=new String[30];
		int[] age=new int[10];
		String[] course=new String[30];
		String[] year=new String[30];
		String[] sec=new String[30];
		int ch=0;
		int x=0;
        start:
		do{
			System.out.println("****STUDENT MENU*****");
			System.out.println("1.Add Students\n2.View all Students Details\n3.Search a Student Details\n4.Exit");
			System.out.print("enter ur choice:");
			ch=sc.nextInt();
			switch(ch){
				case 1: for(int z=x;z<30;z++){
				          System.out.print("Full name:");
				          name[z]=sc.next();
				          System.out.print("Age:");
				          age[z]=sc.nextInt();
				          System.out.print("course:");
				          course[z]=sc.next();
				          System.out.print("year:");
				          year[z]=sc.next();
				          System.out.print("section:");
				          sec[z]=sc.next();
				          System.out.println();
				          x++;
				           break;
				          }break;
				case 2: for(int i=0;i<x;i++){
				          System.out.println("Full name:"+name[i]+", Age:"+age[i]+", course: "+course[i]+
				                              ", year:"+year[i]+", section:"+sec[i]);
				                              }
				                              break;
				case 3:  System.out.println("Enter Student name which u want to search:");                            
				          String name1=sc.next();
				          boolean t=true;
				          if(t==true){
				          
				          for(int i=0;i<x;i++)
				          {
				             if(name1.equals(name[i])){
				                 System.out.println("Full name:"+name[i]+", Age:"+age[i]+", course"+course[i]+
				                              ", year:"+year[i]+", section:"+sec[i]);
				                              continue start;}
				                
				                
				                  
		
				          
				         }
				         t=false;
				         }
				          if(t==false){
				                      System.out.println("Search not found/name is incorrect!!");
				                      }
				                      break;
				        
				       case 4:break;
				       default: break;                       
				                            
				          

			}
		}while(ch<4);
	}


}