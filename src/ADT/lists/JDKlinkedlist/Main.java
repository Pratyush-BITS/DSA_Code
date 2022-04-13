package ADT.lists.JDKlinkedlist;

import ADT.lists.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Employee a = new Employee("James","Bond",7);
        Employee b = new Employee("Joey","Tribbiani",69);
        Employee c = new Employee("Marie","Bond",10);
        Employee d = new Employee("Mike","Tyson",5);

        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.addFirst(b);
        employeeList.addFirst(a);
        employeeList.addLast(c);
        employeeList.addLast(d);

        //employeeList.forEach(System.out::println);

        ListIterator<Employee> iterator = employeeList.listIterator(employeeList.size());
        while (iterator.hasPrevious() ){
            System.out.println(iterator.previous());
        }

    }
}
