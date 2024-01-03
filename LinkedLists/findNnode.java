
class Node {
    int data;
    Node next;

}

class LinkedList {

    Node head;

    public void show() {

        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();

    }

    void find(int n){

        int step = 1;
        Node t = head;
        while (step < n || t != null){
            if (step == n){
                System.out.println("Element is " + t.data);
                return ;
            }
            t = t.next;
            step++;
        }
        if (n > (step  - 1) || n < 1){
            System.out.print("Nth element is beyond the size or Nth is element is less than 1.");
        }
        
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } 
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;

        }

    }
}

public class findNnode {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for(int i = 0; i < 10; i++){
            list.insert((i + 1) * 10);
        }
        

        int n = 11;
        list.find(n);


    }

    
}
