 
class A{
	public void prin(){
	System.out.println("Hello Class A");
    }
    public void prin(int a,int b){
    	System.out.println(a+", "+b);
    }
    public void prin(float a,float b,int c){
    	System.out.println(a+", "+b+", "+c);
    }
 }
 class B extends A{
 	//@Override
 	public void prin(){
 		System.out.println("Hello Class B");
 	} 
 }
 class C extends A{
 	 @Override
 	 public void prin(){
 	 	System.out.println("Hello Class C");
 	 }
 }
 class D extends B{
 	@Override
 	public void prin(){
 	   super.prin();
 		System.out.println("Hello Class D");

 	}
 }
 public class Inherit{

 	 public static void main(String[] args) {
 	     A obj=new A();

 	     B obj1=new B();
 	     C obj2=new C();
 	     D obj3=new D();
 	     obj.prin();
 	     obj1.prin();
 	     obj2.prin();
 	     obj3.prin();
 	     A a=new B();
 	     //B b=new A();
 	     a.prin();
 	     //b.prin();
 	     obj.prin(3,4);
 	     obj.prin(3F,4F,5);

 	}
 }
