package ADT.queues.queue_using_array;

import ADT.stacks.Employee;

public class Main {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.push(new Employee("Arun","Tomar",123));
        arrayQueue.push(new Employee("Anil","Verma",54));
        System.out.println("removed from front : "+arrayQueue.popFront()+"\n");
        arrayQueue.printQueue();

        arrayQueue.push(new Employee("Varun","Silar",23));
        arrayQueue.push(new Employee("pa","tr",123));
        arrayQueue.printQueue();
        System.out.println("removed from front : "+arrayQueue.popFront()+"\n");


        arrayQueue.push(new Employee("sa","df",54));
        arrayQueue.printQueue();
        System.out.println("removed from front : "+arrayQueue.popFront()+"\n");

        arrayQueue.push(new Employee("ga","tr",23));
        arrayQueue.printQueue();
        System.out.println("removed from front : "+arrayQueue.popFront()+"\n");

        arrayQueue.push(new Employee("re","we",23));
        arrayQueue.printQueue();
        System.out.println("removed from front : "+arrayQueue.popFront()+"\n");

        arrayQueue.push(new Employee("ma","qw",423));
        arrayQueue.printQueue();
        System.out.println("removed from front : "+arrayQueue.popFront()+"\n");

        arrayQueue.push(new Employee("dha","q23w",43));
        arrayQueue.printQueue();

        arrayQueue.push(new Employee("Arun","Tomar",123));
        arrayQueue.push(new Employee("Anil","Verma",54));
        arrayQueue.push(new Employee("Varun","Silar",23));
        arrayQueue.push(new Employee("pa","tr",123));
        arrayQueue.printQueue();



    }
}
