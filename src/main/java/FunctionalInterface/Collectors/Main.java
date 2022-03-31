package FunctionalInterface.Collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<Employee> emp = Arrays.asList(
                Employee.builder().name("manoj").place("US").id(1).build(),
                Employee.builder().name("Alexa").place("Canada").id(2).build(),
                Employee.builder().name("Elena").place("Paris").id(3).build(),
                Employee.builder().name("Rand").place("Denver").id(4).build(),
                Employee.builder().name("Lorain").place("US").id(5).build(),
                Employee.builder().name("Steve").place("Canada").id(6).build(),
                Employee.builder().name("Dustin").place("Denver").id(7).build(),
                Employee.builder().name("John").place("Moscow").id(8).build()
        );

        List<Students> students = Arrays.asList(
          Students.builder().name("abc").age(12).build(),
                Students.builder().name("abc1").age(12).email(null).build(),
                Students.builder().name("abc2").age(18).email("null1").build(),
                Students.builder().name("abc3").age(15).email("null1").build(),
                Students.builder().name("abc4").age(17).email("null1").build(),
                Students.builder().name("abc5").age(12).email(null).build(),
                Students.builder().name("abc6").age(18).email("null1").build(),
                Students.builder().name("abc7").age(17).email(null).build(),
                Students.builder().name("abc8").age(17).email("null1").build()
        );

        var email = Optional.of(students.stream().map(Students::getEmail).collect(Collectors.toList()));
        System.out.println(email);


//        var x = students.stream().collect(Collectors.groupingBy(p->p.getAge()));
//        System.out.println(x);




////        Printing US and Non US employees using groupingBy and partitioning
//        var l= emp.stream()
//                .collect(Collectors.
//                        groupingBy(p->p.getPlace().equalsIgnoreCase("US")));
//        System.out.println(l);
//
////        Printing count of US and Non US employees
//
//        var m = emp.stream()
//                .collect(Collectors
//                        .groupingBy(p->p.getPlace().equalsIgnoreCase("US"),
//                                Collectors.counting()));
//        System.out.println(m);
//
////        each county with count
//        var n = emp.stream()
//                .collect(Collectors
//                        .groupingBy(p->p.getPlace(),
//                                Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(p->p.getValue()>1)
//                .collect(Collectors.toList());
//
//        var s = emp.stream()
//                .collect(Collectors
//                        .groupingBy(p->p.getPlace()));
//        System.out.println(n);


    }
}
