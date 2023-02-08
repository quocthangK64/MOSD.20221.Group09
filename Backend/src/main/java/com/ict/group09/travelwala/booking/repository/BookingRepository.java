package com.ict.group09.travelwala.booking.repository;

import com.ict.group09.travelwala.booking.entity.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking, String> {
}
