package methodOverloadingRiding;


class Parent
{
	public void method1(int i)
	{
		System.out.println("Return Integer");
	}
	
	public void method2(String s)
	{
		System.out.println("Return String");
	}
}

class Child extends Parent
{	
	public  void method2(int i)
	{
		System.out.println("Return Integer");
	}
}


public class Question1 {
	
	public static void main(String args[])
	{
//		B obj = new B();
		Parent parent = new Child();
		
		parent.method2(null);
//		parent.method2(1); // The method method2(String) in the type Parent is not applicable for the arguments (int)
		parent.method2("sopra");
		
		//java.lang.ClassCastException: methodOverloadingRiding.Parent cannot be cast to methodOverloadingRiding.Child
//		at methodOverloadingRiding.Question1.main(Question1.java:37)
//		Child child = (Child) new Parent(); // type mismatch: cannot convert from Parent to Child
//		child.method2(null);
//		child.method2(1);
//		child.method2("sopra");
		
		Parent par = new Parent();
		par.method2(null);
//		par.method2(1); //// The method method2(String) in the type Parent is not applicable for the arguments (int)
		par.method2("sopra");
		
		Child chi = new Child();
		chi.method2(1);
		chi.method2(null);
		chi.method2("sopra");
	}

}
