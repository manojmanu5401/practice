package FunctionalInterface;

public class Main {
    public static void main(String[] args){
        ExampleFunctionalInterface fun = ()-> System.out.println("Helllo");
        fun.display();
    }
}
