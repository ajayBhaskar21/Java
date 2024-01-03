

class TreeNode {
	TreeNode left;
	TreeNode right;
	int data;
	TreeNode (int data) {
		this.data = data;
		left = right = null;
	}
	TreeNode () {

	}
}

class height {

	static TreeNode root;

	static int heightOfTree(TreeNode root) {
		if (root == null) 
			return 0;
		int leftSubTree = heightOfTree(root.left) + 1;
		int rightSubTree = heightOfTree(root.right) + 1;
		return Math.max(leftSubTree, rightSubTree);

	}

	public static void main(String[] args) {
		root = new TreeNode(10);
		root.left = new TreeNode(20);
		root.right = new TreeNode(30);
		root.left.left = new TreeNode(40);
		root.left.left.left = new TreeNode(50);
		System.out.println(heightOfTree(root));
/*
		root.data = 10;
		root.left.data = 20;
		root.right.data = 30;
		root.left.left.data = 40;
		root.left.left.left.data = 50;
		System.out.println(heightOfTree(root));
*/
	}
}