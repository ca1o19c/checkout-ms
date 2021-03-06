package edu.zonework.checkoutms.adpters.outbound.amqp;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.zonework.checkoutms.domain.SaleState;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Getter
@ToString
public class BuyCarEvent {

    @JsonProperty("car_id")
    private String carId;
    @JsonProperty("status")
    private SaleState status;
    @JsonProperty("event_date_time")
    private LocalDateTime eventDateTime;

    public BuyCarEvent(String carId) {
        this.carId = carId;
        this.status = SaleState.SOLD;
        this.eventDateTime = LocalDateTime.now(ZoneId.of("UTC"));
    }
}
