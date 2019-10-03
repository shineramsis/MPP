/*
  Implementation the stack using the Arraylist
  Stack is a list and the elementes added/removed from the end of the stack
 */
package OOP;

/**
 *
 * @author 984959
 */
public class MyStack<E> {
    MyArrayList<E> list; //stack consists of list
    
    public MyStack(){
        list = new MyArrayList<>();
    }
    
    //push: adds an element to the end of the stack
    public void push(E element){
        list.add(element); //this method add the element to the end of the stack
    }
    
    //pop: removes the top element form the stack and return it
    public E pop(){
      return list.remove(list.getSize() - 1); 
    }
    
}
