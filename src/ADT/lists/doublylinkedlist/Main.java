package ADT.lists.doublylinkedlist;
import ADT.lists.Employee;

public class Main {
    public static void main(String[] args) {

        Employee a = new Employee("James","Bond",7);
        Employee b = new Employee("Joey","Tribbiani",69);
        Employee c = new Employee("Marie","Bond",10);
        Employee d = new Employee("Mike","Tyson",5);

        EmployeeDoublyLinkedList employeeLinkedList = new EmployeeDoublyLinkedList();
        employeeLinkedList.addToFront(b);
        System.out.println(employeeLinkedList.addBefore(a,b));
        employeeLinkedList.addToEnd(d);
        System.out.println(employeeLinkedList.addAfter(c,b));
        System.out.println("list");
        employeeLinkedList.print();

        System.out.println(employeeLinkedList.getSize());
        System.out.println(employeeLinkedList.removeFromFront());

        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.print();

        System.out.println(employeeLinkedList.getSize());
        System.out.println(employeeLinkedList.removeFromFront());

        System.out.println(employeeLinkedList.getSize());
        System.out.println(employeeLinkedList.removeFromEnd());

        System.out.println(employeeLinkedList.getSize());
        System.out.println(employeeLinkedList.removeFromEnd());
        System.out.println(employeeLinkedList.getSize());

    }
}
