package Examples;

public class interfacemain implements Interface , Interface2{
    @Override
//    array list
    public void display() {
        System.out.println("display");
    }
    @Override
    public void draw() {
        System.out.println("Draw");
    }
    @Override
    public void enter(){
        System.out.println("enter");
    }

    @Override
    public void poll() {

    }

    @Override
    public void indexOf() {

    }

    public static void main(String arg[]){
        interfacemain a = new interfacemain();
        a.display();
    }
}
