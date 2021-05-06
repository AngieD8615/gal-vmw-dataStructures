package StacksAndQueues;

public class Queue {
    public Node head = null;
    public Node tail = null;
    public boolean isEmpty(){
        return head == null;
    }
    public void add(Object value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node tmp = tail;
            tmp.next = node;
            tail = tmp.next;
        }
    }
    public Object peak() {
        return head.data;
    }
    public void remove() {
        if (head == null) {
            throw new NullPointerException();
        } else if (head == tail) {
            head = null;
            tail = null;
        }
        head = head.next;
    }
}