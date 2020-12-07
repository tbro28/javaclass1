package cp510.assignments.assignment7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the DList class.
 *
 * @author Tim Brown
 */
public class DListTest {

    /**
     * Test adding head and getting head node.
     */
    @Test
    void testAddHead()
    {
        DList   list    = new DList();
        DNode   node    = new DNode();

        list.addHead( node );

        assertEquals(node, list.getHead());
    }

    /**
     * Test removing head node.
     */
    @Test
    void testRemoveHead()
    {
        DList   list    = new DList();
        DNode   node    = new DNode();

        list.addHead( node );
        assertEquals(node, list.getHead());

        assertEquals(true, list.getHead().isEnqueued());

        list.removeHead();

        assertEquals(false, list.getHead().isEnqueued());
    }

    /**
     * Test adding tail and getting tail node.
     */
    @Test
    void testAddTail()
    {
        DList   list    = new DList();
        DNode   node    = new DNode();

        list.addTail( node );

        assertEquals(node, list.getTail());
    }

    /**
     * Test removing head node.
     */
    @Test
    void testRemoveTail()
    {
        DList   list    = new DList();
        DNode   node    = new DNode();

        list.addHead( node );
        assertEquals(node, list.getTail());

        assertEquals(true, list.getTail().isEnqueued());

        list.removeTail();

        assertEquals(false, list.getTail().isEnqueued());
    }

    /**
     * Test size of the list.
     */
    @Test
    void testListSize()
    {
        DList   list    = new DList();
        DNode   node1    = new DNode();
        DNode   node2    = new DNode();
        DNode   node3    = new DNode();


        list.addHead( node1 );
        list.addHead( node2 );
        list.addHead( node3 );

        assertEquals(3, list.size());
    }

    /**
     * Test removing all nodes.
     */
    @Test
    void testRemoveAll()
    {
        DList   list    = new DList();
        DNode   node1    = new DNode();
        DNode   node2    = new DNode();
        DNode   node3    = new DNode();


        list.addHead( node1 );
        list.addHead( node2 );
        list.addHead( node3 );

        assertEquals(3, list.size());

        list.removeAll();

        assertEquals(0, list.size());
    }

}
