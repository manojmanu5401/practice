package FunctionalInterface;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Routes {
    private Boolean contract;
    private int hours;
    private Double price;
}
