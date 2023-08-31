package com.example.microservice_spring_project_3.dtos.ryujin;

import com.devandre.microservice_spring_project_1.shared.dtos.AddressDTO;
import com.devandre.microservice_spring_project_1.shared.enums.State;

public class RyujinAddressDTO extends AddressDTO {
    public RyujinAddressDTO() {
    }

    public RyujinAddressDTO(
            String typeLocal,
            String number,
            String city,
            State state
    ) {
        super(
                typeLocal,
                number,
                city,
                state
        );
    }
}
