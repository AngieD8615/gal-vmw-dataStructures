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
    @Test
    public void addsNodeToLinkedList() {
        LinkedList linkedList = new LinkedList();
        _Node newNode1 = new _Node(1);
        linkedList.add(newNode1);
        _Node newNode2 = new _Node("second");
        linkedList.add(newNode2);
        assertEquals(1, linkedList.head.object);
        assertEquals("second", linkedList.head.next.object);
    }
    @Test
    public void getFirstShouldReturnFirstNodeFromLinkedList() {
        LinkedList linkedList = new LinkedList();
        _Node newNode1 = new _Node(1);
        linkedList.add(newNode1);
        _Node newNode2 = new _Node("second");
        linkedList.add(newNode2);
        assertEquals(newNode1, linkedList.getFirst());
    }
    @Test
    public void getLastShouldReturnLastNodeFromLinkedList() {
        LinkedList linkedList = new LinkedList();
        _Node newNode1 = new _Node(1);
        linkedList.add(newNode1);
        _Node newNode2 = new _Node("second");
        linkedList.add(newNode2);
        assertEquals(newNode2, linkedList.getLast());
    }
    @Test
    public void getShouldReturnTheNthObject() {
        LinkedList linkedList = new LinkedList();
        _Node newNode1 = new _Node(1);
        linkedList.add(newNode1);
        _Node newNode2 = new _Node("second");
        linkedList.add(newNode2);
        _Node newNode3 = new _Node(true);
        linkedList.add(newNode3);
        assertEquals(newNode1, linkedList.get(1));
        assertEquals(newNode2, linkedList.get(2));
        assertEquals(newNode3, linkedList.get(3));
    }
    @Test
    public void getShouldThrowExceptionWhenIndexOutOfBounds() {
        LinkedList linkedList = new LinkedList();
        _Node newNode1 = new _Node(1);
        linkedList.add(newNode1);
        _Node newNode2 = new _Node("second");
        linkedList.add(newNode2);
        _Node newNode3 = new _Node(true);
        linkedList.add(newNode3);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            linkedList.get(4);
        });
    }
    @Test
    public void getShouldThrowExceptionWhenEmpty() {
        LinkedList linkedList = new LinkedList();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            linkedList.get(1);
        });
    }
    @Test
    public void containsShould_ReturnTheIndexOfObjectIfExists() {
        LinkedList linkedList = new LinkedList();
        _Node newNode1 = new _Node(1);
        linkedList.add(newNode1);
        _Node newNode2 = new _Node("second");
        linkedList.add(newNode2);
        _Node newNode3 = new _Node(true);
        linkedList.add(newNode3);
        assertEquals(0, linkedList.contains(newNode1));
        assertEquals(1, linkedList.contains(newNode2));
        assertEquals(2, linkedList.contains(newNode3));
    }
    @Test
    public void containsShould_ReturnNeg1IfDoesNotExists() {
        LinkedList linkedList = new LinkedList();
        _Node newNode1 = new _Node(1);
        linkedList.add(newNode1);
        _Node newNode2 = new _Node("second");
        linkedList.add(newNode2);
        _Node newNode3 = new _Node(true);
        linkedList.add(newNode3);
        _Node notUsedNode = new _Node(false);
        assertEquals(-1, linkedList.contains(notUsedNode));
    }
    @Test
    public void deleteShouldRemoveGivenNode() {
        LinkedList linkedList = new LinkedList();
        _Node newNode1 = new _Node(1);
        linkedList.add(newNode1);
        _Node newNode2 = new _Node("second");
        linkedList.add(newNode2);
        _Node newNode3 = new _Node(true);
        linkedList.add(newNode3);
        linkedList.delete(newNode2);
        assertEquals(-1, linkedList.contains(newNode2));
        assertEquals(0, linkedList.contains(newNode1));
        assertEquals(1, linkedList.contains(newNode3));
    }
    @Test
    public void deleteShouldRemoveNodeGivenInt() {
        LinkedList linkedList = new LinkedList();
        _Node newNode1 = new _Node(1);
        linkedList.add(newNode1);
        _Node newNode2 = new _Node("second");
        linkedList.add(newNode2);
        _Node newNode3 = new _Node(true);
        linkedList.add(newNode3);
        linkedList.delete(2);
        assertEquals(-1, linkedList.contains(newNode2));
        assertEquals(0, linkedList.contains(newNode1));
        assertEquals(1, linkedList.contains(newNode3));
    }
}