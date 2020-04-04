package learn.implement.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class GenericStack {
	
	public static void main(String args[])
	{
		Stack<Integer> stack = new Stack<Integer>();
		push(stack);
		pop(stack);
	}
	
	public static void push(Stack<Integer> stack) {
		
		stack.push(23);
		stack.push(10);
		stack.push(2);
		stack.push(50);
//			System.out.println("Insert in the stack" +stack.push(i));
		}
	
	public static void pop(Stack<Integer> stack)

	{
		// System.out.println(stack.pop());
		
			Integer pop = stack.pop();
			List<Integer> popElements = new ArrayList<>();
			for(int i= 0 ;i< stack.size();i++) {
				
				popElements.add(pop);
				Collections.sort(popElements);
			}
			
		

	}
	}


