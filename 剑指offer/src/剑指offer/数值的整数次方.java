package ��ָoffer;

public class ��ֵ�������η� {
	
	 public double Power(double base, int exponent) {


	        double res = 1,curr = base;
	            int n;
	            if(exponent>0){
	                n = exponent;
	            }else if(exponent<0){
	                if(base==0)
	                    throw new RuntimeException("��ĸ����Ϊ0"); 
	                n = -exponent;
	            }else{
	                return 1;
	            }
	            while(n!=0){
	                if((n&1)==1)
	                    res*=curr;
	                curr*=curr;
	                n>>=1;
	            }
	            return exponent>=0?res:(1/res);     
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
