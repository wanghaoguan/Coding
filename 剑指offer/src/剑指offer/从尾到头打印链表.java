package 剑指offer;

import java.util.Stack;
import java.util.ArrayList;


public class 从尾到头打印链表 {
	
	 public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	        
	        Stack<Integer> sta = new Stack<>(); 
	        
	        while(listNode != null){
	           sta.push(listNode.val);
	           listNode = listNode.next;
	        }
	        
	        ArrayList<Integer> arr = new ArrayList<>();
	        
	        while(!sta.isEmpty()){
	            arr.add(sta.pop());
	        }
	        
	        return arr;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
