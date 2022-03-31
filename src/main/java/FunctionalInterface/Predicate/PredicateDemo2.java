package FunctionalInterface.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args){
        Predicate<Route> pre = (p)->{
            if(p.getContract() ==true){
                return true;
            }
            return false;
        };
        List<Route> list = Arrays.asList(
                Route.builder().contract(true).price(10000.0).hours(144).build(),
                Route.builder().contract(false).price(50000.0).hours(120).build(),
                Route.builder().contract(true).price(100000.0).hours(240).build(),
                Route.builder().contract(true).price(90000.0).hours(340).build(),
                Route.builder().contract(false).price(20000.0).hours(220).build()
        );

        list.stream().filter(pre).forEach(p->System.out.println(p.getHours()));
    }



}
