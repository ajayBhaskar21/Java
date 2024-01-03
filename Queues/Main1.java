/* 
 * remove two elements from queue
 * get absolute diff and add into queue
 * repeat this until only one element is in the queue
 * print the last element.
*/

/*ip:
 * n = 3;
 * a[] = {1, 2, 3};
 * op:
 * 2
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node next;
}

class Main1 {

    Node head;
    Node tail;

    void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

    }

    public static void main(String[] args) {
        Main1 sol = new Main1();

        int n = 3;
        int[] a = {1, 2, 3};

        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < n; i++)
            queue.offer(a[i]);
        int ele1, ele2;
        while (queue.size() >= 2){
            ele1 = queue.poll();
            ele2 = queue.poll();
            queue.offer(Math.abs(ele2 - ele1));
        }
        System.out.println(queue.peek());



    }
}