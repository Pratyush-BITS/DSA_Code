package ADT.lists.vector;

import ADT.lists.Employee;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("James","Bond",7));
        employeeList.add(new Employee("Joey","Tribbiani",69));
        employeeList.add(new Employee("Marie","Bond",10));
        employeeList.add(new Employee("Mike","Tyson",5));
//        employeeList.forEach(System.out::println);
//        System.out.println(employeeList.get(1));
//        System.out.println(employeeList.size());
        employeeList.set(1,new Employee("Ken","Adams",69));
//        System.out.println(employeeList.get(1));

//        Employee []arr = employeeList.toArray(new Employee[0]);
//        for (Employee e: arr)
//            System.out.println(e);

        System.out.println(employeeList.contains(new Employee("Marie","Bond",10)));
        System.out.println(employeeList.indexOf(new Employee("Marie","Bond",10)));
        employeeList.remove(3);
        employeeList.forEach(System.out::println);

    }
}
