package about.staticc.innerr.classes;

import about.staticc.innerr.classes.InnerClass1.MethodLocalInnerClass;

public class InnerClass2 {

	public static void main(String args[])
	{
		InnerClass1.StaticNestedClass ic1 = new InnerClass1.StaticNestedClass();
		ic1.setStaticNestedClassVariable(10);
		System.out.println(ic1.getStaticNestedClassVariable());
		
		InnerClass1 ic = new InnerClass1();
		MethodLocalInnerClass mlic = ic.new MethodLocalInnerClass();
	}
	
}
