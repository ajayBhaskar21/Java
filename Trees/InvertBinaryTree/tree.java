


class Node {
    int data;
    Node left;
    Node right;
    Node (int d) {
        data = d;
        left = right = null;
    }
}

class tree {


    static Node root;

    static void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }


    static void invertBT(Node root) {


        if (root == null) 
            return ;
        
        invertBT(root.left);
        invertBT(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

    }


    public static void main(String[] args) {
        
        root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        preorder(root); 
        System.out.println();

        invertBT(root);
        preorder(root);
        System.out.println();
    }
}