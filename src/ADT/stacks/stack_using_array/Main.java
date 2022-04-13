package ADT.stacks.stack_using_array;

import ADT.stacks.Employee;

public class Main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(10);
        System.out.println(arrayStack.size());
        arrayStack.push(new Employee("Arun","Tomar",123));
        arrayStack.push(new Employee("Anil","Verma",54));
        System.out.println(arrayStack.peek());
        arrayStack.push(new Employee("Varun","Silar",23));
        System.out.println(arrayStack.pop());
        arrayStack.push(new Employee("Harshit","Hawaldar",564));
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.size());
    }
}