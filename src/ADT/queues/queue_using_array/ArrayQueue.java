package ADT.queues.queue_using_array;

import ADT.stacks.Employee;

/**
 * Using arrays to make a circular queue
 */
public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void push(Employee e){
        if (size() == queue.length - 1) {
            System.out.println("resizing");
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);
            queue = newArray;
            front = 0;
            back = numItems;
        }

        queue[back] = e;
        back = (++back)%queue.length;
    }

    public Employee popFront(){
        if (isEmpty())
            return null;

        Employee temp = queue[front];
        queue[front] = null;
        System.out.println(front+" "+back);
        front = ++front % queue.length;
        if(size() == 0)
            back =0;
        return temp;
    }

    public boolean isEmpty(){
        return queue[front]==null;
    }

    public int size(){
        if (front <= back)
            return back - front;
        return back - front + queue.length;
    }

    public Employee peekFirst(){
        return queue[front];
    }

    public Employee peekLast (){
        return queue[back];
    }

    public void printQueue(){
        System.out.println("printing Queue");

        if(front<=back) {
            for (int i = front; i < back; i++)
                System.out.println(queue[i] + " i = "+i);
        }
        else{
            for (int i = front;i< queue.length;i++)
                System.out.println(queue[i] + " i = "+i);
            for (int i = 0;i<back;i++)
                System.out.println(queue[i] + " i = "+i);
        }
    }

}
