package ��ָoffer;




public class �����е�����k����� {

	 public ListNode FindKthToTail(ListNode head,int k) {
	        if(head==null) return null;
	       ListNode list = head;
	        ListNode p = head;
	       int num = 0;
	       while(list!=null)
	       {
	           num++;
	           list = list.next;
	       }
	       if(num<k) return null;
	        for(int i = 0;i<num-k;i++)
	        {
	            p = p.next;
	        }
	        return p;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
