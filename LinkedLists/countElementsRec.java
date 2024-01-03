class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class createList {

    Node head;
    Node tail;

    void show() {

        Node h = head;
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println();

    }

    void insert(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

    }


    int Count(Node h){

        Node t = h;

        if (t != null)
            return 1 + Count(t.next);
        if(t == null)
            return 0;
        
        return 1;
    }
    

}


public class countElementsRec {
    public static void main(String[] args) {

        createList list = new createList();
        for (int i = 0; i < 5; i++) {
            list.insert(i + 10);
        }
        list.show();
        
        System.out.println(list.Count(list.head));

        
    }
}
