package com.ict.group09.travelwala.flight.repository;

import com.ict.group09.travelwala.flight.entity.Plane;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlaneRepository extends MongoRepository<Plane, String> {
}
