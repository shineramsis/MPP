/*
 *This class represents a node that will be added to a linked list
 */

package OOP;

/**
 *
 * @author mosheera
 */
public class Node<E> {  //make it Generic
    
   //each node consists of data and pointer to the next node
    E element; //data
    Node<E> next;//pointer to the next node
    
    
    //create new node
    public Node(E e){
       this.element = e; 
    }
    
}
