package ½£Ö¸offer;

public class ¾ØÐÎ¸²¸Ç {
	
	 public int RectCover(int target) {
	        int a = 1;
	        int b = 1;
	        int c = 0;
	        if(target==0)
	            return 0;
	        else if(target==1)
	            return 1;
	        else{
	            for(int i = 1;i < target;i++){
	                c = a+b;
	                a = b;
	                b = c;
	            }
	            return c;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
