package com.example.microservice_spring_project_3.dtos.requests.freestar;

import com.example.microservice_spring_project_3.shared.dtos.ClientDTO;
import com.example.microservice_spring_project_3.shared.dtos.SectionDTO;
import com.example.microservice_spring_project_3.shared.dtos.TicketDTO;
import com.example.microservice_spring_project_3.shared.enums.ListOfCompanies;
import com.example.microservice_spring_project_3.shared.enums.StatusOfTicket;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Validated
public class FreestarTicketRequestDTO extends TicketDTO {
    private String companyGenerateTicket;

    public FreestarTicketRequestDTO(
            UUID id,
            SectionDTO section,
            ClientDTO client,
            LocalDateTime dateOfTicketGenerated,
            StatusOfTicket statusOfTicket,
            ListOfCompanies listOfCompanies,
            String companyGenerateTicket
    ) {
        super(
                id,
                section,
                client,
                dateOfTicketGenerated,
                statusOfTicket,
                listOfCompanies
        );
        this.companyGenerateTicket = companyGenerateTicket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FreestarTicketRequestDTO that = (FreestarTicketRequestDTO) o;
        return Objects.equals(
                companyGenerateTicket,
                that.companyGenerateTicket
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                super.hashCode(),
                companyGenerateTicket
        );
    }

    public String getCompanyGenerateTicket() {
        return companyGenerateTicket;
    }

    public void setCompanyGenerateTicket(String companyGenerateTicket) {
        this.companyGenerateTicket = companyGenerateTicket;
    }

    @Override
    public String toString() {
        return "FreestarTicketDTO{" +
                "companyGenerateTicket='" + companyGenerateTicket + '\'' +
                '}';
    }
}