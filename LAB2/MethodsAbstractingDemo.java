
abstract class Car{
	int cno;
	String name;
	abstract void mailege();
	abstract void speed();
	
	void print()
	{
		System.out.println("Car Details");
	}
}
abstract class Santro extends Car{
	
	   
	@Override
	void mailege() {
		
		System.out.println("SANTRO mailege");
	}
	@Override
	void print() {
		System.out.println("car details 1");
	}
}
 class SantroCLient extends Santro{
	 
	@Override
	void speed() {
		
	System.out.println("SantroClient speed");	
	}
}

public class MethodsAbstractingDemo {

	public static void main(String[] args) {
		//Car ob1=new Car();
		//Santro ob=new Santro();
		SantroCLient s=new SantroCLient(); 
	   s.speed();
	   s.mailege();
	   s.print();

	}

}
