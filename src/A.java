
public class A {
	
	private A()
	{
		System.out.println("inside constructor");
	}
	public static void main(String [] args)
	{
		A aRef1= new A();
		
		A aRef2= new A();
	}
	
}
