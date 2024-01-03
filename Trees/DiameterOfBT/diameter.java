
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }

}

class diameter {


    static TreeNode root;
    static int max = 0;
    static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = diameterOfBinaryTree(root.left);
        int rh = diameterOfBinaryTree(root.right);
        max = Math.max(max, lh + rh); 
        return 1 + Math.max(lh, rh);

    }

    public static void main(String[] args) {
        
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(5);
        root.right.left.left.left = new TreeNode(9);
        root.right.right.right = new TreeNode(7);
        root.right.right.right.right = new TreeNode(8);

        
        diameterOfBinaryTree(root);

        System.out.println(max);

    }




}