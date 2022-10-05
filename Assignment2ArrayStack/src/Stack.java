public interface Stack<T> {

    /**
     * Adds a new entry to the top of this stack.
     *
     * @param item An object to be added to the stack.
     * @throws IllegalStateException - if the element cannot be added at this time due to capacity restrictions
     */

    void push(T item) throws IllegalStateException;


    /**
     * Removes and returns this stack's top entry.
     *
     * @return The object at the top of the stack.
     * @return null if the stack is empty
     */

    T pop() throws ArrayIndexOutOfBoundsException;


    /**
     * Retrieves this stack's top entry.
     *
     * @return The object at the top of the stack.
     * @return null if the stack is empty
     */

    T peek();


    /**
     * Detects whether this stack is empty.
     *
     * @return True if the stack is empty.
     */

    boolean isEmpty();


    /**
     * Retrieves the number of entries in this stack.
     *
     * @return number of entries.
     */

    int length();

}
