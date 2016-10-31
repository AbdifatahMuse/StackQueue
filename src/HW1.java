/**
 * Created by Jeremiah on 9/13/16.
 *
 * This program uses two stacks to create a queue
 * By creating stack1 and filling it
 * then emptying the stack into stack2
 * next you empty out stack2 this mimics a queue
 *
 * A stack is a container of objects that are inserted
 * and removed according to the last-in first-out (LIFO) principle.
 * In the pushdown stacks only two operations are allowed: push the
 * item into the stack, and pop the item out of the stack.
 *
 *
 */

import java.util.*; // Imports Stack jazz

public class HW1 {

    public static void main(String [] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        stack1.push("Hey ");
        stack1.push("My ");
        stack1.push("Name ");
        stack1.push("Is ");
        stack1.push("Jeremiah ");

        //This is what stack1 looks like
        // | Jeremiah |
        // | Is       |
        // | Name     |
        // | My       |
        // | Hey      |
        // |__________|


        int sizeOfStack1 = stack1.size();
        //This just prints the elements of the stack
        for(int i = 0; i < sizeOfStack1; i++){
            System.out.println(stack1.elementAt(i));

        }
        System.out.println(stack1.toString()); //This is another way to print the stack


        for( int i = 0; i < sizeOfStack1 ; i++){
            // I am pushing (placing) the top element in stack1 into stack2
            System.out.println(stack2.push(stack1.peek()));
            //I am popping (removing) the top element of stack1
            stack1.pop();
        }
        //This is what stack2 looks like now
        // | Hey      |
        // | My       |
        // | Name     |
        // | Is       |
        // | Jeremiah |
        // |__________|

        System.out.println(stack2.toString());



    }
}
