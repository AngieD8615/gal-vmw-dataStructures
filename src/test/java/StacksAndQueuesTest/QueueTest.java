package StacksAndQueuesTest;

import StacksAndQueues.Queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test
    public void testIsEmpty() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }
    @Test
    public void testAddToTail() {
        Queue queue = new Queue();
        queue.add(1);
        assertEquals(1, queue.tail.data, "Adding 1 to a new queue should make 1 the tail");
    }
    @Test
    public void testAddToNonEmptyQueue () {
        Queue queue = new Queue();
        queue.add(1);
        queue.add("second");
        queue.add(true);
        Object expected = "second";
        Object actual = queue.head.next.data;
        assertEquals(1, queue.head.data, "the head should be the first item added and remain the same");
        assertEquals(expected, actual, "the body value is as it should be");
        assertEquals(true, queue.tail.data, "the tail should be the last item added");
    }
    @Test
    public void testPeak() {
        Queue queue = new Queue();
        queue.add(1);
        queue.add("second");
        queue.add(true);
        Object expected = 1;
        assertEquals(expected, queue.peak(), "Peak should return head without removing it");
        assertEquals(expected, queue.head.data, "Making sure the head hasn't been removed");
    }
    @Test
    public void testRemove() {
        Queue queue = new Queue();
        queue.add(1);
        queue.add("second");
        queue.add(true);
        queue.remove();
        assertEquals("second", queue.head.data, "Second item in queue should be the new head");
    }
}