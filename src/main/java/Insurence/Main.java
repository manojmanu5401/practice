package Insurence;

import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<Policy> policies = Arrays.asList(
          Policy.builder()
                  .pName("policy1")
                  .pId("p1")
                  .b(true)
                  .customers(Arrays.asList(
                          Customers.builder().cName("Manoj").cId(1).claimFlag(true).topUpFlag(false).build(),
                          Customers.builder().cName("ALex").cId(2).claimFlag(false).topUpFlag(false).build(),
                          Customers.builder().cName("Elena").cId(3).claimFlag(true).topUpFlag(true).build()
                  ))
                  .build(),
                Policy.builder()
                        .pName("policy2")
                        .pId("p2")
                        .b(false)
                        .customers(Arrays.asList(
                                Customers.builder().cName("Sam").cId(4).claimFlag(true).topUpFlag(false).build(),
                                Customers.builder().cName("Manoj").cId(1).claimFlag(false).topUpFlag(false).build(),
                                Customers.builder().cName("rand").cId(5).claimFlag(true).topUpFlag(true).build()
                        ))
                        .build()
        );



        var l = policies.stream()
                        .filter(p->p.getCustomers().stream().anyMatch(i->i.getCName().equals("Manoj")))
                .map(p->p.getPId()).collect(Collectors.toList());
        System.out.println(l);
    }
}
