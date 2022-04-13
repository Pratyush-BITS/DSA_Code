package ADT.lists.doublylinkedlist;
import ADT.lists.Employee;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;


    /**
     * Inserts the Employee object at the start of the list
     * @param employee The employee object to be added
     */
    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if (head == null)
            tail= node;
        else
            head.setPrev(node);
        head = node;
        size++;
    }


    /**
     * Inserts the Employee object at the end of the list
     * @param employee The employee object to be added
     */
    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setPrev(tail);
        if(tail==null)
            head=node;
        else
            tail.setNext(node);
        tail = node;
        size++;
    }


    /**
     * Inserts Employee e1 in the list just after Employee e2
     * @param e1 The employee object to be added
     * @param e2 The employee object that should be placed before e1 in the list
     * @returns true if the employee is successfully added
     */
    public boolean addBefore(Employee e1, Employee e2){

        if(head==null)
            return false;

        EmployeeNode temp = head;
        while (temp != null && !temp.getEmployee().equals(e2))
            temp = temp.getNext();

        if(temp!=null){
            EmployeeNode node = new EmployeeNode(e1);
            if(temp.getPrev()!=null) {
                temp.getPrev().setNext(node);
                node.setPrev(temp.getPrev());
            }
            else
                node.setPrev(null);
            temp.setPrev(node);
            node.setNext(temp);
            return true;
        }
        return false;
    }


    /**
     * Inserts employee e1 in the list just after e2
     * @param e1 - The employee to be added
     * @param e2 - The employee that should be placed after e1 in the list
     * @returns true if the employee is successfully added
     */
    public boolean addAfter(Employee e1, Employee e2){

        if(head==null)
            return false;

        EmployeeNode temp = head;
        while (temp != null && !temp.getEmployee().equals(e2))
            temp = temp.getNext();

        if(temp!=null){
            EmployeeNode node = new EmployeeNode(e1);
            if(temp.getNext()!=null) {
                temp.getNext().setPrev(node);
                node.setNext(temp.getNext());
            }
            else
                node.setNext(null);
            temp.setNext(node);
            node.setPrev(temp);
            return true;
        }

        return false;
    }


    public EmployeeNode removeFromFront(){
        if(isEmpty())
            return null;
        EmployeeNode temp = head;
        if(head.getNext()==null)
            tail = null;
        else
            head.getNext().setPrev(null);
        head = head.getNext();
        temp.setNext(null);
        size--;
        return temp;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty())
            return null;
        EmployeeNode temp = tail;
        if(tail.getPrev()==null)
            head = null;
        else
            tail.getPrev().setNext(null);
        tail = tail.getPrev();
        temp.setNext(null);
        size--;
        return temp;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int getSize(){
        return size;
    }

    public void print() {
        EmployeeNode curr = head;
        while (curr!=null){
            System.out.println(curr);
            curr = curr.getNext();
        }
    }
}
