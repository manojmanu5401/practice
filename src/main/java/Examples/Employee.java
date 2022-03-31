package Examples;

public class Employee {
//    String name;
//    int id;
//    int salary;

    private String name;
    private int id;
    private int salary=10000;
//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

//    public void setSalary(int salary) {
//        this.salary = salary;
//    }

    public void displayEmployee(){
        System.out.println("name: "+name+", id: "+id+", salary: "+salary);
    }
}
