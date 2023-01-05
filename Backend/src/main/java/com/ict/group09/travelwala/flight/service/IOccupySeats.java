package com.ict.group09.travelwala.flight.service;

import com.ict.group09.travelwala.common.enumeration.seatclass.SeatClassEnum;

public interface IOccupySeats {
    void occupy(String flightId, int numberOfSeats, SeatClassEnum seatClass);
}
