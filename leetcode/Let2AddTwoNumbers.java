package leetcode;


public class Let2AddTwoNumbers {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		ListNode curlis = new ListNode(0);
		
		ListNode p1 = l1,p2 = l2, p = curlis;
		
		int temp = 0,sum = 0;
		
		while(p1!=null || p2!=null)
		{
			int x = (p1!=null)?p1.val : 0;
			
			int y = (p2!=null)?p2.val : 0;
			
			sum = x + y + temp;
			
			temp = sum/10;
			
			p.next = new ListNode(sum%10);
			
			if(p1!=null) p1 = p1.next;
			
			if(p2!=null) p2 = p2.next;
			
			p = p.next ;
		}
		
		
		if(temp > 0)
		{
			p.next = new ListNode(temp);
		}
		
		return curlis.next;
          
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = new ListNode(3);
		l1.next =  new ListNode(4);
		l1.next.next =  new ListNode(1);
		
		ListNode l2 = new ListNode(6);
		l2.next =  new ListNode(6);
		l2.next.next =  new ListNode(5);
		
		
		Let2AddTwoNumbers num = new Let2AddTwoNumbers();
		
		ListNode cur = num.addTwoNumbers(l1,l2);
		
		
		/*ListNode prt =  new ListNode(0);*/
		
		/*System.out.print(cur.next.val);
		System.out.print(cur.val);*/
		
		while(cur!=null)
		{
			System.out.print(cur.val);
			
			cur = cur.next;
		}
			
			
	}

}
