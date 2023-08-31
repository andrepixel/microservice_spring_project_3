package com.example.microservice_spring_project_3.dtos.freestar;

import com.devandre.microservice_spring_project_1.shared.dtos.MovieDTO;
import com.devandre.microservice_spring_project_1.shared.dtos.SectionDTO;
import com.devandre.microservice_spring_project_1.shared.enums.State;
import com.devandre.microservice_spring_project_1.shared.enums.TypeSection;

import java.time.LocalDateTime;

public class FreestarSectionDTO extends SectionDTO {
    public FreestarSectionDTO() {
    }

    public FreestarSectionDTO(
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
