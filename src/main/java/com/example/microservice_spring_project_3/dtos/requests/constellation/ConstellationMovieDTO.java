package com.example.microservice_spring_project_3.dtos.requests.constellation;

import com.example.microservice_spring_project_3.shared.dtos.MovieDTO;
import com.example.microservice_spring_project_3.shared.enums.ClassificationMovie;
import com.example.microservice_spring_project_3.shared.enums.TypeOfMovie;

public class ConstellationMovieDTO extends MovieDTO {
    public ConstellationMovieDTO() {
    }

    public ConstellationMovieDTO(
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
