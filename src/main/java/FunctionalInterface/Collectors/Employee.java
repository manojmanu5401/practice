package FunctionalInterface.Collectors;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter

public class Employee {
    private String name;
    private String place;
    private int id;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", id=" + id +
                '}';
    }
}
