package com.ict.group09.travelwala.booking.service;

import com.ict.group09.travelwala.booking.model.response.CreateBookingResponse;
import com.ict.group09.travelwala.model.request.CreateBookingRequest;

import javax.validation.Valid;

public interface ICreateBooking {
    CreateBookingResponse createBooking(@Valid CreateBookingRequest bookingRequest);
}
