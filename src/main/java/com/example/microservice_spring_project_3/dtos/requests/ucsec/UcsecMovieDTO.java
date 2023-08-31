package com.example.microservice_spring_project_3.dtos.ucsec;

import com.devandre.microservice_spring_project_1.shared.dtos.MovieDTO;
import com.devandre.microservice_spring_project_1.shared.enums.ClassificationMovie;
import com.devandre.microservice_spring_project_1.shared.enums.TypeOfMovie;

public class UcsecMovieDTO extends MovieDTO {
    public UcsecMovieDTO() {
    }

    public UcsecMovieDTO(
            String name,
            String author,
            String year,
            String company,
            String resume,
            String[] movieCast,
            TypeOfMovie[] typeOfMovie,
            ClassificationMovie classificationMovie
    ) {
        super(
                name,
                author,
                year,
                company,
                resume,
                movieCast,
                typeOfMovie,
                classificationMovie
        );
    }
}
