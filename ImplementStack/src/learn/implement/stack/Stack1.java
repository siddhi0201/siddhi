package learn.implement.stack;

import java.util.Stack;

public class Stack1 {

	public static void push(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);
//			System.out.println("Insert in the stack" +stack.push(i));
		}
	}

	public static void pop(Stack<Integer> stack)

	{
		// System.out.println(stack.pop());
		for (int i = 0; i < 5; i++) {
			Integer pop = stack.pop();
			System.out.println("Elements out of stack" + pop);
		}

	}

	public static void peek(Stack<Integer> stack) {
		Integer peek = stack.peek();
		System.out.println("Element at the first index of stack" + peek);
	}

	public static void search(Stack<Integer> stack, int element) {
		Integer findElement = stack.search(element);
		if (findElement == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element present at position" + findElement);
		}
	}

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		push(stack);
		pop(stack);
		push(stack);
		peek(stack);
		search(stack, 2);
		search(stack, 6);
	}

}
