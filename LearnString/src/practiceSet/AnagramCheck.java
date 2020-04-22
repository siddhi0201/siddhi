package practiceSet;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String args[])
	{
	 String s1 = "MotherInLaw";
	 String s2 = "HitlerWoman";
	 boolean status = true;
	 if(s1.length()!= s2.length())
	 {
		 status = false;
	 }
	 
	 char[] a1 = s1.toLowerCase().toCharArray();
	 char[] a2 = s2.toLowerCase().toCharArray();
	 Arrays.sort(a1);
	 Arrays.sort(a2);
	 
	 status = Arrays.equals(a1, a2);
	 if(status)
	 {
		 System.out.println(s1 + " and " + s2 + " are anagrams");
	 }
	 else
	 {
	 	System.out.println(s1 + " and " + s2 + " are not anagrams");
	 }
	}

}
