public class single4 {


    static class Node {
        int data;
        Node next;
    };

    static Node head = null;


    Node reverse(){

        Node current = head;
        Node prev = null;
        Node nex = null;

        while(current != null){
            nex = current.next;
            current.next = prev;
            prev = current;
            current = nex;

        }
        return prev;
    }

    void insert(int data){

        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }
        else{
            Node t = head;
            while(t.next != null){
                t = t.next;
            }
            t.next = node;
        }
    }

    void show(){
        Node t = head;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("Static Context..");
        single4 list = new single4();
        
        for(int i = 0; i < 5; i++)
            list.insert(i + 10);
        list.show();
        list.head = list.reverse();

        list.show();

    }

    
}
