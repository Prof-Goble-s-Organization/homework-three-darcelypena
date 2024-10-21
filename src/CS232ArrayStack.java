package hw03;

public class CS232ArrayStack<E> implements CS232Stack<E> {

	private CS232ArrayList arrayList;
	
	public CS232ArrayStack() {
	}
	
	/**
     * Add the provided element to the top of the stack.
     * 
     * @param obj the element to push onto the stack.
     */
    public void push(E obj) {
    	arrayList.add(obj);
    }
    
    /**
     * Remove the element from of the top of the stack and return it.
     * 
     * @return the element from the top of the stack or null if the stack is
     *         empty.
     */
    public E pop() {
    	return (E) arrayList.remove(arrayList.size()-1);
    }
    
    /**
     * Return a reference to the element on the top of the stack without
     * removing it.
     * 
     * @return a reference to the element on the top of the stack or null if the
     *         stack is empty.
     */
    public E peek() {
    	return (E) arrayList.get(arrayList.size()-1);
    }
    
    /**
     * Return the number of elements contained in the stack.
     * 
     * @return the size of the stack.
     */
    public int size() {
    	return arrayList.size();
    }
}
