package com.example.microservice_spring_project_3.dtos.requests.constellation;

import com.example.microservice_spring_project_3.shared.dtos.ClientDTO;
import com.example.microservice_spring_project_3.shared.dtos.SectionDTO;
import com.example.microservice_spring_project_3.shared.dtos.TicketDTO;
import com.example.microservice_spring_project_3.shared.enums.ListOfCompanies;
import com.example.microservice_spring_project_3.shared.enums.StatusOfTicket;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;


public class FreestarTicketRequestDTO extends TicketDTO {
    @NotBlank
    private UUID tokenGenerated;

    public FreestarTicketRequestDTO(
            SectionDTO section,
            ClientDTO client,
            LocalDateTime dateOfTicketGenerated,
            StatusOfTicket statusOfTicket,
            ListOfCompanies listOfCompanies,
            UUID tokenGenerated
    ) {
        super(
                section,
                client,
                dateOfTicketGenerated,
                statusOfTicket,
                listOfCompanies
        );
        this.tokenGenerated = tokenGenerated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FreestarTicketRequestDTO that = (FreestarTicketRequestDTO) o;
        return Objects.equals(
                tokenGenerated,
                that.tokenGenerated
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                super.hashCode(),
                tokenGenerated
        );
    }

    public UUID getTokenGenerated() {
        return tokenGenerated;
    }

    public void setTokenGenerated(UUID tokenGenerated) {
        this.tokenGenerated = tokenGenerated;
    }
}