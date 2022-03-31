package FunctionalInterface.Sort;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Employee> list = Arrays.asList(
                Employee.builder()
                        .name("Manoj")
                        .id(4)
                        .prime(true)
                        .items(Arrays.asList(
                                Products.builder().pName("product1").price(100).build(),
                                Products.builder().pName("product2").price(200).build(),
                                Products.builder().pName("product7").price(700).build()))
                        .build(),
                Employee.builder().name("alex").id(13).prime(false).items(Arrays.asList(Products.builder().pName("product2").price(200).build(),Products.builder().pName("product5").price(100).build())).build(),
                Employee.builder().name("Rand").id(123).prime(true).items(Arrays.asList(Products.builder().pName("product3").price(300).build())).build()
        );

        Set<String> set = new HashSet<>();
        System.out.println(list.stream().flatMap(p -> p.getItems().stream()).filter(i -> set.add(i.getPName())).collect(Collectors.toList()));


//        list.stream().flatMap(p->p.getItems().stream()).filter(i->i.getPName()).collect(Collectors.toList());
//        list.stream().filter(p->p.getPrime()==true).forEach(l->System.out.println(l));
//        list.stream().filter(p->p.getPrime()==true).map(p->p.getItems()).forEach(l->System.out.println(l));
//        list.stream().flatMap(p->p.getItems().stream()).forEach(System.out::println);
//        var l =list.stream().max(Comparator.comparing(p->p.getItems().size()));
//        var s = list.stream()
//                .flatMap(p->p.getItems().stream())
//                .collect(Collectors.toSet());
//
//        System.out.println(s);
        list.stream().sorted(Comparator.comparing(s->-s.getId())).collect(Collectors.toList()).forEach(s->System.out.println(s));
        list.stream().sorted((o1,o2)->o2.getId()-o1.getId()).collect(Collectors.toList()).forEach(s->System.out.println(s));
        var x =list.stream().sorted().collect(Collectors.toList());
//        System.out.println(x);
//        list.stream().peek()
    }
}
