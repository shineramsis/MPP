package OOP;

public class Queue {
private int maxSize; // Maximum Capacity for the queue
private int[] queArray; // The array that holds the items
private int front;
private int rear;
private int nItems;
//constructor
public Queue(int s) {
maxSize = s; // set array size
queArray = new int[maxSize]; // create array
front = 0;
rear = -1;
nItems = 0; // no items yet
} // end of constructor
public void enqueue(int i) {
if (rear == maxSize - 1)
rear = -1;
queArray[++rear] = i; // increment rear, insert item
nItems++;
}
public int dequeue() {
int result = queArray[front]; // get value
front++; // increment front
if (front == maxSize) // deal with wraparound
front = 0;
nItems--;
return result;
}
public int peek() {
return queArray[front];
}
public boolean isEmpty() {
return (nItems == 0);
}
public boolean isFull() {
return (nItems == maxSize);
}
public int size() {
return nItems;
}
}
