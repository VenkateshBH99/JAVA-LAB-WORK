interface Aclass{
	void connect();
	abstract void disconnect();
	
}
class B1 implements Aclass{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("B1 connect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("B1 disconnect");
	}

}
class C1 implements Aclass{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("C1 connnect");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("C1 disconnect");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj=new B1();
		obj.connect();
		obj.disconnect();
		C1 obj1=new C1();
		obj1.connect();
		obj1.disconnect();
		Aclass obj2=new B1();
		obj2.connect();
		obj2.disconnect();

	}

}
