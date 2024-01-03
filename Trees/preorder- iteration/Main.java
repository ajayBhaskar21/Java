
import java.util.*;


class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;

    }
    Node() {}


}


class Main {

    static Node root;



    static void inorder(Node root) {
        
        if (root != null) {
            System.out.print(root.data + " ");
            inorder(root.left);
            inorder(root.right);
        }

    }


    static void iterativeInorder(Node root) {


        Stack<Node> stack = new Stack<>();

        stack.push(root);


        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null) 
                stack.push(temp.left);

        }

    }




    public static void main(String[] args) {

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.left.right.left = new Node(5);
        root.left.right.right = new Node(6);

        inorder(root); 
        System.out.println();
        iterativeInorder(root);

    }


}