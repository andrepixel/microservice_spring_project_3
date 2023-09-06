package com.example.microservice_spring_project_3.dtos.requests.freestar;

import com.example.microservice_spring_project_3.shared.dtos.AddressDTO;
import com.example.microservice_spring_project_3.shared.enums.State;

public class FreestarAddressRequestDTO extends AddressDTO {
    public FreestarAddressRequestDTO() {
    }

    public FreestarAddressRequestDTO(
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
