/*
-This class shows how the Java class Arraylist is implemented
-The implementation does not use interfaces and abstract classes as ArrayList or as explained in the Java book chapter 26
-More details, reveiw chapter 26 from Java book (page 959)


 */

package OOP;

/**
 *
 * @author mosheera
 */
public class MyArrayList<E> {  //make it generic as ArrayList
    private int size; //the size of the array list
    public static final int INITIAL_CAPACITY = 2;//the intial capacity of the array
    private E[] data  =  (E[]) new Object[INITIAL_CAPACITY];//this is the array that will hold the data
    //note that we can't create array of E -> so create array of Object then cast it to E[]
    
    
    //default constructor
    public MyArrayList(){
        
    }
    
    public int getSize(){
        return size;
    }
    
    //TODO: create constructor that take array of objects as parameter
   
//********************************** ADDDITION METHODS *********    
   
    //add an element to the array data in the specified index    
    public void add (E element, int index){
        ensureCapacity();//first step is to ensure the capacity
        
        //shift all the elements to the right, starting from the index
        for (int i = size-1; i >= index; i--)
            data[i+1] = data[i];
        
        data[index] = element;//insert new element to data[index]
        size++;//increase size by 1       
        
    }
    
    //add element to the end of the array
    public void add (E element){
        add (element, size);
    }
    
    /*
    when add new element, we need to make sure there is an available room (space) in the array to hold the new element
    if no available space in the current array -> create new array with double size +1, then copy 
    elements to the new array  
    */
    private void ensureCapacity(){
      if (size >= data.length ){ //no available rooms/space in the current array (data)
          E[] newData = (E[]) new Object[size*2 + 1];//create the new array with size = size*2 + 1. but +1??
          System.arraycopy(data, 0, newData, 0, size);//copy the old array (data) to new array (newData)
          data = newData;//current array is newData          
      }  
    }
    
 
//********************************** REMOVE METHODS *********     
    
   /*
    remove the element from the array at specified index. Return the removed element
    */  
    public E remove(int index){
        checkIndex(index);//first step is to make sure that index is valid
        
        E elementToRemove = data[index];//object that will be removed should be returned
        
        //shift all elements to the left
        for (int i = index ; i < size -1; i++) 
            data[i] = data[i+1];
       
        data[size-1] = null; //last element because it shifted
        size--;//decrement the size
        return elementToRemove;//return the removed element   
        
    }
              
    /*check that we have valid index. if not, throw exception
      to be used in remove methods and getters
    */
    private void checkIndex(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
    }
    
    //return the element in the specified index
    public E get(int index){
        checkIndex(index);
        return data[index];
    }
    
    
}
