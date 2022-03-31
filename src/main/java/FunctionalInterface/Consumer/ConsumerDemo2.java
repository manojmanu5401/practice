package FunctionalInterface.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2 {
    public static void main(String[] args){
        Consumer<String> st = (t)->System.out.println(t);
        st.accept("abs");


        List<String> list = Arrays.asList("abc","asd","wer");
        list.stream().forEach(st);


        list.stream().forEach(t->System.out.println(t));

    }
}
