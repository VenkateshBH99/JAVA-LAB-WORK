import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
interface Shape {
	
	public void draw(JFrame f,Shape S);
	
}

class Circle extends Canvas implements Shape{
	public void draw(JFrame f,Shape S){
		
		f.add(this);
	}
	public void paint(Graphics g){
		g.drawArc(10,10,50,50,0,360);
		
	}
}
class Rectangle extends Canvas implements Shape{
	public void draw(JFrame f,Shape S){
		
		f.add((Rectangle) S);
	}
	public void paint(Graphics g){
		g.drawRect(100,100,100,90);
		
	}
}
class Square extends Canvas implements Shape{
	public void draw(JFrame f,Shape S){
		
		f.add((Square) S);
	}
	public void paint(Graphics g){
		g.drawRect(100,120,100,100);
	}
}

class ShapeFactory{
	public static Shape getShape(String Str){
		if(Str==null)
		return null;
	else if(Str.equalsIgnoreCase("Circle"))
		return new Circle();
	else if(Str.equalsIgnoreCase("Rectangle"))
		return new Rectangle();
	else
		return new Square();
	}
}

class Factory{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		JFrame f=new JFrame();
		System.out.println("Enter Shape:");
        String st=sc.next();
		ShapeFactory shapefactory=new ShapeFactory();
		Shape S1=ShapeFactory.getShape(st);
		S1.draw(f,S1);
		f.setVisible(true);
	    f.setSize(600,600);
		


	}
}