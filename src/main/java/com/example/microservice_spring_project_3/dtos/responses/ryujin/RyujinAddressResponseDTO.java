package com.example.microservice_spring_project_3.dtos.requests.ryujin;

import com.example.microservice_spring_project_3.shared.dtos.AddressDTO;
import com.example.microservice_spring_project_3.shared.enums.State;

public class RyujinAddressRequestDTO extends AddressDTO {
    public RyujinAddressRequestDTO() {
    }

    public RyujinAddressRequestDTO(
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
