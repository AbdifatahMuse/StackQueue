/**
 * Created by Jeremiah on 9/15/16.
 */
public class Main {
    public static void main(String[] args){
        StackQueueHw1 queue = new StackQueueHw1();

        queue.enqueue("hey");
        queue.enqueue("I");
        queue.enqueue("am");
        queue.enqueue("Jeremiah");
        queue.enqueue("now");
        queue.dequeue(); //removes hey
        queue.dequeue(); //removes i
        queue.dequeue();// removes am
        queue.enqueue("one ");
        queue.enqueue("more");
        queue.enqueue("time");
        queue.dequeue();  // removes jeremiah

        // i had to reverse the stack1 order here since both stacks had elements in them.
        queue.dequeue(); // removes now
        queue.enqueue("FIRST");
        queue.dequeue();// removes FIRST


        System.out.println("\nFinal elements in stack1: " + queue.stack1.toString());
        System.out.println("Final elements in stack2: " + queue.stack2.toString());
        System.out.println("Final elements in temp: "   + queue.temp.toString());


    }

}
