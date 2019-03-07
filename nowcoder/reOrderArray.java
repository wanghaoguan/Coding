package StackAndQueue;

public class reOrderArray {
	
    public static int[] reOrderArray(int [] array) {
    

    		/* int m = array.length;
    		        int k = 0;//记录已经摆好位置的奇数的个数
    		        for (int i = 0; i < m; i++) {
    		            if (array[i] % 2 == 1) {
    		                int j = i;
    		                while (j > k) {//j >= k+1
    		                    int tmp = array[j];
    		                    array[j] = array[j-1];
    		                    array[j-1] = tmp;
    		                    j--;
    		                }
    		                k++;
    		            }
    		        }*/
    	
    	 int len = array.length;
         int[] res = new int[len];
         int temp = 0;
         for(int i = 0;i<len;i++){
             if(array[i]%2!=0)
                 res[temp++] = array[i];
            
         }
          for(int i = 0;i<len;i++){
             if(array[i]%2==0)
                 res[temp++] = array[i];
         }
        /* for(int i =0;i<res.length;i++){
             array[i] = res[i];
         }*/
          return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,3,2,3,4,2,5,3};
		int[] b =reOrderArray(a);
		for(int i = 0;i<a.length;i++){
			System.out.print(b[i]);
		}
	}

}
