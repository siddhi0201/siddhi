package practiceSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidString {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		Map<Character,Integer> wordCount = new HashMap<>();
		char[] strArray = word.toCharArray();
		  
        //checking each char of strArray
		boolean status = true;
        for (char c : strArray)
        {
        	
//            if(wordCount.containsKey(c))
//            {
                //If char 'c' is present in charCountMap, incrementing it's count by 1
//            	Integer value = wordCount.get(c)+1;
           	
//            	if(value>2)
//            	{
//            		status = false;
//            	}
            	if(wordCount.containsKey(c))
            	{
            		wordCount.put(c, wordCount.get(c)+1);
            		Integer value = wordCount.get(c);
            		/*if(value >2)
            		{
            			status = false;
            			break;
            		}
            		else if(value )
            		wordCount.remove(c);*/
            	}
            	
            	else 
            	wordCount.put(c, 1);	

            	
            }
        
        for(Map.Entry<Character,Integer> entry : wordCount.entrySet()) {
        	if(m)
        }
        }
        
        System.out.println(status);
//            else
//            {
//                //If char 'c' is not present in charCountMap,
//                //putting 'c' into charCountMap with 1 as it's value
//  
//            	wordCount.put(c, 1);
//            }
        }
        
        
	}


