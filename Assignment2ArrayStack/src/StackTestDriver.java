public class StackTestDriver {

//    public static void fullPush(int num) {
//        for (int i = 0; i < num; i++) {
//            myStack.push(i);
//        }
//        System.out.println(myStack);
//    }
//
//    public static void testMethods() {
//        myStack.push(1);
//        myStack.push(3);
//        myStack.push(5);
//        System.out.println("stack is: " + myStack);
//        System.out.println("length is: " + myStack.length());
//        System.out.println("when popped: " + myStack.pop());
//        System.out.println("stack is: " + myStack);
//        System.out.println("length is: " + myStack.length());
//        System.out.println("when peeked: " + myStack.peek());
//        System.out.println("stack is: " + myStack);
//        System.out.println("length is: " + myStack.length());
//    }
//
//    public void isEmpty() {
//        System.out.println("stack is: " + myStack);
//        System.out.println("stack is empty: " + myStack.isEmpty());
//        myStack.push(1);
//        System.out.println("stack is: " + myStack);
//        System.out.println("stack is empty: " + myStack.isEmpty());
//        System.out.println("when popped: " + myStack.pop());
//        System.out.println("stack is: " + myStack);
//        System.out.println("stack is empty: " + myStack.isEmpty());
//    }
//
//    public void length() {
//        System.out.println("stack is: " + myStack);
//        System.out.println("length is: " + myStack.length());
//        myStack.push(1);
//        myStack.push(2);
//        System.out.println("stack is: " + myStack);
//        System.out.println("length is: " + myStack.length());
//        System.out.println("when popped: " + myStack.pop());
//        System.out.println("stack is: " + myStack);
//        System.out.println("length is: " + myStack.length());
//    }
//
//    public void stringTest() {
//        myStrings.push("bill");
//        myStrings.push("mill");
//        myStrings.push("jill");
//        myStrings.push("hill");
//        System.out.println("stack is: " + myStrings.toString().toUpperCase());
//        System.out.println("when popped: " + myStrings.pop());
//        System.out.println("stack is: " + myStrings);
//        System.out.println("Array stack will be split via ',' ");
//        for (int i = 0; i < myStrings.length(); i++) {
//            String[] arrayString = myStrings.toString().split(",");
//            System.out.println("arrayString[" + i + "]" + " = " + arrayString[i].trim());
//        }
//    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new ArrayStack<>();
        Stack<String> myStrings = new ArrayStack<>();

        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.length());
        //fullPush(4);
        //testMethods();
//        isEmpty();
//        length();
//        stringTest();
    }
}