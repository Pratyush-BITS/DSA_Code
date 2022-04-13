package ADT.lists.circularlinkedlist;

import ADT.lists.Employee;

public class EmployeeCircularLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if (head == null) {
            tail = node;
        }
        else {
            head.setPrev(node);
        }
        head = node;
        head.setPrev(tail);
        tail.setNext(head);
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setPrev(tail);
        if(tail==null)
            head=node;
        else
            tail.setNext(node);
        tail = node;
        tail.setNext(head);
        head.setPrev(tail);
        size++;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty())
            return null;
        size--;
        EmployeeNode temp = head;
        if(tail==head){
            tail = null;
            head = null;
            return temp;
        }
        else
            head.getNext().setPrev(tail);
        head = head.getNext();
        tail.setNext(head);
        temp.setNext(null);
        temp.setPrev(null);
        return temp;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty())
            return null;
        size--;

        EmployeeNode temp = tail;
        if(tail==head){
            tail = null;
            head = null;
            return temp;
        }
        else
            tail.getPrev().setNext(head);
        tail = tail.getPrev();
        head.setPrev(tail);
        temp.setNext(null);
        temp.setPrev(null);
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
        do{
            System.out.println(curr);
            curr = curr.getNext();
        }while (curr!=head);
    }
}
