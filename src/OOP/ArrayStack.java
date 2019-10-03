package OOP;

public class ArrayStack {
private int[] stackArray; // The array that holds the items
private int top; // Index of top item in the stack
private int maxSize; // Maximum Capacity for the stack
// constructor
public ArrayStack(int s) {
maxSize = s; // set array size
stackArray = new int[maxSize]; // create array
top = -1; // no items yet
} // end of constructor
public void push(int i) {
top++;
stackArray[top] = i; // increment top, insert item
}
public int pop() {
int result = stackArray[top];
top--;
return result; // decrement top, return item
}
public int top() {
return stackArray[top];
}
public boolean isEmpty() {
return (top == -1);
}
public boolean isFull() {
return (top == maxSize - 1);
}

}






