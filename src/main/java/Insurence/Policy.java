package Insurence;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class Policy {
    private String pName;
    private String pId;
    private Boolean b;
    private List<Customers> customers;

    @Override
    public String toString() {
        return "Policy{" +
                "pName='" + pName + '\'' +
                ", pId='" + pId + '\'' +
                ", customers=" + customers +
                '}';
    }
}
