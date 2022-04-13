package ADT.stacks.stack_using_Linked_list;

import ADT.stacks.Employee;

public class Main {
    public static void main(String[] args) {

        LinkedStack linkedListStack = new LinkedStack();
        System.out.println(linkedListStack.size());
        System.out.println(linkedListStack.isEmpty());
        linkedListStack.push(new Employee("Arun","Tomar",123));
        linkedListStack.push(new Employee("Anil","Verma",54));
        System.out.println(linkedListStack.peek());
        linkedListStack.push(new Employee("Varun","Silar",23));
        System.out.println(linkedListStack.size());

        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.size());
        linkedListStack.push(new Employee("Harshit","Hawaldar",564));
        System.out.println(linkedListStack.peek());
        System.out.println(linkedListStack.size());

        System.out.println("printing stack");
        linkedListStack.printStack();

    }
}
