package cp510.assignments.assignment7;

/**
 *
 * This class will have the following properties, constructors and methods.
 *
 * @author Tim Brown
 */
public class DNode {


    private DNode flink;
    private DNode blink;
    private Object data;


    public DNode() {

        this(null);

    }

    public DNode(Object data) {
        flink = this;
        blink = this;
        this.data = data;
    }


    /**
     *
     * Returns the data stored in this object.
     *
     * @return
     */
    public Object getData() {
        return data;
    }

    /**
     *
     * Sets the data property to the given value.
     *
     * @param data
     */
    public void setData(Object data) {
        this.data = data;
    }


    /**
     *
     * Returns true if this node is enqueued, false otherwise. The implementation is
     * given in the class notes.
     *
     * Slide 50
     * Slide 41
     *
     * @return
     */
    public boolean isEnqueued() {
/*
        boolean enqueued = false;
        if(flink != this && blink != this)
            enqueued = true;
        return enqueued;
*/
        boolean result = this != flink;
        return result;

    }

    /**
     *
     * Enqueues the given node after this node.The implementation was illustrated in class.
     * Throws IllegalArgumentException if the given node is already enqueued.
     *
     * @param node
     * @throws IllegalArgumentException
     */
    public void addAfter( DNode node ) throws IllegalArgumentException {

        DNode nodeAfter = this.flink;  //get the next node that this one object is pointing to.

        //if(node.flink == node && node.blink == node)
        if(node.isEnqueued())
            throw new IllegalArgumentException();


/*
        nodeAfter.blink = node;     //point next node back link to the node to insert.
        node.flink = nodeAfter;     //point the node to insert's next link to the next node.

        this.flink = node;          //point this object's next link to the node to insert.
        node.blink = this;          //point the node to insert's back link to this node.
*/
        //this.flink = node.blink;

        node.flink = flink;
        node.blink = this;
        node.flink.blink = node;
        flink = node;


    }

    /**
     *
     * Enqueues the given node before this node.The implementation was illustrated in class.
     * Throws IllegalArgumentException if the given node is already enqueued.
     *
     * @param node
     * @throws IllegalArgumentException
     */
    public void addBefore( DNode node ) throws IllegalArgumentException {

        if(node.isEnqueued())
            throw new IllegalArgumentException();

        node.flink = this;
        node.blink = blink;
        blink = node;
        node.blink.flink = node;

    }

    /**
     *
     * Returns the next node in the list if enqueued. If not enqueued, returns this.
     * The implementation is given in the class notes.
     *
      * @return
     */
    public DNode getNext() {
        return flink;
    }

    /**
     *
     * Returns the previous node in the list if enqueued. If not enqueued, returns this.
     *
      * @return
     */
    public DNode getPrevious() {
        return blink;
    }

    /**
     *
     * Removes this node from the queue that contains it, if any. It is not a mistake if
     * this node is not enqueued. Returns this.
     *
     * @return
     */
    public DNode remove() {

        this.blink.flink = this.flink;  //set the back node flink to the node in front.
        this.flink.blink = this.blink;  //set the front node blink to the node in back.

        //dequeuing the current node.
        this.blink = this;
        this.flink = this;

//System.out.println("remove");

        return this;
    }



}
