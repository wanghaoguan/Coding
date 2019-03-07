package 剑指offer;
import java.util.Stack;

public class 包含min函数的栈 {
	 private Stack<Integer> stackData = new Stack<Integer>();
	    private Stack<Integer> stackMin = new Stack<Integer>();

	    
	    public void push(int node) {
	        if(stackMin.isEmpty()||node<stackMin.peek())
	            stackMin.push(node);
	           stackData.push(node);
	    }
	    
	    public void pop() {
	        if(stackData.peek()==stackMin.peek())
	            stackMin.pop();
	        stackData.pop();
	    }
	    
	    public int top() {
	       return stackData.peek();
	    }
	    
	    public int min() {
	        return stackMin.peek();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
