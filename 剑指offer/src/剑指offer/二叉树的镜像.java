package ��ָoffer;

public class �������ľ��� {
	
	  public void Mirror(TreeNode root) {
	        if(root == null) return;
	        TreeNode tmp = null;
	        tmp = root.left;
	        root.left = root.right;
	        root.right = tmp;
	        Mirror(root.left);
	        Mirror(root.right);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
