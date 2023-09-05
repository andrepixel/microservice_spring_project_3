package com.example.microservice_spring_project_3.repositories;

import com.example.microservice_spring_project_3.entities.UcsecEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface UcsecRepository extends
        MongoRepository<UcsecEntity, UUID> {
}
