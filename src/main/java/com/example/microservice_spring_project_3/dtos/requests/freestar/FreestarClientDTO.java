package com.example.microservice_spring_project_3.dtos.freestar;

import com.devandre.microservice_spring_project_1.shared.dtos.AddressDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.ClientDTO;

public class FreestarClientDTO extends ClientDTO {
    public FreestarClientDTO() {
    }

    public FreestarClientDTO(
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
