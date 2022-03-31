package lamdaExpressions;

public class Lamda {
    public static void main(String arg[]){
        Runnable hello = () -> System.out.println("Running status: 200 ok");
        hello.run();
    }
}
