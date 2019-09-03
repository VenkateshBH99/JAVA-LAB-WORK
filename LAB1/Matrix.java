import java.util.Scanner;
class Calcul{
	public void add(int n,int m,int sum[][],int a[][],int b[][]){
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	public void sub(int n,int m,int sum[][],int a[][],int b[][]){
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum[i][j]=a[i][j]-b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	public void trans(int n,int m,int c[][],int a[][]){
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]=a[j][i];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	public void search(int n,int m,int a[][],int k) {
		boolean t=false;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			  if(a[i][j]==k) {
			      t=true;
				  System.out.println("Element:"+k+" found at postion: ("+i+","+j+")");
			  }
			}
			
		}
		if(t==false){
		System.out.println("Element not found in this matrix");
		
	}
	
}

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Calcul ca=new Calcul();
		System.out.println("Enter the size of the matrix nxm:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] a=new int[n][m];
		int[][] b=new int[n][m];
		int[][] sum=new int[n][m];
		int[][] c=new int[m][n];
		System.out.println("enter the elements of the first matrix");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
      System.out.println("enter the elements of the second matrix");
      for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				b[i][j]=sc.nextInt();
			}
		}
      System.out.println("Fist matrix is:");
      for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
      System.out.println("Second matrix is:");
      for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
			
		}
      System.out.println("1.Addition\n2.Substraction\n3.transpose of FIRST matrix\n4.transpose of SECOND matrix\n5.search the element in First matrix"
      		+ "\n6.search the element in SECOND matrix");
      System.out.print("ENTER THE CHOICE:");
      int ch=sc.nextInt();
      switch(ch) {
      case 1: ca.add(n,m,sum,a,b);
             break;
      case 2: ca.sub(n, m, sum, a, b);
              break;
      case 3: ca.trans(n, m, c, a);
    	      break;
      case 4: ca.trans(n, m, c, b);
              break;
      case 5: System.out.println("Enter the element to search in First matrix:");
               int k=sc.nextInt();
    	    ca.search(n, m, a, k);
    	     break;
      case 6:System.out.println("Enter the element to search in SECOND matrix:");
             int k1=sc.nextInt();
              ca.search(n, m, b, k1);
                break;
       default:System.out.println("***INVALID CHOICE*****");
      }
      
     
	}
	
}