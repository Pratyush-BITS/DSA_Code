package ADT.stacks.stack_using_Linked_list;

import ADT.stacks.Employee;

import java.util.LinkedList;

public class LinkedStack {

    private final LinkedList<Employee> empStack;

    public LinkedStack() {
        empStack = new LinkedList<>();
    }

    public boolean isEmpty(){
        return empStack.isEmpty();
    }

    public void push(Employee e){
        empStack.push(e);
    }

    public Employee pop(){
        return empStack.pop();
    }

    public Employee peek(){
        return empStack.peek();
    }

    public int size(){
        return empStack.size();
    }

    public void printStack(){
        empStack.forEach(System.out::println);
    }

}
