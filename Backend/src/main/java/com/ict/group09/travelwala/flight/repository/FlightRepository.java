package com.ict.group09.travelwala.flight.repository;

import com.ict.group09.travelwala.flight.entity.Flight;
import com.ict.group09.travelwala.flight.model.request.FlightCriteria;
import com.ict.group09.travelwala.common.repository.WalaRepository;

import java.util.List;

public interface FlightRepository extends WalaRepository<Flight, String> {
    List<Flight> findWithCriteria(FlightCriteria flightCriteria);
}
