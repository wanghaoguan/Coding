package ��ָoffer;

import java.util.ArrayList;

public class �������´�ӡ������ {
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();
        if(root == null) return list;
        queue.add(root);
        while(queue.size()!=0)
        {
            TreeNode temp = queue.remove(0);
            list.add(temp.val);
            if(temp.left!=null)
                queue.add(temp.left);
            if(temp.right!=null)
                queue.add(temp.right);
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
