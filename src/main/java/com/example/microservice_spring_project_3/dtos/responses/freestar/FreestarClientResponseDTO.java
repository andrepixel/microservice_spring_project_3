package com.example.microservice_spring_project_3.dtos.requests.freestar;

import com.example.microservice_spring_project_3.shared.dtos.AddressDTO;
import com.example.microservice_spring_project_3.shared.dtos.ClientDTO;

public class FreestarClientRequestDTO extends ClientDTO {
    public FreestarClientRequestDTO() {
    }

    public FreestarClientRequestDTO(
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
