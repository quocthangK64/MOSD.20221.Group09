export interface BookingRequest {
    createBookingFlightSpecs: CreateBookingFlightSpecs
    bookingContact: BookingContact;
  }

interface CreateBookingFlightSpecs {
    travellerSpecs: TravellerSpecs
    flightProductSpecs: FlightProductSpecs
}
