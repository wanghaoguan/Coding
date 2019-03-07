package ½£Ö¸offer;

public class ÌøÌ¨½× {
	
	public int JumpFloor(int target) {
        int a = 1;
        int b = 2;
        int c = 0;
        if(target <= 0)
            return 0;
        else if(target == 1)
            return 1;
        else if(target == 2)
            return 2;
        else {
            for(int i = 2;i<target;i++){
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
