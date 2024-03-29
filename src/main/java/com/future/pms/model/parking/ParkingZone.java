package com.future.pms.model.parking;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import static com.future.pms.Constants.OPEN_HOUR;

@Data @Builder @AllArgsConstructor @NoArgsConstructor public class ParkingZone {
    @Id private String idParkingZone;
    private String emailAdmin;
    private String name = "";
    private Double price = 0.0;
    private String openHour = OPEN_HOUR;
    private String address = "";
    private String phoneNumber = "";
    private String imageUrl = "";
    private Double latitude = 0.0;
    private Double longitude = 0.0;
}

