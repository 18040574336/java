package com.gantang.interview;

public class TreeTest {
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);

		p.left = new TreeNode(2);

		p.right = new TreeNode(3);

		p.left.left = null;

		p.left.right = null;

		p.right.left = new TreeNode(4);

		p.right.right = new TreeNode(5);



		Tree1 t = new Tree1();

		System.out.println(t.maxDepth(p));
	}
}



  class TreeNode{
	int data;
	 TreeNode left;
	 TreeNode right;

	 TreeNode(int val){
		 data = val;
	 }

}
class Tree1 {
	public int maxDepth(TreeNode root){
		System.out.println(root==null ? null:root.data);
		if (root == null)
			return 0;

		int nleft = maxDepth(root.left);
		int nright = maxDepth(root.right);

		return nleft > nright ? nleft + 1 : nright + 1;

	}

}