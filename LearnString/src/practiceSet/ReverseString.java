package practiceSet;

public class ReverseString {
	
	public static void main(String args[])
	{
//		String str = "Siddhi";
//		StringBuilder sb = new StringBuilder(str);
//		sb.reverse().toString();
//		System.out.println(sb);
		
		String str = "siddhi";
		System.out.println(reverseWithStringBuilder(str));
	}

	private static String reverseWithStringBuilder(String str) {
		return new StringBuilder().reverse().toString();
	}

}
