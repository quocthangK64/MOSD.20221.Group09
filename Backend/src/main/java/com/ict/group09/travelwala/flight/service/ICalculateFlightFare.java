package com.ict.group09.travelwala.flight.service;

import com.ict.group09.travelwala.common.enumeration.seatclass.SeatClassEnum;
import com.ict.group09.travelwala.ticket.enumeration.TicketEnum;

public interface ICalculateFlightFare {
    Double getFlightFare(TicketEnum ticketType, SeatClassEnum seatClass, String flightId);
}
