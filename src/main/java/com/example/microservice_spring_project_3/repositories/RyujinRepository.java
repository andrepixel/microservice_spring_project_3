package com.example.microservice_spring_project_3.repositories;

import com.example.microservice_spring_project_3.entities.RyujinEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface RyujinRepository extends
        MongoRepository<RyujinEntity, UUID> {
}
