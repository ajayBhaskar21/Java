import java.util.LinkedList;
import java.util.Queue;

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


class t {

    static TreeNode root;
    static TreeNode newNode;
    static TreeNode insert(TreeNode root, int data){
        if (root == null){
            newNode = new TreeNode(data);
            return newNode;
        }
            
        else if (data < root.data){
            root.left = insert(root.left, data);
        }
        else 
            root.right = insert(root.right, data);
        
        return root;
    }

    static void inorder (TreeNode root){
        if (root != null){
            System.out.print(root.data + " ");
            inorder (root.left);
            inorder(root.right);
        }
    }


    static int levelOrder(TreeNode root) {
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(root);
        
        //System.out.println(queue);
        while (!queue.isEmpty()){

            int levelSize = queue.size();
            while (levelSize > 0){
                TreeNode tempNode = queue.poll();
                System.out.print(tempNode.data + " ");
                if (tempNode.left != null){
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null)
                    queue.add(tempNode.right);
                levelSize --;

            }
            
            
            System.out.println();
        }

        return 0;
    }

    public static void main(String[] args){
        /*

        root.data = 4;
        root.left.data = 2;
        root.right.data = 6;
        root.left.left.data = 1;
        root.left.right.data = 3;
        root.right.left.data = 5;
        root.right.right.data = 7;

         */
        
        root = insert(root, 4);
        root = insert(root, 2);
        root = insert(root, 6);
        root = insert(root, 1);
        root = insert(root, 3);
        root = insert(root, 5);
        root = insert(root, 7);

        inorder(root);
        System.out.println("\nlevel order");
        
        // level order traversal. 
        // use queue.

        levelOrder(root);
        
    }

}

