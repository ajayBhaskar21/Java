

class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;

    }
}

class tuf 
{

    static Node root;
    static int maxi = 0;

    static int maxPath(Node root) {

        if (root == null) return 0;
        int leftSum = maxPath(root.left);
        int rightSum = maxPath(root.right);
        maxi = Math.max(maxi, leftSum + root.data + rightSum);
        return root.data + Math.max(leftSum , rightSum);
    }


    public static void main(String[] args) {

        root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        maxPath(root);
        System.out.println("Maximum path sum = " +  maxi);



    }
}
