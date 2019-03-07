package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;

public class 栈的压入弹出序列 {
	
	 public boolean IsPopOrder(int [] pushA,int [] popA) {

         int n = pushA.length;
                if(n==0) return false;
                ArrayList<Integer> stack = new ArrayList<Integer>();
                for(int i=0,j=0;i<n;i++){
                    stack.add(pushA[i]);
                    while(stack.isEmpty()==false&&stack.get(stack.size()-1)==popA[j]){
                        stack.remove(stack.size()-1);
                        j++;
                    }
                }
                return stack.isEmpty();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
