package StringInterviewQues;

public class Question1 {
	
	
public static void main(String args[])
{
	String str ="siddhi";
	String str2 = str;
	
//	str+"abc"; // invalid assignment operator
	str.concat("monday");
	str2.concat("tuesday");
	
	System.out.println(str);
	System.out.println(str2);
}

}
