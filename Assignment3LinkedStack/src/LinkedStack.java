public class LinkedStack<T> implements Stack<T> {
    private Node head;
    private int count;

    @Override
    public void push(T item) {
        // in a linked node implementation
        // we won't run into an IllegalStateException
        if (head == null) {
            // nothing's in there
            head = new Node(item, null);
            // this node is now both the head and tail
        } else {
            // there are existing items in the linked list
            Node newNode = new Node(item, head);
            // create a new node, and make that node's next
            // the current head
            head = newNode;
        }
        count++;
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        T poppedItem = head.data;
        head = head.next;
        count--;
        return poppedItem;
    }

    @Override
    public T peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int length() {
        return count;
    }

    @Override
    public String toString() {
        return "" + head;
    }

    private class Node {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this.data = data;
        }

//        @Override
//        public String toString() {
//            String line = "" + data;
//            Node itr = next;
//            while (itr != null) {
//                line += ", " + itr.data;
//                itr = itr.next;
//            }
//            return line;
//        }

        @Override
        public String toString() {
            String line = "" + data;
            if (next != null) {
                line += ", " + next;
            }
            return line;
        }
    }
}

/*
        IGNORE THIS
                @Override
        public String toString() {
            String line = "";
            while (head.next != null) {
                line += data + ", " + next;

            }
            return line;
        } this would work if you include an iterator.

 */