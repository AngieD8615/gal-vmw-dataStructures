import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void linkedListIsEmptyWhenInitiated() {
        LinkedList linkedList = new LinkedList();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void linkedListIsNotEmptyAfterAddingANode() {
        LinkedList linkedList = new LinkedList();
        _Node newNode = new _Node(1);
        linkedList.add(newNode);
        assertFalse(linkedList.isEmpty());
    }
}
