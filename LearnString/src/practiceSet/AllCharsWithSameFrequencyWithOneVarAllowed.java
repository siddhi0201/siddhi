package practiceSet;

//Java program to check if a string can be made 
//valid by removing at most 1 character using hashmap. 
import java.util.HashMap; 
import java.util.Iterator; 
import java.util.Map; 

public class AllCharsWithSameFrequencyWithOneVarAllowed { 
   
 // To check a string S can be converted to a variation 
 // string  
 public static boolean checkForVariation(String str) { 
     if(str == null || str.isEmpty()) { 
         return true; 
     } 
       
     Map<Character, Integer> map = new HashMap<>(); 
       
     // Run loop form 0 to length of string 
     for(int i = 0; i < str.length(); i++) { 
         map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1); 
     } 
     Iterator<Integer> itr = map.values().iterator(); 
       
     // declaration of variables 
     boolean first = true, second = true; 
     int val1 = 0, val2 = 0; 
     int countOfVal1 = 0, countOfVal2 = 0; 
       
     while(itr.hasNext()) { 
         int i = itr.next(); 
           
         // if first is true than countOfVal1 increase 
         if(first) { 
             val1 = i; 
             first = false; 
             countOfVal1++; 
             continue; 
         } 
           
         if(i == val1) { 
             countOfVal1++; 
             continue; 
         } 
           
         // if second is true than countOfVal2 increase 
         if(second) { 
             val2 = i; 
             countOfVal2++; 
             second = false; 
             continue; 
         } 
           
         if(i == val2) { 
             countOfVal2++; 
             continue; 
         } 
           
         return false; 
     } 
       
     if(countOfVal1 > 1 && countOfVal2 > 1) { 
         return false; 
     }else { 
         return true; 
     } 
       
 } 
   
 // Driver code 
 public static void main(String[] args) 
 { 
           
     System.out.println(checkForVariation("aabcbcaa")); 
 } 
} 
