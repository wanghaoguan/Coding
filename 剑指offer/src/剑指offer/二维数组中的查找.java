package ��ָoffer;

public class ��ά�����еĲ��� {
	
	 public boolean Find(int target, int [][] array) {
	        int len = array.length;
	        int row = array[0].length;
	        int i = 0;
	        int j = array.length-1;
	        while(j>=0&&i<row){
	            int value = array[j][i];
	            if(target>value){
	                i++;
	            }else if(target<value){
	               j--;
	            }else{
	                return true;
	            }
	        }
	        
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
