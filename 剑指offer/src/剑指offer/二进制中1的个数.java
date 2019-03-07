package 剑指offer;

public class 二进制中1的个数 {
	
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
