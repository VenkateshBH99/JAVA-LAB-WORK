
class A{
	
	private void B(int a,int b)
	{
		
		System.out.println("a="+a+" b="+b);
	}
	protected void B(int a,int b,int c) {
		System.out.println("a="+a+" b="+b+" c="+c);
	}
	public void B(float a,float b,int c) {
		System.out.println("a="+a+" b="+b+" c="+c);
	}
	 void B(float a,int b,String s) {
		System.out.println("a="+a+" b="+b);
	}
}

public class OverLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.B(2, 3);
		obj.B(1,2,3);
		obj.B(1F, 4F, 5);
		obj.B(3F, 9,"Hello");

	}

}
