package OOP;

public class LinkedList {
private Link head; // reference to the head of the list
// constructor
public LinkedList () {
head = null;
}
public boolean isEmpty () {
return (head == null);
}
public void insertFirst (Object o) {
Link newLink = new Link (o);
newLink.next = head;
head = newLink;
}
public Object removeFirst () {
Link temp = head;
head = head.next;
return temp.data;
}
}