public class LinkedList {
    private _Node head;

    public boolean isEmpty() {
        return head == null;
    }

    public void add (_Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        }
        _Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

}

class _Node {
    private Object object;
    _Node next;

    public _Node(Object object) {
        this.object = object;
    }
}

