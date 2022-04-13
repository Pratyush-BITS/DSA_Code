package ADT.lists.singlylinkedlist;
import ADT.lists.Employee;


public class Main {
    public static void main(String[] args) {

        Employee a = new Employee("James", "Bond", 7);
        Employee b = new Employee("Joey", "Tribbiani", 69);
        Employee c = new Employee("Marie", "Bond", 10);
        Employee d = new Employee("Mike", "Tyson", 5);

        EmployeeSinglyLinkedList employeeLinkedList = new EmployeeSinglyLinkedList();
        employeeLinkedList.addToFront(a);
        employeeLinkedList.addToFront(b);
        employeeLinkedList.addToFront(c);
        employeeLinkedList.addToEnd(d);

        employeeLinkedList.print();
        System.out.println(employeeLinkedList.getSize());
        System.out.println(employeeLinkedList.removeFromFront());
        employeeLinkedList.print();
        System.out.println(employeeLinkedList.getSize());
        System.out.println(employeeLinkedList.removeFromEnd());
        System.out.println(employeeLinkedList.getSize());

        System.out.println(employeeLinkedList.removeFromEnd());
        System.out.println(employeeLinkedList.getSize());

        System.out.println(employeeLinkedList.removeFromEnd());
        System.out.println(employeeLinkedList.getSize());

        System.out.println(employeeLinkedList.removeFromEnd());
        System.out.println(employeeLinkedList.getSize());
    }
}
