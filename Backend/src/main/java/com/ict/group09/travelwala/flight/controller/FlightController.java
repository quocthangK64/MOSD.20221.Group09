package com.ict.group09.travelwala.flight.controller;

import com.ict.group09.travelwala.common.exception.RecordNotFoundException;
import com.ict.group09.travelwala.flight.model.request.FlightCriteria;
import com.ict.group09.travelwala.model.response.FlightResponse;
import com.ict.group09.travelwala.flight.service.FlightService;
import com.ict.group09.travelwala.flight.model.request.FlightRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/flights")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    // TODO
}
