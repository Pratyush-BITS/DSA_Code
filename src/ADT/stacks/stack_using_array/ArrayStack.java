package ADT.stacks.stack_using_array;

import ADT.stacks.Employee;

import java.util.EmptyStackException;

public class ArrayStack {

   private int top;
   private Employee []stack;

   public ArrayStack(int capacity){
       stack = new Employee[capacity];
   }

   public void push (Employee e){
       if(top == stack.length) {
           System.out.println("Resizing the array");
           Employee [] newArray = new Employee[2*stack.length];
           System.arraycopy(stack,0,newArray,0,stack.length);
           stack = newArray;
       }
       stack[top++] = e;
   }

   public Employee  pop(){
       if (isEmpty()){
           throw new EmptyStackException();
       }
       Employee temp = stack[--top];
       stack[top] = null;
       return temp;
   }

   public boolean isEmpty(){
       return top == 0;
   }

   public Employee peek(){
       if (isEmpty()){
           return null;
       }
       return stack[top-1];
   }

   public int size(){
       return top;
   }
}
