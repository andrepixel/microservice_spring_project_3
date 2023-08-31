package com.example.microservice_spring_project_3.dtos.ucsec;

import com.devandre.microservice_spring_project_1.shared.dtos.ClientDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.SectionDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.TicketDTO;
import com.devandre.microservice_spring_project_1.shared.enums.ListOfCompanies;
import com.devandre.microservice_spring_project_1.shared.enums.StatusOfTicket;

import java.time.LocalDateTime;
import java.util.UUID;

public class UcsecTicketDTO extends TicketDTO {
    public UcsecTicketDTO(
            UUID id,
            SectionDTO section,
            ClientDTO client,
            LocalDateTime dateOfTicketGenerated,
            StatusOfTicket statusOfTicket,
            ListOfCompanies listOfCompanies
    ) {
        super(
                id,
                section,
                client,
                dateOfTicketGenerated,
                statusOfTicket,
                listOfCompanies
        );
    }
}