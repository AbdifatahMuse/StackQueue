/**
 * Created by Jeremiah on 9/15/16.
 *
 * This program implements a queue using three stacks
 * This was a problem a challenge problem in algorithms 4th edition
 * by robert sedgewick and kevin wayne
 *
 * The way i solved this problem was similar to the algorithm for solving
 * the Fibonacci sequence.
 *
 *
 */

import java.util.*;


public class StackQueueHw1 {

    Stack stack1 = new Stack();
    Stack stack2 = new Stack();
    Stack temp   = new Stack();

// Adds a element in the stack1
    public void enqueue(String element) {
        stack1.push(element);
        System.out.println(stack1.toString() + " Stack1");
    }


        public void dequeue(){
            System.out.println("\nDequeue");

            // If both stacks have elements in them stack1 needs more than 1 element
            if(!stack1.empty() & stack1.size()> 1 & !stack2.empty()) {           // if there are elements in both stacks
                while (!stack2.empty()) {
                    temp.push(stack2.pop()); // stack2 reversed is now in temp
                }
                while (!temp.empty()) {
                    stack1.push(temp.pop()); // temp reversed is in stack1
                }
                System.out.println(stack1.pop() + " Has been removed");

                if(stack2.empty()){
                    while (!stack1.empty()) {
                        temp.push(stack1.pop());
                    }
                    stack1.addAll(temp);
                    temp.removeAllElements();
                }
                }
           else if(stack1.empty()){
                System.out.println(stack2.pop() + " Has been removed");
            }else {
                while (!stack1.empty()) {
                    stack2.push(stack1.pop());

                }
            System.out.println(stack1.toString()+ " stack1");
            System.out.println(stack2.toString()+" stack2");
            System.out.println(stack2.pop() + " Has been removed");
                    }

        }
    }




