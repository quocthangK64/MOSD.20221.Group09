package com.ict.group09.travelwala.flight.service;

import com.ict.group09.travelwala.flight.model.request.FlightCriteria;
import com.ict.group09.travelwala.model.response.FlightResponse;
import com.ict.group09.travelwala.flight.model.request.FlightRequest;
import com.ict.group09.travelwala.flight.model.response.SearchFlightResponse;

public interface FlightService {
    SearchFlightResponse findAll(FlightCriteria flightCriteria);
    FlightResponse findById(String id);
    FlightResponse createNewFlight(FlightRequest flightRequest);
    FlightResponse updateFlight(String id, FlightRequest flightRequest);
}
