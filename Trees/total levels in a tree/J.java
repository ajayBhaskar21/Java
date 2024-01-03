
/*
 * Total levels in a binary tree or maximum height of a tree using bfs.
 * 
 */

import java.util.Queue;
import java.util.LinkedList;


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


class J {

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

    static int levelorder(TreeNode root){

        if (root == null)
            return 0;
        
        Queue <TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            
            while (levelSize > 0) {
               

                TreeNode temp = queue.poll();

                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
                
                levelSize --;

            }
            level ++;

        }
        return level;


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
        root = insert(root, 8);
        root = insert(root, 9);
        System.out.println("inorder");
        inorder(root);
        System.out.println("\nTotal levels");
        
        System.out.println(levelorder(root));

        
    }

}

