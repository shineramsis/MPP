/*
    Implementation to the queue using linked list
 */
package OOP;


public class MyQueue<E> {
    
    private MyLinkedList<E> list;
    
    public MyQueue(){
        list = new MyLinkedList<>();
    }
    
    //add element to the queue
    public void enqueue(E element){
        list.addLast(element);//in the queue the element added to the end of the que
    }
    
    //remove element from queue and return it
    public E dequeue(){
        return list.removeFirst(); //in queue, the element removed from head of queue
    }
    
}
