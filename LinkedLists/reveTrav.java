


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

    void rev(Node h) {

        Node t = h;
        if (t != null)
            rev(t.next);
        if (t == null)
            return;
        System.out.println(t.data);

    }
    

    int Counts() {

        int c = 0;
        Node t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        return c;
    }

}

public class reveTrav {
    public static void main(String[] args) {

        createList list = new createList();
        for (int i = 0; i < 5; i++) {
            list.insert(i + 10);
        }
        list.show();
        System.out.println(list.Counts());

        list.rev(list.head);
        
    }
}
