/*
 * Implementing the linked list class. 
 * As I focus only on the functionality and how the methods implemented, I don't use interfaces and abstract classes,
    so all the logic added to this class
 */

package OOP;

/**
 *
 * @author mosheera
 * 
 *  Linked list class contain:
       1. a reference to the first node and a reference to the last node
       2. the list of methods to manipulate the linked list (i.e add, delete, update, find ..... etc)
 */
public class MyLinkedList<E> { //generic
    
    private Node<E> head;//reference to the first node in the list
    private Node<E> tail;//reference to the last node in the list
    private int size;//the size of the list
    
    public MyLinkedList(){//TODO: implement one that receive array of elements
        
    }
    
    //add this element to the begining linked list
    public void addFirst(E element){ 
        Node<E> node = new Node<E>(element);//create the node that holds this element        
        node.next = head;//link the new node with the head (no problem if head is null or not)
        head = node;//first now points to the new node which becomes first node
        size++;
        
        if (tail == null)//if list was empty (i.e. after adding new node, the list contains only this new node)
           tail = head;
        
        //you can implement as structure of addLast
              
    }
    
    //add this element to the last linked list
    public void addLast(E element){ 
        Node<E> node = new Node<E>(element);//create the node that holds this element
        
        if (tail == null)//list is empty
          head = tail = node;
        else{//list contain at leas one node
          tail.next = node;//link the head with this new node
          tail = node; //last now points to the new node which becomes last node  
        } 
        
        size++; //increase the size           
    }
    
    public void add(int index, E element){ //add this element to the specified index (i.e. the index of new node should equal provided index)       
        //3 cases of index
        if (index == 0) addFirst(element);
        else if (index >= size) addLast(element);
        else{//element should be added between two nodes
            Node<E> temp;
            temp = head;
            //find the node that we should add after it
            for (int i = 1; i < index; i++) //i MUST start from 1, other wise the index of the new node will be (index+1) not index
              temp = temp.next;
            
            //new node should be added after temp
            Node<E> node = new Node<E>(element);//create the node that holds this element
            node.next = temp.next;
            temp.next = node;
             size++; 
        }//else
              
    }
    
   
   //remove the first element in the node
   public E removeFirst(){
      if (size == 0) return null; //the list is empty
      
      Node<E> temp =  head;//keep the element because we want to return it
      head = head.next;//head point to next tod node -> first node removed
      if (head == null) //if list was contain only one node
          tail = null;
      size--;//decrease the size by 1
      return temp.element;
   }
   
   //remove the last element in the list
   public E removeLast(){
     if (size == 0) return null; //the list is empty
     else if (size == 1){ //the list contain only one node
       Node<E> temp = head;
       head = tail = null;//list becomes empty
       size = 0;
       return temp.element;
     }
     else{ //list has at least two nodes
        //find the node before the last 
         Node<E> current = head;
         for (int i = 0; i < size-2; i++)
             current = current.next;
         
         //current now point to the node before last
         Node<E> temp = tail;//keep the last node
         tail = current; 
         tail.next = null;
         size--;
         return temp.element;        
     }
   }
   
   //remove the element at specified index
   public E remove(int index){
     if (index < 0 || index >= size) return null; //invalid index
     else if (index == 0) return removeFirst();
     else if (index == size-1) return removeLast();
     else{ //the index in body of the list
         //find the node before the index
         Node<E> previous = head;
         for (int i = 1; i < index; i++)
             previous = previous.next;
         
         Node<E> nodeToRemove = previous.next;
         previous.next = nodeToRemove.next;
         size--;
         return nodeToRemove.element;
     }
   }
    
   
}
