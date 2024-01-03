

class Node{
    public int data;
    public Node next;
}

class LinkedList {

    Node head;

    public void show(){

        Node n = head;
        while(n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();

    }

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;

        }

    }
}


class single1{

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        System.out.println(list.head);
        list.insert(18);
        list.insert(20);
        list.insert(200);
        list.insert(1000);

        list.show();


    }


}