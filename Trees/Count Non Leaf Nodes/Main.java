


class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int data) {
        val = data;
        left = right = null;
    }
}



class Main {

    static TreeNode root;

    static int countNonLeaf(TreeNode root) {

        if (root == null) return 0; // end of nodes
        if (root.left == null && root.right == null) return 0; // leaf nodes

        int l = countNonLeaf(root.left); // left subtrees
        int r = countNonLeaf(root.right); // right subtrees

        return l + r + 1;


    }

    public static void main(String[] args) {
        
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        System.out.println("Count : " + countNonLeaf(root));


    }


}