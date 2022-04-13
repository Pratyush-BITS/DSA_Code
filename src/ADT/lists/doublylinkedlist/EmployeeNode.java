package ADT.lists.doublylinkedlist;

import ADT.lists.Employee;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode prev;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
        this.prev = null;
        this.next = null;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setPrev(EmployeeNode prev) {
        this.prev = prev;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrev() {
        return prev;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public Employee getEmployee() {
        return employee;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
