package FunctionalInterface.Sort;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Builder
@Getter
@Setter
public class Employee {
    private String name;
    private int id;
    private Boolean prime;
    private List<Products> items;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", prime=" + prime +
                ", items=" + items+
                '}';
    }
}
