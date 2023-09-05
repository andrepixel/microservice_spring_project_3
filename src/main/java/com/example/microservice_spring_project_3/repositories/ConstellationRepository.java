package com.example.microservice_spring_project_3.repositories;

import com.example.microservice_spring_project_3.entities.ConstellationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ConstellationRepository extends MongoRepository<ConstellationEntity, UUID> {
}