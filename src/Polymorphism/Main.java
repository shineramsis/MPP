
package Polymorphism;

import java.util.*;

/**
 *
 * @author 984959
 */
public class Main {
    
    public static void main (String [] args){
        List<Employee> list = new ArrayList<Employee>();//make array list of Parent
        list.add(new Faculty());  //Faculty is Employee
        list.add(new Staff());//Staff is Employee
        
        
        int sum = 0;
        for (Employee emp : list){
            sum += emp.getSalary();//the method called based on the actual object type
            System.out.println("Salary: " + emp.getSalary() + ", class "+ emp.getClass());
        }
        
        
        
    }
    
}
