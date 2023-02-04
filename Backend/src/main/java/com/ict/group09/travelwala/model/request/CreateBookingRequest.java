package com.ict.group09.travelwala.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CreateBookingRequest {
    private CreateBookingFlightSpecs createBookingFlightSpecs;

    @JsonProperty("bookingContact")
    @NotNull(message = "Please provide booking contact")
    private ContactRequest contactRequest;
}
