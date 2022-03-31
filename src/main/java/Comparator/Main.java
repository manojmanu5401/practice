package Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String arg[]){
        List<Employee> arr = new ArrayList<>();
        arr.add(new Employee("Manoj","Sai",1));
        arr.add(new Employee("Damon","Alaric",3));
        arr.add(new Employee("Rick","Grimes",2));

        System.out.println(arr);
       arr.sort(new Comparator<Employee>(){
           @Override
           public int compare(Employee o1, Employee o2) {
               return o1.getFirstName().compareTo(o2.getFirstName());
           }
       });

        Collections.sort(arr, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        Comparator<Employee> firstName = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };

        arr.sort(firstName);

        System.out.println("---------------------------");
       System.out.println(arr);
    }
}
