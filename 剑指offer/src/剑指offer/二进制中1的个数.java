package ��ָoffer;

public class ��������1�ĸ��� {
	
	public int NumberOf1(int n) {
        int m = 0;
        while(n!=0){
             n=n&(n-1);
             m++;  
        }
     return m;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
