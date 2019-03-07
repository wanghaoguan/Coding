package 剑指offer;


public class 重建二叉树 {
	
	 private TreeNode Construct(int[] pre,int ps,int pe,int[] in,int is,int ie){
	        if(ps>pe) return null;
	        int value = pre[ps];
	        int index = is;
	        while(index<=ie && value != in[index]){
	            index++;
	        }
	        if(index>ie){
	           return null;
	        }
	        
	        TreeNode node = new TreeNode(value);
	        
	        node.left = Construct(pre,ps+1,ps+index-is,in,is,index-1);
	        node.right = Construct(pre,ps+index-is+1,pe,in,index+1,ie);
	        
	        return node;
	    }
	    
	    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        if(pre==null || in==null || pre.length!=in.length)
	            return null;
	        return Construct(pre,0,pre.length-1,in,0,in.length-1);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
