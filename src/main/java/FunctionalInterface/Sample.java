package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args){

//        .....................Example is from Jawaharlal Nehru to Jebel Ali..................
        List<Routes> routes= new ArrayList<>(List.of(
                Routes.builder().contract(true).price(10000.0).hours(144).build(),
                Routes.builder().contract(false).price(50000.0).hours(120).build(),
                Routes.builder().contract(true).price(100000.0).hours(240).build(),
                Routes.builder().contract(true).price(90000.0).hours(340).build(),
                Routes.builder().contract(false).price(20000.0).hours(220).build()
        ));

//        ............Map only prices......................
//List<Routes>----->List<Double>
        List<Double> prices = routes.stream()
                .map(route->route.getPrice())
                .collect(Collectors.toList());

        System.out.println(prices);

//        ..........Map only prices which are under contract........

        List<Double> pricesWithContract = routes.stream()
                .filter(route -> route.getContract()==true)
                        .map(r -> r.getPrice())
                        .collect(Collectors.toList());

        System.out.println(pricesWithContract);

//        .........Map-reduce to number of routes with contract................

        var n = routes.stream()
                .filter(route -> route.getContract()==true)
                .map(r -> r.getPrice())
                .count();

        System.out.println(n);

//        ..........Map-reduce : to get minimum time taken route ................

        var time = routes.stream()
                .filter(route -> route.getContract()==true)
                .map(r -> r.getHours())
                .reduce(0,(x,y)->x<y?x:y);

        System.out.println(time);

//        List<Boolean> contracts = routes.stream()
//                                        .map(route->route.getContract())
//                                        .collect(Collectors.toList());
//        System.out.println(contracts);
//
//
//
//       List<User> details =  routes.stream()
//                .filter(r->r.getContract()==true)
//                .map(route->route.getDetails())
//                .collect(Collectors.toList());
//       System.out.println(details);
//
//        String[] myArray = { "this", "is", "a", "sentence" };
//        String result = Arrays.stream(myArray)
//                .reduce("", (a,b) -> a + b);
//        System.out.println(result);


    }
}
