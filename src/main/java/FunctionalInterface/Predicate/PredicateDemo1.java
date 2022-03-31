package FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateDemo1 implements Predicate<Integer> {
    @Override
    public boolean test(Integer i) {
        if(i%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        PredicateDemo1 pre = new PredicateDemo1();
        System.out.println(pre.test(10));
    }
}
