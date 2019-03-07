package 剑指offer;

public class 调整数组顺序使奇数位于偶数前面 {
	
	public void reOrderArray(int [] array) {
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
        for(int i =0;i<res.length;i++){
            array[i] = res[i];
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
