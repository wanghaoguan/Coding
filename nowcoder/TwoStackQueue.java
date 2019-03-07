
package StackAndQueue;

import java.util.Stack;

import javax.management.RuntimeErrorException;



class StackQueue{
	
	public Stack<Integer> stackpush;
	public Stack<Integer> stackpop;
	
	
	//public void StackQueue()
	
	public StackQueue() {                               //构造函数没有返回值
		stackpop = new Stack<Integer>();
		stackpush = new Stack<Integer>();
	}
	
	public void pushtopop() {
		if (stackpop.empty()) {
			while(!stackpush.empty()){
				stackpop.push(stackpush.pop());
			}
		}
	}
	
	
	public void add(int num) {
		stackpush.push(num);
		pushtopop();
	}
	
	public int poll() {                                   //栈弹出为pop（），队列弹出为poll（）
		
		if(stackpop.empty()&&stackpush.empty()){
			throw new RuntimeException("Empty!");
		}
		pushtopop();
		return stackpop.pop();
	}
	
	public int peek(){
		if(stackpop.empty()&&stackpush.empty()){
			throw new RuntimeException("Empty!");
		}
		pushtopop();
		return stackpop.peek();
	}
	
}

public class TwoStackQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackQueue myQueue1 = new StackQueue();
		
		myQueue1.add(5);
		myQueue1.add(3);
		myQueue1.add(4);
		myQueue1.add(0);
		
		
		System.out.println(myQueue1.poll());
	}

}
