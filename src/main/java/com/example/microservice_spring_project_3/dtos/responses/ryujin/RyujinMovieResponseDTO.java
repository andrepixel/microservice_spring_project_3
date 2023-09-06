package com.example.microservice_spring_project_3.dtos.requests.ryujin;

import com.example.microservice_spring_project_3.shared.dtos.MovieDTO;
import com.example.microservice_spring_project_3.shared.enums.ClassificationMovie;
import com.example.microservice_spring_project_3.shared.enums.TypeOfMovie;

public class RyujinMovieRequestDTO extends MovieDTO {
    public RyujinMovieRequestDTO() {
    }

    public RyujinMovieRequestDTO(
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
