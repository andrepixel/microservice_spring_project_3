package com.example.microservice_spring_project_3.repositories;

import com.example.microservice_spring_project_3.entities.FreestarEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface FreestarRepository extends
        MongoRepository<FreestarEntity, UUID> {
}
