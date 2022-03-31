package FunctionalInterface.Collectors;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Students {
    private String name;
    private int age;
    private String email;
}
