package com.ict.group09.travelwala.passenger.repository;

import com.ict.group09.travelwala.passenger.entity.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends MongoRepository<Passenger, String> {
}
