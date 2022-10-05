public class ArrayStack<T> implements Stack<T> {
    private final T[] stackContents;
    private final int DEFAULT_SIZE = 5;
    private int count = 0;

    public ArrayStack() {
        // stackContents = new T[DEFAULT_SIZE];
        stackContents = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public void push(T item) throws IllegalStateException {
        /*
        check if array is full
        if it's full
        --throw exception
        if it's not full
        -- shift all contents of the array over one spot ; not done
        -- push the item onto the "top" which is index 0 ; done
         */

        if (count >= DEFAULT_SIZE) {
            throw new IllegalStateException();
        } else {
            stackContents[count] = item;
            count++;
        }

        // if we try to add/push an item
        // to the stack when the stack is already "full"
        //throw new IllegalStateException();
    }

    @Override
    public T pop() throws ArrayIndexOutOfBoundsException {
        try {
            return stackContents[--count]; //notice difference between --count and count-1 / --count decrements count
        } //returns the latest array element in the stack --count decreases first then returns the content count-- returns the content then decreases count
        catch (ArrayIndexOutOfBoundsException ee) {
            return null;
        }
        //in the case that an empty stack is popped, return nothing.
    }

    @Override
    public T peek() throws ArrayIndexOutOfBoundsException {
        try {
            return stackContents[count - 1]; //count-1 gives count-1, but does not decrement count
        } catch (ArrayIndexOutOfBoundsException ee) {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        //return stackContents[0] == null; doesn't work
        return count == 0;
    }

    @Override
    public int length() {
        return count;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += stackContents[i];
            if (i < count - 1) {
                output += ", "; //while there is an element in the array stack after the previous, add coma.
            }
        }
        return output;
    }
}
