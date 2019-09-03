interface Shape{
	public void Draw();
}

class Circle implements Shape{
	public void Draw(){
		System.out.println("Draw Circle ");
	}
}
class Rectangle implements Shape{
	public void Draw(){
		System.out.println("Draw Rectangle");
	}
}
class Square implements Shape{
	public void Draw(){
		System.out.println("Draw Square ");
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
		ShapeFactory shapefactory=new ShapeFactory();
		Shape S1=ShapeFactory.getShape("Circle");
		S1.Draw();
		Shape S2=Shapefactory.getShape("Rectangle");
		S2.Draw();
		Shape S3=Shapefactory.getShape("Square");
		S3.Draw();


	}
}