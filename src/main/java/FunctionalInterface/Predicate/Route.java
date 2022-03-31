package FunctionalInterface.Predicate;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Route {
    private Boolean contract;
    private int hours;
    private Double price;
}
