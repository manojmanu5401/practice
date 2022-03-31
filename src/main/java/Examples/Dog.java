package Examples;

public class Dog extends Animal {
    Dog(int n, String name) {
        super(n, name);
    }
    public void display(){
        System.out.println(super.name);
        super.display();
    }
}
