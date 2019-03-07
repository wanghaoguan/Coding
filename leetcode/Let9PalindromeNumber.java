package leetcode;

import java.util.Scanner;

public class Let9PalindromeNumber {
	
public boolean isPalindrome(int x) {
      
	
//	String s = Integer.toString(x);
	
//	String s = String.valueOf(x);
	
	String s = x +"";
	
	if(x<0||(x%10 == 0&&x!=0))
	{
		return false;
	}
	
	int temp = 0;

	int y = x;
	
	while(y!=0){
			
		temp = temp *10 + y%10;
		
		y = y/10;
	}
	
	
	if(x==temp)
	{
		return true;
	}
	
	return false;
	
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in); 
		  
		  int i = sc.nextInt();
		  
		  Let9PalindromeNumber PN = new Let9PalindromeNumber();
		  
		  System.out.println(PN.isPalindrome(i));
	}

}
