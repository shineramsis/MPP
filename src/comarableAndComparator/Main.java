
package comarableAndComparator;

import java.util.*;

/**
 *
 * @author 984959
 */
public class Main {
    public static void main (String [] args){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(4, "Mosheer", "Ahmad"));
        list.add(new Student(3, "Sami", "Kafina"));
        list.add(new Student(2, "Mahmoud", "Sayed"));
        
        System.out.println("Sort using Combarable: ");
        Collections.sort(list);
        printList(list);
        
        System.out.println("Sort using Comparators: ");
        Collections.sort(list,  Student.FirstNameComparator );
        printList(list);
        
        System.out.println("Sort using Comparators2: ");
        Collections.sort(list,  Student.LastNameComparator );
        printList(list);
        
        
        List<Student> list2 = new ArrayList<Student>();
        list2.add(new Student(1, "test", "Ahmad"));
        list2.add(new Student(1, "test", "Kafina"));
        list2.add(new Student(1, "test", "Sayed"));
        
        System.out.println("Sort using Comparable, all fields sort: ");
        Collections.sort(list2 );
        printList(list2);
        
        
    }
    
    
    static void printList(List<Student> list){
       for (Student student : list)
            System.out.println(student); 
    }
}
