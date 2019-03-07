package StackAndQueue;

import java.util.Stack;

import javax.management.RuntimeErrorException;

public class reverseStack {

	public static int getlast(Stack<Integer> stack) {
		int last = stack.pop();
		if(stack.empty())
			return last;
		else {
			int result = getlast(stack);
			stack.push(last);
			return result;
		}
	}
	
	
	public static void  reverse(Stack<Integer> stack) {
		if(stack.empty()){
			return;
		}
		int last = getlast(stack);
		reverse(stack);
		stack.push(last);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		reverse(stack);
		
		System.out.println(stack.peek());
		
	}

}
