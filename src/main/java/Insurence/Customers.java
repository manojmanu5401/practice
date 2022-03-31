package Insurence;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter

public class Customers {
    private String cName;
    private Integer cId;
    private Boolean claimFlag;
    private Boolean topUpFlag;

    @Override
    public String toString() {
        return "Customers{" +
                "cName='" + cName + '\'' +
                ", cId=" + cId +
                ", claimFlag=" + claimFlag +
                ", topUpFlag=" + topUpFlag +
                '}';
    }
}
