package hw03;

/**
 * Interface specifying a Queue ADT
 * 
 * @author William Goble
 * @author Dickinson College
 * @version Feb 8, 2024
 */
public interface CS232Queue <E>{
    /**
     * Add the provided element to the end of the Queue.
     * 
     * @param obj 
     *              the element to add
     */
    public void add(E element);

    /**
     * Remove and return the element at the head of the Queue.
     * 
     * @return 
     *          the element at the head of the Queue or null
     *          if the Queue is empty.
     */
    public E remove();

    /**
     * Return a reference to the element at the head of the Queue without 
     * removing it from the Queue.
     * 
     * @return 
     *          a reference to the element at the head of the Queue or
     *          null if the Queue is empty.
     */
    public E peek();

    /**
     * Return the number of elements in the Queue.
     * 
     * @return 
     *          the size of the Queue.
     */
    public int size();
}
