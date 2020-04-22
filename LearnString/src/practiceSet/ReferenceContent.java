package practiceSet;

public class ReferenceContent {

	
	public static void main(String args[])
	{
	String s1 = new String("abc");
	String s2 = new String("abc");
	String s3 = "abc";
	String s4 = "abc";
	String s5 = "xyz";
	
	System.out.println(s3.equals(s3));
	System.out.println(s3==s4);
	System.out.println(s3==s5);
	
	System.out.println(""+s1);
	System.out.println(""+s2);
	System.out.println(""+s3);
	System.out.println(""+s4);
	
	System.out.println(s1==s2); //false
	System.out.println(s1.equals(s2)); //true
	System.out.println(s1==s3); //false
	System.out.println(s1.equals(s3)); //true
	System.out.println(s3==s4); //true
	System.out.println(s3.equals(s4)); //true
	System.out.println(s1==s4); //false
	System.out.println(s1.equals(s4)); //true
	
	}
}
