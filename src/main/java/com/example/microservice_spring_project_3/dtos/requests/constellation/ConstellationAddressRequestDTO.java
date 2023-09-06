package com.example.microservice_spring_project_3.dtos.requests.constellation;

import com.example.microservice_spring_project_3.shared.dtos.AddressDTO;
import com.example.microservice_spring_project_3.shared.enums.State;

public class ConstellationAddressDTO extends AddressDTO {
    public ConstellationAddressDTO() {
    }

    public ConstellationAddressDTO(
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
