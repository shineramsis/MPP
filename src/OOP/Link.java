package OOP;

public class Link {
public Object data; // data item
public Link next; // next link in list
// constructor
public Link (Object o) {
data = o; // initialize data
} // next is automatically set to null
public String toString () {
return data.toString ();
}
}
