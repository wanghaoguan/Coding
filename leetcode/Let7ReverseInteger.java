package leetcode;

import java.util.Scanner;

public class Let7ReverseInteger {

	 public int reverse(int x) {
		 
		 int rev = 0;
	       
		 
		while(x!=0)
		{
			
			
			int temp = rev *10 + x%10;
			
			if(temp/10 != rev) // 
				
				return 0;
			
			
			rev = temp;
			
			x=x/10;
			
		}
		
		
		 
		 return rev;
	        
	    }
	 
	 
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
		  
		  Scanner sc = new Scanner(System.in); 
		  
		  int i = sc.nextInt();
		  
		  Let7ReverseInteger Rev = new Let7ReverseInteger();
		  
		 
		  System.out.println(Rev.reverse(i));
		  
		  System.out.println(Integer.MAX_VALUE);
		  
		  
		}
}
