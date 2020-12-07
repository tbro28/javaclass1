package cp510.assignments.assignment7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the DNode class.
 *
 * @author Tim Brown
 */
public class DNodeTest {

    /**
     * Test the after method.
     */
    @Test
    void testAddAfter()
    {
        DNode   left	= new DNode();
        DNode   right   = new DNode();
        DNode   middle  = new DNode();
        DNode   term	= new DNode();

        left.addAfter( right );
        assertEquals( right, left.getNext() );
        assertEquals( right, left.getPrevious() );
        assertEquals( left, right.getNext() );
        assertEquals( left, right.getPrevious() );

        left.addAfter( middle );
        assertEquals( middle, left.getNext() );
        assertEquals( right, left.getPrevious() );
        assertEquals( right, middle.getNext() );
        assertEquals( left, middle.getPrevious() );
        assertEquals( left, right.getNext() );
        assertEquals( middle, right.getPrevious() );

        right.addAfter( term );
        assertEquals( term, right.getNext() );
        assertEquals( middle, right.getPrevious() );
        assertEquals( right, term.getPrevious() );
        assertEquals( left, term.getNext() );
    }

    /**
     * Node data is getter/setter works.
     */
    @Test
    void testData()
    {
        DNode   data	= new DNode();

        data.setData("String is an object!");

        assertEquals( "String is an object!", data.getData() );
    }

    /**
     * Add after throws an error for enqueued nodes.
     */
    @Test
    void testAddAfterError()
    {
        DNode   left	= new DNode();
        DNode   right   = new DNode();

        left.addAfter(right);

        assertThrows(IllegalArgumentException.class,
                () -> left.addAfter(right));
    }

    /**
     * Add before equals getPrevious afterwards.
     */
    @Test
    void testAddBefore()
    {
        DNode   left	= new DNode();
        DNode   right   = new DNode();

        left.addBefore(right);

        assertEquals(right, left.getPrevious());
    }

    /**
     * Add before throws an error for enqueued nodes.
     */
    @Test
    void testAddBeforeError()
    {
        DNode   left	= new DNode();
        DNode   right   = new DNode();

        left.addBefore(right);

        assertThrows(IllegalArgumentException.class,
                () -> left.addBefore(right));
    }

    /**
     * Verify that removed nodes are not present.
     */
    @Test
    void testRemove()
    {
        DNode   left	= new DNode();
        DNode   right   = new DNode();

        left.addAfter(right);

        assertEquals(right, left.getNext());

        right.remove();

        assertEquals(false, right.isEnqueued());
    }

}
