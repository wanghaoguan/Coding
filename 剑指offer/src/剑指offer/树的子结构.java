package 剑指offer;

public class 树的子结构 {
	
	 public boolean doTree1HaveTree2(TreeNode tree1,TreeNode tree2)
	    {
	        if(tree2 == null)
	        {
	            return true;
	        }
	        if(tree1 == null)
	        {
	            return false;
	        }
	        if(tree1.val!=tree2.val)
	            return false;
	        return doTree1HaveTree2(tree1.left,tree2.left)&&doTree1HaveTree2(tree1.right,tree2.right);
	    }
	    
	    public boolean HasSubtree(TreeNode root1,TreeNode root2) 
	    {
	        boolean res = false;
	        if(root1==null||root2==null)
	            res = false;
	        else
	        {
	            if(root1.val == root2.val)
	               res =  doTree1HaveTree2(root1,root2);
	            if(!res)
	            {
	                 res =  doTree1HaveTree2(root1.left,root2);
	            }
	            if(!res)
	            {
	                 res =  doTree1HaveTree2(root1.right,root2);
	            }
	        }
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
