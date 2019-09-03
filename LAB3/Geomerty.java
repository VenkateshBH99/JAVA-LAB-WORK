import java.util.Scanner;

interface Shape{
	Scanner sc=new Scanner(System.in);
	void Area();
}
class Circle implements Shape{
	
	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius of the Circle:");
		float r=sc.nextFloat();
		System.out.println("Area of Circle="+(3.14*r*r));
	}
}
class Rectangle implements Shape{
	@Override
	public void Area() {
		System.out.println("Enter the length and breadth of the Rectangle:");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		System.out.println("Area of Rectangle="+(l*b));
	}
}
class Triangle implements Shape{
	@Override
	public void Area() {
		System.out.println("Enter the breadth and heigth of the Triangle:");
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		System.out.println("Area of Triangle="+(0.5*b*h));
	}
}
class Rhombus implements Shape{

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("Enter the length of diagonal 1 and diagonal 2 of Rhombus:");
		float d1=sc.nextFloat();
		float d2=sc.nextFloat();
		System.out.println("Area of Rhombus="+(0.5*d1*d2));
	}
	
}
class Square implements Shape{
	@Override
	public void Area() {
		System.out.println("Enter the length of side of the Square:");
		float a=sc.nextFloat();
		System.out.println("Area of Square="+(a*a));
		
	}
}
class parallelogram implements Shape{

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("Enter the breath and heigth of the parallelogram:");
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		System.out.println("Area of parallelogram="+(b*h));
	}
	
}
class kite implements Shape{

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("Enter the lengths of two diagonals of the Kite:");
		float d1=sc.nextFloat();
		float d2=sc.nextFloat();
		System.out.println("Area of Kite="+(0.5*d1*d2));
	}
	
}
class Trapezoid implements Shape{

	@Override
	public void Area() {
		// TODO Auto-generated method stub
		System.out.println("Enter the lengths of two parallel side and heigth of the Trapezoid");
		float b1=sc.nextFloat();
		float b2=sc.nextFloat();
		float h=sc.nextFloat();
		System.out.println("Area of Trapezoid="+(0.5*h*(b1+b2)));
	}
	
}
public class Geomerty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Circle();
		s1.Area();
		Shape s2=new Rectangle();
		s2.Area();
		Shape s3=new Triangle();
		s3.Area();
		Shape s4=new Rhombus();
		s4.Area();
		Shape s5=new Square();
		s5.Area();
		Shape s6=new parallelogram();
		s6.Area();
		Shape s7=new kite();
		s7.Area();
		Shape s8=new Trapezoid();
		s8.Area();



	}

}
