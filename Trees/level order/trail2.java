import java.util.*;


class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(){

    }
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }


}

class trail2 {


    static TreeNode root;


    static void level(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return ;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode t = queue.poll();
            System.out.print(t.data + " ");
            if (t.left != null) queue.add(t.left);
            if (t.right != null) queue.add(t.right);

        }


    }

    public static void main(String[] args) {
        

        root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right= new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        level(root);
    }
}