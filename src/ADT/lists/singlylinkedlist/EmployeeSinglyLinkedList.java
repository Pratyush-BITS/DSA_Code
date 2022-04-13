package ADT.lists.singlylinkedlist;
import ADT.lists.Employee;

public class EmployeeSinglyLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        EmployeeNode temp = head;
        while (temp.getNext()!=null)
            temp = temp.getNext();
        temp.setNext(node);
        size++;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty())
            return null;
        EmployeeNode temp = head;
        head=head.getNext();
        size--;
        temp.setNext(null);
        return temp;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty())
            return null;
        EmployeeNode temp = head, temp2 = temp;
        while (temp.getNext()!=null) {
            temp2= temp;
            temp = temp.getNext();
        }
        if(temp == head)
            head = null;
        size--;
        temp2.setNext(null);
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
