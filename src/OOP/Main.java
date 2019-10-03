
package OOP;

import java.io.IOException;

/**
 *
 * @author mosheera
 */
public class Main {
     public static void main(String[] args) throws IOException {
         MyLinkedList<String> list = new MyLinkedList<String>();
         list.add(0, "Zero");
         list.add(1, "One");
         list.add(2, "Three");
         list.add(2, "Two");//add to the second index
         
         
         //********************************************stack
         MyStack<String> stack = new MyStack<>();
         stack.push("1");
         stack.push("2");
         stack.push("3");         
         System.out.println("Elements pushed to stack in order 1, 2, 3. They poped from the stack in order: ");
         for (int i = 0; i < 3; i++ )
             System.out.println(stack.pop());         
         
         //********************************************Queue:
         MyQueue<String> queue = new MyQueue<>();
         queue.enqueue("1");
         queue.enqueue("2");
         queue.enqueue("3");
         System.out.println("Elements added to queue in order 1, 2, 3. They enqueue from the queue in order: ");
         for (int i = 0; i < 3; i++ )
             System.out.println(queue.dequeue());
     }
    
}
