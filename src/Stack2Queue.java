/**
 * Created by Jeremiah on 9/18/16.
 *
 *
 * This program implements a queue using two stacks.
 *
 *
 */

import java.util.Stack;

public class StackQueue<T> { //Stack<T> is a generic datatype
    private Stack<T> writeStack = new Stack<T>();
    private Stack<T> readStack = new Stack<T>();

    public void enqueue(T element) {
        writeStack.push(element);
    }


    /**
     *
     * @dequeue
     *
     * This method maintains two stacks, a good analogy of this process
     * is to consider the first stack the “inbox” and the second stack the
     * “outbox”. When items are transferred from the inbox to the outbox,
     * no more will be added until the outbox has been completely emptied.
     *
     */

    public T dequeue(){
        if (readStack.empty()) {
            while (!writeStack.empty()) {
                readStack.push(writeStack.pop());
            }
        }
        return readStack.pop();
    }
}
