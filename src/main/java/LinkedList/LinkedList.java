package LinkedList;

public class LinkedList {
    _Node head;
    _Node tail;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }
    public void add (_Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            _Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
        size++;
    }
//    public void addFirst() {
//
//    }
//    public ArrayList<Object> toArray() {
//        return new ArrayList<>();
//    }

    public _Node getFirst() {
        return head;
    }
    public _Node getLast() {
        if (head == null || head.next == null) {
            return head;
        }
        _Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }
    public _Node get(int num) {
        _Node cur = head;
        int count = 1;
        while (cur != null) {
            if (count == num) {
                return cur;
            }
            cur = cur.next;
            count++;
        }
        throw new IndexOutOfBoundsException();
    }
    public int contains(_Node node) {
        _Node cur = head;
        int index = 0;
        while (cur != null) {
            if (node.equals(cur)) {
                return index;
            }
            cur = cur.next;
            index++;
        }
        return -1;
    }
    public void delete(_Node node) {
        _Node cur = null;
        _Node next = head;
        while (!next.equals(node)) {
            cur = next;
            next = next.next;
        }
        cur.next = next.next;
        size--;
    }
    public void delete(int num) {
        _Node cur = null;
        _Node next = head;
        int count = 1;
        while (count != num) {
            cur = next;
            next = next.next;
            count++;
        }
        cur.next = next.next;
        size--;
    }
}

















