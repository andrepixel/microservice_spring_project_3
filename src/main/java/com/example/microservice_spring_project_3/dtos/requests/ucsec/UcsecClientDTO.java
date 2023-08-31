package com.example.microservice_spring_project_3.dtos.ucsec;

import com.devandre.microservice_spring_project_1.shared.dtos.AddressDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.ClientDTO;

public class UcsecClientDTO extends ClientDTO {
    public UcsecClientDTO() {
    }

    public UcsecClientDTO(
            String name,
            String age,
            String email,
            String[] phones,
            String cep,
            AddressDTO address
    ) {
        super(
                name,
                age,
                email,
                phones,
                cep,
                address
        );
    }
}