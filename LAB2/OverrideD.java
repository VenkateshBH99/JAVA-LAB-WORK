

class Aclass{
	public static final int n=3;
	public void B() {
		System.out.println("The value of n="+n);
	}
}
class C extends Aclass{
	public static final int m=4;
	@Override
	public void B() {
		
		System.out.println("The value of n="+n+"The vlaue of m="+m);
	}
}
public class OverrideD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Aclass obj=new Aclass();
     obj.B();
     C obj1=new C();
     obj1.B();
     Aclass obj3=new C();
     obj3.B();
	}

}
