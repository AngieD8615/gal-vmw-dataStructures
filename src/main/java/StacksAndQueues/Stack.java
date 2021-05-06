package StacksAndQueues;

public class Stack {
    public Node head;
    public boolean isEmpty() {
        return head == null;
    }
    public void push (Object value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node tmp = head;
            head = node;
            head.next = tmp;
        }
    }

    public Object peak () {
        if (head == null) {
            throw new NullPointerException();
        }
        return head.data;
    }
    public Object pop () {
        Object oldHeadData = head.data;
        head = head.next;
        return oldHeadData;
    }
}
