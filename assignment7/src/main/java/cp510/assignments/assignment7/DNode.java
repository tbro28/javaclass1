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

    /**
     * Empty constructor.
     */
    public DNode() {

        this(null);

    }

    /**
     *
     * Constructor with an object parameter.
     *
     * @param data
     */
    public DNode(Object data) {
        flink = this;
        blink = this;
        this.data = data;
    }


    /**
     *
     * Returns the data stored in this object.
     *
     * @return the data element of the node.
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
     * Returns true if this node is enqueued, false otherwise.
     * The implementation is given in the class notes.
     * Slide 50
     * Slide 41
     *
     * @return a boolean in regards to whether the node is enqueued or not.
     */
    public boolean isEnqueued() {

        //If this does not equal flink, then true.
        //If this does equal flink, then false,
        // because this points to flink and is un-enqueued.
        boolean result = this != flink;
        return result;

    }

    /**
     *
     * Enqueues the given node after this node.
     * The implementation was illustrated in class.
     * Throws IllegalArgumentException if the given node is already enqueued.
     *
     * @param node
     * @throws IllegalArgumentException
     */
    public void addAfter( DNode node ) throws IllegalArgumentException {

        if(node.isEnqueued())
            throw new IllegalArgumentException();

        node.flink = flink;
        node.blink = this;
        node.flink.blink = node;
        flink = node;
    }

    /**
     *
     * Enqueues the given node before this node.
     * The implementation was illustrated in class.
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
     * Returns the next node in the list if enqueued.
     * If not enqueued, returns this.
     * The implementation is given in the class notes.
     *
      * @return the next node.
     */
    public DNode getNext() {
        return flink;
    }

    /**
     *
     * Returns the previous node in the list if enqueued.
     * If not enqueued, returns this.
     *
      * @return the previous node.
     */
    public DNode getPrevious() {
        return blink;
    }

    /**
     *
     * Removes this node from the queue that contains it, if any.
     * It is not a mistake if
     * this node is not enqueued. Returns this.
     *
     * @return the de-queued node.
     */
    public DNode remove() {

        //set the back node flink to the node in front.
        this.blink.flink = this.flink;

        //set the front node blink to the node in back.
        this.flink.blink = this.blink;

        //de-queuing the current node.
        this.blink = this;
        this.flink = this;

        return this;
    }

}
