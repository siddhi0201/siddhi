package practiceSet;

import java.util.Scanner;

public class Pallindrome {
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	
	String s1 = sc.next();
	
	int i = 0;
	int j = s1.length()-1;
	
	if(s1.charAt(i) == s1.charAt(j))
	{
		System.out.println("s1 is pallindrome"+" "+s1);
	}
	
	else
	{
	System.out.println("s1 is not a pallindrome"+" "+s1);
	}
	i++;
	j++;

	}	

}
