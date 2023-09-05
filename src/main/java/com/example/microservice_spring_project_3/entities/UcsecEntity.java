package com.example.microservice_spring_project_3.entities;

import com.example.microservice_spring_project_3.shared.dtos.ClientDTO;
import com.example.microservice_spring_project_3.shared.dtos.SectionDTO;
import com.example.microservice_spring_project_3.shared.enums.ListOfCompanies;
import com.example.microservice_spring_project_3.shared.enums.StatusOfTicket;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Document
public class UcsecEntity {
    @Id
    private UUID id;
    private SectionDTO section;
    private ClientDTO client;
    private LocalDateTime dateOfTicketGenerated;
    private StatusOfTicket statusOfTicket;
    private ListOfCompanies listOfCompanies;

    public UcsecEntity(
            UUID id, SectionDTO section, ClientDTO client,
            LocalDateTime dateOfTicketGenerated, StatusOfTicket statusOfTicket,
            ListOfCompanies listOfCompanies
    ) {
        this.id = id;
        this.section = section;
        this.client = client;
        this.dateOfTicketGenerated = dateOfTicketGenerated;
        this.statusOfTicket = statusOfTicket;
        this.listOfCompanies = listOfCompanies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UcsecEntity that = (UcsecEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(
                section, that.section) && Objects.equals(
                client, that.client) && Objects.equals(
                dateOfTicketGenerated,
                that.dateOfTicketGenerated
        ) && statusOfTicket == that.statusOfTicket && listOfCompanies == that.listOfCompanies;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, section, client, dateOfTicketGenerated,
                            statusOfTicket, listOfCompanies
        );
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public SectionDTO getSection() {
        return section;
    }

    public void setSection(
            SectionDTO section
    ) {
        this.section = section;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(
            ClientDTO client
    ) {
        this.client = client;
    }

    public LocalDateTime getDateOfTicketGenerated() {
        return dateOfTicketGenerated;
    }

    public void setDateOfTicketGenerated(LocalDateTime dateOfTicketGenerated) {
        this.dateOfTicketGenerated = dateOfTicketGenerated;
    }

    public StatusOfTicket getStatusOfTicket() {
        return statusOfTicket;
    }

    public void setStatusOfTicket(
            StatusOfTicket statusOfTicket
    ) {
        this.statusOfTicket = statusOfTicket;
    }

    public ListOfCompanies getListOfCompanies() {
        return listOfCompanies;
    }

    public void setListOfCompanies(
            ListOfCompanies listOfCompanies
    ) {
        this.listOfCompanies = listOfCompanies;
    }

    @Override
    public String toString() {
        return "UcsecEntity{" +
                "id=" + id +
                ", section=" + section +
                ", client=" + client +
                ", dateOfTicketGenerated=" + dateOfTicketGenerated +
                ", statusOfTicket=" + statusOfTicket +
                ", listOfCompanies=" + listOfCompanies +
                '}';
    }
}
