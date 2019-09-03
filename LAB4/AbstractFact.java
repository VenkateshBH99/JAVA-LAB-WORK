interface Shape{
	void draw();

}
class Circle implements Shape{
	@Override
	public void draw(){
		System.out.println("Draw Circle");
	}
}
class Rectangle implements Shape{
	@Override
	public void draw(){
		System.out.println("Draw Rectangle");
	}
}
interface Color{
	void fill();
}
class Red implements Color{
	@Override
	public void fill() {
		System.out.println("Red color");
		
	}
}
class Blue implements Color{
	@Override
	public void fill(){
		System.out.println("Blue color");
	}
}
abstract class FactoryPro{
       abstract Shape getShape(String str);
       abstract Color getColor(String str);
}
class ShapeFactory extends FactoryPro{
	@Override
	public Shape getShape(String str){
		if(str==null){
			return null;
		}
		else if(str.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		else if (str.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		return null;
	}
	@Override
	public Color getColor(String str){
		return null;
	}
}
class ColorFactory extends FactoryPro{
	@Override
	public Shape getShape(String str){
		return null;
	}
	@Override
	public Color getColor(String str){
		if(str==null){
			return null;
		}
		else if(str.equalsIgnoreCase("red")){
			return new Red();
		}
		else if(str.equalsIgnoreCase("blue")){
			return new Blue();
		}
		return null;
	}
}
class Factory{
	public static FactoryPro getInstance(String str){
		if(str==null){
			return null;
		}
		else if(str.equalsIgnoreCase("Shape")){
			return new ShapeFactory();
		}
		else if(str.equalsIgnoreCase("color")){
			return new ColorFactory();
		}
		return null;
	}

}
public class AbstractFact{
	public static void main(String[] args) {
		FactoryPro obj=Factory.getInstance("Shape");
		Shape s1=obj.getShape("Circle");
		s1.draw();
		FactoryPro obj2=Factory.getInstance("Color");
		Color c1=obj2.getColor("red");
		c1.fill();
	}
}