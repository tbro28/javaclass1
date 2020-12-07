package cp510.assignments.assignment7;

/**
 * 
 * This class has no properties other than those inherited from the superclass.
 * It has no constructors other than the default. It has the following methods.
 *
 * @author Tim Brown
 */
public class DList extends DNode {

    /**
     *
     *     Adds the given node to the head of this list.
     *     The implementation is given
     *     in the class notes.
     *
      * @param node
     */
    public void addHead( DNode node ) {

        addAfter( node );

    }


    /**
     *
     *     Adds the given node to the end of this list.
     *
     * @param node
     */
    public void addTail( DNode node ) {
        addBefore( node );
    }


    /**
     *
     *    Removes the first node from the list and returns it.
     *    If the list is empty this is returned.
     *    The implementation is given in the class notes.
     *
     * @return the head node that was removed.
     */
    public DNode removeHead() {
        DNode head = getNext();
        return head.remove();
    }


    /**
     *
     *     Removes the last node from the list and returns it.
     *     If the list is empty this is returned.
     *
      * @return the tail node that was removed.
     */
    public DNode removeTail() {

        DNode tail = getPrevious();
        return tail.remove();
    }


    /**
     *
     *     Returns the first node in the list (without removing it).
     *     If the list is empty this is returned.
     *     The implementation is given in the class notes.
     *
      * @return the next node.
     */
    public DNode getHead() {
        return getNext();
    }


    /**
     *
     *     Returns the last node in the list (without removing it).
     *     If the list is empty this is returned.  Slide 62.
     *
     * @return the tail node.
     */
    public DNode getTail() {
        if(isEmpty())
            return this;
        else
            return getPrevious();
    }


    /**
     *
     *     Removes all items from the list, leaving the list empty.
     *     The implementation is given in the class notes.
     *
     */
    public void removeAll() {
        DNode node;
        while ((node = getNext()) != this)
            node.remove();
    }


    /**
     *
     *     Returns true if this list is empty, false otherwise.
     *
     * @return a boolean for whether the list is empty or not.
     */
    public boolean isEmpty() {

        if(this.getNext() == this)
            return true;
        else
            return false;
    }


    /**
     *
     *     Returns the number of nodes in this list.
     *     The implementation is given in the class notes.
     *
     * @return the size of the list.
     */
    public int size() {

        int 	count   = 0;
        DNode	node	= getHead();
        while ( node != this )
        {
            ++count;
            node = node.getNext();
        }

        return count;
    }

}
