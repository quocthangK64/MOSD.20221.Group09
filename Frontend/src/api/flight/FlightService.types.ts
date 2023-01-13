export type FlightCriteria = {
    adultCount: number;
    childCount: number;
    infantCount: number;
    departureCity: string;
    departureDate: string;
    arrivalCity: string;
    returnDate: string | null;
    seatClass: string;
  };
  
  export type SearchFlightResponse = {
    departureFlights?: FlightResponse[];
    returnFlights?: FlightResponse[];
  };