public class diaTuf {

    static TreeNode root;
    static int max = 0;
    static int maxHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);
        return 1 + Math.max(lh, rh);

    }


    static void dia(TreeNode root) {
        if (root == null) return ;
        int lh = maxHeight(root.left);
        int rh = maxHeight(root.right);

        max = Math.max(max, lh + rh);
        dia(root.left);
        dia(root.right);

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
        dia(root);
        System.out.println(max);
        
    }
    
}
