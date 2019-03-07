
package StackAndQueue;

import java.util.Stack;

import javax.management.RuntimeErrorException;

class MyStack1{
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public MyStack1(){
		stackData = new Stack<Integer>();
		stackMin = new Stack<Integer>();
	}
	
	public void push(int newNum){
		if(this.stackMin.isEmpty())       //≈–∂œ’ªø’
		{
			this.stackMin.push(newNum);
		}else if(newNum <= this.getmin()){
			this.stackMin.push(newNum);
		}
		this.stackData.push(newNum);
	}
	
	public int pop(){
		if(this.stackData.isEmpty()){                 //µØ≥ˆ≈–∂œø’“Ï≥£
			throw new RuntimeException("Empty!");
		}
		int value = stackData.pop();
		if(this.getmin() == value){
			stackMin.pop();
		}
		return value;
	}
	
	public int getmin(){
		if(this.stackMin.isEmpty())
		{
			throw new RuntimeException("Empty!");
		}
		else {
			return this.stackMin.peek();
		}
	}
}

public class getMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack1 myStack1 = new MyStack1();
		
		myStack1.push(1);
		myStack1.push(4);
		myStack1.push(5);
		myStack1.push(3);
		myStack1.push(4);
		myStack1.push(2);
		
		System.out.println(myStack1.pop());
		System.out.println(myStack1.getmin());
	}

}
