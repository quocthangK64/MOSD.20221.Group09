export interface BookingRequest {
    createBookingFlightSpecs: CreateBookingFlightSpecs
    bookingContact: BookingContact;
  }

interface CreateBookingFlightSpecs {
    travellerSpecs: TravellerSpecs
    flightProductSpecs: FlightProductSpecs
}
interface FlightProductSpecs {
  departureFlightId: string
  returnFlightId: string
  seatClass: string
  adultCount: number
  childCount: number
  infantCount: number
}

interface TravellerSpecs {
  adultFormData: TravelerDataForm[]
  childFormData: TravelerDataForm[]
  infantFormData: TravelerDataForm[]
}

interface TravelerDataForm {
  title: string
  firstName: string
  lastName: string
  dob: DateOfBirth
  nationality: string
}