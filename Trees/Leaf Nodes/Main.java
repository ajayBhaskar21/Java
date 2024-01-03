

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class Main {


    static TreeNode root;

    static void leafNodes(TreeNode root) {

        if (root == null) return;

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        leafNodes(root.left);
        leafNodes(root.right);

    }

    static int countLeaves(TreeNode root) {

        if (root == null) return 0;
        int l = countLeaves(root.left);
        int r = countLeaves(root.right);

        if (root.left == null && root.right == null) 
            return 1;
        return l + r;

    }


    public static void main(String[] args) {

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        ///leafNodes(root);
        System.out.println(countLeaves(root));

    }

}

