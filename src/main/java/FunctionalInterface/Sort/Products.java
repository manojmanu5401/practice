package FunctionalInterface.Sort;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Products {
    private String pName;
    private long price;

    @Override
    public String toString() {
        return "Products{" +
                "pName='" + pName + '\'' +
                ", price=" + price +
                '}';
    }
}

