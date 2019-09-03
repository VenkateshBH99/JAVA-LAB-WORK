package Single;
class A{
	private static A var=null;
	public String s;
	private A(){
		s="Hello I am a string of A class";
		System.out.println(this.s+"k");
	}
	public static A getInstance() {
		if(var==null) {
		  var=new A();
		}
	return var;
	}
}
public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1=A.getInstance();
		A obj2=A.getInstance();
		A obj3=A.getInstance();
	    obj1.s=obj1.s.toUpperCase();
		System.out.println(obj3.s);
		obj3.s=obj3.s.toLowerCase();
		System.out.println(obj2.s);

	}

}
