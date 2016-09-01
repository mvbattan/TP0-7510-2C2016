package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTests {

    @Test
    public void testNewQueueIsEmpty() {
        Queue<Integer> queue = new Queue<Integer>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testNewQueueIsZeroSized() {
        Queue<Integer> queue = new Queue<Integer>();
        assertEquals(queue.size(), 0);
    }

    @Test
    public void testQueueItemsAndGetSizeIsCorrect() {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(1);
        queue.add(2);
        assertEquals(queue.size(), 2);

        queue.add(3);
        assertEquals(queue.size(), 3);

        queue.add(1);
        assertEquals(queue.size(), 4);
    }

    @Test
    public void testQueueItemsIsCorrectOrdered() {
        Queue<Integer> queue = new Queue<Integer>();

        Integer element = 1;
        queue.add(1);
        assertEquals(queue.top(), element);

        queue.add(2);
        assertEquals(queue.top(), element);

        element = 2;
        queue.remove();
        assertEquals(queue.top(), element);

        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testQueueAndDequeueItemsIsCorrectOrdered() {
        Queue<Integer> queue = new Queue<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        assertEquals((Integer) 1, queue.top());

        queue.remove();
        queue.remove();

        assertEquals((Integer) 3, queue.top());

        queue.remove();

        queue.add(4);
        queue.remove();

        queue.add(5);
        queue.add(6);

        queue.remove();
        assertEquals((Integer) 6, queue.top());

        queue.remove();

        assertEquals(queue.size(), 0);
    }
}
