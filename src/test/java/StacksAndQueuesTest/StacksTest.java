package StacksAndQueuesTest;

import StacksAndQueues.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StacksTest {
    @Test
    public void testIsEmptyWhenStackIsEmpty () {
        Stack stack = new Stack();
        boolean actual = stack.isEmpty();

        assertTrue(actual, "when stack is empty, the is empty method returns true");
    }

    @Test
    public void testPush_WhenStackEmptyAdd_AdjustsHead () {
        Stack stack = new Stack();
        stack.push(1);
        Object actual = 1;
        Object expected = stack.head.data;
        assertEquals(expected, actual);
    }

    @Test
    public void testPush_WhenStackIsNotEmptyAdd_AdjustsStack () {
        Stack stack = new Stack();
        stack.push(1);
        stack.push("second");
        stack.push(true);
        Object actual3 = true;
        Object expected3 = stack.head.data;

        Object actual2 = "second";
        Object expected2 = stack.head.next.data;

        Object actual1 = 1;
        Object expected1 = stack.head.next.next.data;

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }

    @Test
    public void testPeak_WhenStackIsNotEmpty_PeakReturnsTop () {
        Stack stack = new Stack();
        stack.push(1);
        stack.push("second");
        stack.push(true);
        Object actual = true;
        Object expected = stack.peak();

        assertEquals(expected, actual);
    }
    @Test
    public void testPeak_WhenStackIsEmpty_PeakThrowsError () {
        Stack stack = new Stack();
        assertThrows(NullPointerException.class, () -> {stack.peak();});
    }

    @Test
    public void testPop_WhenStackIsNotEmpty_PopReturnsTop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push("second");
        stack.push(true);
        Object actual = true;
        Object expected = stack.pop();

        assertEquals(expected, actual, "stack.pop returns pop");
    }
    @Test
    public void testPop_WhenStackIsNotEmpty_PopRemovesTop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push("second");
        stack.push(true);
        stack.pop();
        Object actual = "second";
        Object expected = stack.head.data;
        assertEquals(expected, actual, "stack.pop returns pop");
    }

}
