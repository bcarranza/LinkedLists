/**
 * @author BC
 * @version 1.0
 */
public class SimpleNode extends Node
{
    /**
     * This attribute contains next node on the list.
     */
    SimpleNode nextNode;
    /**
     * Constructor
     */
    public SimpleNode()
    {
        this.nextNode=null;
    }
    /**
     * Get a value of this node
     */
    public int getValue()
    {
        return this.value;
    }
    /**
     * Set a value of this node
     */
    public void setValue(int value)
    {
        this.value=value;
    }
    /**
     * Get a next node linked this node
     */
    public SimpleNode getNextNode()
    {
        return this.nextNode;
    }
    /**
     * Set a next node linked this node
     */
    public void setNextNode(SimpleNode nextNode)
    {
        this.nextNode=nextNode;
    }
}