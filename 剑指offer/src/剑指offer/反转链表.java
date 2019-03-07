package 剑指offer;



public class 反转链表 {
	
	 public ListNode ReverseList(ListNode head) {
	        if(head == null) return null;
	        ListNode cur = head;
	        ListNode tmp = null;
	        ListNode pre = null;
	        ListNode reverseNode = null;
	        while(cur!=null){
	           tmp = cur.next;
	            if(tmp==null)
	                reverseNode = cur;
	            cur.next = pre;
	            pre = cur;
	            cur = tmp;
	        }
	        return reverseNode;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
