package com.example.microservice_spring_project_3.dtos.requests.ryujin;

import com.example.microservice_spring_project_3.shared.dtos.AddressDTO;
import com.example.microservice_spring_project_3.shared.dtos.ClientDTO;

public class RyujinClientRequestDTO extends ClientDTO {
    public RyujinClientRequestDTO() {
    }

    public RyujinClientRequestDTO(
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
