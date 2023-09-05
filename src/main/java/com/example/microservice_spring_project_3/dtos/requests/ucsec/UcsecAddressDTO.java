package com.example.microservice_spring_project_3.dtos.requests.ucsec;

import com.example.microservice_spring_project_3.shared.dtos.AddressDTO;
import com.example.microservice_spring_project_3.shared.enums.State;

public class UcsecAddressDTO extends AddressDTO {
    public UcsecAddressDTO() {
    }

    public UcsecAddressDTO(
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
