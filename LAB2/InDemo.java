interface A{
	void m1();
}
interface B{
	void m1();
}
interface A1 extends A,B{
	void m2();
}
class D{
	void m1() {
		System.out.println("Hello class D in method 1");
	}
}
class C extends D implements A,B,A1{
    @Override
    public void m1() {
    	System.out.println("Hello class C in method 1");
    }
	@Override
	public void m2() {
		System.out.println("Hello class C in method 2");
		
	}
	
}
public class InDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      D obj=new D();
      C obj1=new C();
      D obj2=new C();
      obj.m1();
      obj1.m1();
      obj1.m2();
      obj2.m1();
      
	}

}
