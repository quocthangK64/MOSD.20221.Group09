package com.ict.group06.travelwala.passenger.controller;

import com.ict.group06.travelwala.model.request.PassengerRequest;
import com.ict.group06.travelwala.passenger.service.PassengerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/passengers")
public class PassengerController {
    private final PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @PostMapping()
    public ResponseEntity<?> savePassenger(@RequestBody @Valid PassengerRequest passengerRequest) {
        // TODO
    }
}
