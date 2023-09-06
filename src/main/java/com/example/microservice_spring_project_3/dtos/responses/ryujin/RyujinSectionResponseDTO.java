package com.example.microservice_spring_project_3.dtos.requests.ryujin;

import java.time.LocalDateTime;

import com.example.microservice_spring_project_3.shared.dtos.MovieDTO;
import com.example.microservice_spring_project_3.shared.dtos.SectionDTO;
import com.example.microservice_spring_project_3.shared.enums.State;
import com.example.microservice_spring_project_3.shared.enums.TypeSection;

public class RyujinSectionRequestDTO extends SectionDTO {
    public RyujinSectionRequestDTO() {
    }

    public RyujinSectionRequestDTO(
            String codeSection,
            Integer quantityOfArmChair,
            MovieDTO movie,
            LocalDateTime dateOfSection,
            String localOfSection,
            State state,
            Boolean isPreLaunch,
            TypeSection typeSection
    ) {
        super(
                codeSection,
                quantityOfArmChair,
                movie,
                dateOfSection,
                localOfSection,
                state,
                isPreLaunch,
                typeSection
        );
    }
}
